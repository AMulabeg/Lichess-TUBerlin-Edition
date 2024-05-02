package views.site

import lila.api.Context
import lila.app.UiEnv.{ *, given }

object message:

  def apply(
      title: String,
      back: Option[String] = None,
      icon: Option[Icon] = None
  )(using Context) =
    Page(title).wrap: body =>
      main(cls := "box box-pad")(
        boxTop(
          h1(dataIcon := icon.ifTrue(back.isEmpty), cls := List("text" -> (icon.isDefined && back.isEmpty)))(
            back.map: url =>
              a(href := url, dataIcon := Icon.LessThan, cls := "text"),
            title
          )
        ),
        p(body)
      )

  def noBot(using Context) = apply("No bot area"):
    frag("Sorry, bot accounts are not allowed here.")

  def noEngine(using Context) = apply("No engine area"):
    "Sorry, engine assisted players are not allowed here."

  def noBooster(using Context) = apply("No booster area"):
    "Sorry, boosters and sandbaggers are not allowed here."

  def noLame(using Context)(using me: Me) =
    if me.marks.boost then noBooster
    if me.marks.engine then noEngine
    else // ?
      apply("Restricted area"):
        "Sorry, the access to this resource is restricted."

  def blacklistedMessage(using ctx: Context) =
    s"Sorry, your IP address ${ctx.ip} has been used to violate the ToS, and is now blacklisted."

  def blacklistedSnippet(using Context) = Snippet(frag(blacklistedMessage))

  def privateStudy(study: lila.study.Study)(using Context) =
    apply(
      title = s"${titleNameOrId(study.ownerId)}'s study",
      back = routes.Study.allDefault().url.some
    ):
      frag(
        "Sorry! This study is private, you cannot access it.",
        isGranted(_.StudyAdmin).option(
          postForm(action := routes.Study.admin(study.id))(
            submitButton("View as admin")(cls := "button button-red")
          )
        )
      )

  def streamingMod(using Context) = apply("Disabled while streaming"):
    frag(
      "This moderation feature is disabled while streaming, ",
      "to avoid leaking sensible information."
    )

  def challengeDenied(msg: String)(using Context) =
    apply(
      title = trans.challenge.challengeToPlay.txt(),
      back = routes.Lobby.home.url.some
    )(msg)

  def insightNoGames(u: User)(using Context) =
    apply(
      title = s"${u.username} has not played a rated game yet!",
      back = routes.User.show(u.id).url.some
    ):
      frag(
        "Before using chess insights,",
        userLink(u),
        " has to play at least one rated game."
      )

  def teamCreateLimit(using Context) = apply("Cannot create a team"):
    "You have already created a team this week."

  def teamJoinLimit(using Context) = apply("Cannot join the team"):
    "You have already joined too many teams."

  def authFailed(using Context) = apply("403 - Access denied!"):
    "You tried to visit a page you're not authorized to access."

  def serverError(msg: String)(using Context) = apply("Something went wrong")(msg)

  def temporarilyDisabled(using Context) = apply("Temporarily disabled"):
    "Sorry, this feature is temporarily disabled while we figure out a way to bring it back."

  def rateLimited(msg: String = "Too many requests")(using Context) = apply(msg):
    "Your device or network has sent too many requests in a short amount of time. Please try again later."

  def notYet(text: String)(using Context) =
    apply("Not yet available")(text)
