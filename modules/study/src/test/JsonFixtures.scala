package lila.study

object JsonFixtures:
  val j1 = """
[{"ply":0,"fen":"rnbqkbnr/pppppppp/8/8/8/8/PPPPPPPP/RNBQKBNR w KQkq - 0 1","comments":[{"id":"i","text":"Root comment","by":"lichess"}],"dests":"ksA owE bqs gvx jrz nvD muC ltB iqy pxF","children":[{"ply":1,"fen":"rnbqkbnr/pppppppp/8/8/3P4/8/PPP1PPPP/RNBQKBNR b KQkq - 0 1","id":".>","uci":"d2d4","san":"d4","glyphs":[{"id":4,"symbol":"??","name":"Blunder"}],"children":[{"ply":2,"fen":"rnbqkbnr/ppp1pppp/8/3p4/3P4/8/PPP1PPPP/RNBQKBNR w KQkq - 0 2","id":"VF","uci":"d7d5","san":"d5","comments":[{"id":"i","text":"d5 is a good move","by":"lichess"}],"glyphs":[{"id":146,"symbol":"N","name":"Novelty"}],"children":[]}]},{"ply":1,"fen":"rnbqkbnr/pppppppp/8/8/2P5/8/PP1PPPPP/RNBQKBNR b KQkq - 0 1","id":"-=","uci":"c2c4","san":"c4","comments":[{"id":"i","text":"and","by":"lichess"}],"children":[]},{"ply":1,"fen":"rnbqkbnr/pppppppp/8/8/5P2/8/PPPPP1PP/RNBQKBNR b KQkq - 0 1","id":"0@","uci":"f2f4","san":"f4","comments":[{"id":"i","text":"best","by":"lichess"}],"children":[]}]},{"ply":1,"fen":"rnbqkbnr/pppppppp/8/8/4P3/8/PPPP1PPP/RNBQKBNR b KQkq - 0 1","id":"/?","uci":"e2e4","san":"e4","glyphs":[{"id":1,"symbol":"!","name":"Good move"},{"id":16,"symbol":"±","name":"White is better"},{"id":40,"symbol":"→","name":"Attack"},{"id":32,"symbol":"↑↑","name":"Development"}]},{"ply":2,"fen":"rnbqkbnr/pppp1ppp/4p3/8/4P3/8/PPPP1PPP/RNBQKBNR w KQkq - 0 2","id":"WO","uci":"e7e6","san":"e6","comments":[{"id":"i","text":"e6 is a naughty move","by":"lichess"}],"glyphs":[{"id":6,"symbol":"?!","name":"Dubious move"}]}]
 """.trim

  val j2 = """
[{"ply":0,"fen":"rnbqkbnr/pppppppp/8/8/8/8/PPPPPPPP/RNBQKBNR w KQkq - 0 1","comments":[{"id":"i","text":"Root comment","by":"lichess"}],"dests":"ksA owE bqs gvx jrz nvD muC ltB iqy pxF","children":[{"ply":1,"fen":"rnbqkbnr/pppppppp/8/8/3P4/8/PPP1PPPP/RNBQKBNR b KQkq - 0 1","id":".>","uci":"d2d4","san":"d4","glyphs":[{"id":4,"symbol":"??","name":"Blunder"}],"children":[{"ply":2,"fen":"rnbqkbnr/ppp1pppp/8/3p4/3P4/8/PPP1PPPP/RNBQKBNR w KQkq - 0 2","id":"VF","uci":"d7d5","san":"d5","comments":[{"id":"i","text":"d5 is a good move","by":"lichess"}],"glyphs":[{"id":146,"symbol":"N","name":"Novelty"}],"children":[{"ply":3,"fen":"rnbqkbnr/ppp1pppp/8/3p4/2PP4/8/PP2PPPP/RNBQKBNR b KQkq - 0 2","id":"-=","uci":"c2c4","san":"c4","children":[{"ply":4,"fen":"rnbqkbnr/pp2pppp/8/2pp4/2PP4/8/PP2PPPP/RNBQKBNR w KQkq - 0 3","id":"UE","uci":"c7c5","san":"c5","children":[]}]},{"ply":3,"fen":"rnbqkbnr/ppp1pppp/8/3p4/3P4/5N2/PPP1PPPP/RNBQKB1R b KQkq - 1 2","id":")8","uci":"g1f3","san":"Nf3","children":[]},{"ply":3,"fen":"rnbqkbnr/ppp1pppp/8/3p4/3P4/6P1/PPP1PP1P/RNBQKBNR b KQkq - 0 2","id":"19","uci":"g2g3","san":"g3","children":[]}]}]},{"ply":1,"fen":"rnbqkbnr/pppppppp/8/8/2P5/8/PP1PPPPP/RNBQKBNR b KQkq - 0 1","id":"-=","uci":"c2c4","san":"c4","comments":[{"id":"i","text":"and","by":"lichess"}],"children":[]},{"ply":1,"fen":"rnbqkbnr/pppppppp/8/8/5P2/8/PPPPP1PP/RNBQKBNR b KQkq - 0 1","id":"0@","uci":"f2f4","san":"f4","comments":[{"id":"i","text":"best","by":"lichess"}],"children":[]}]},{"ply":1,"fen":"rnbqkbnr/pppppppp/8/8/4P3/8/PPPP1PPP/RNBQKBNR b KQkq - 0 1","id":"/?","uci":"e2e4","san":"e4","glyphs":[{"id":1,"symbol":"!","name":"Good move"},{"id":16,"symbol":"±","name":"White is better"},{"id":40,"symbol":"→","name":"Attack"},{"id":32,"symbol":"↑↑","name":"Development"}]},{"ply":2,"fen":"rnbqkbnr/pppp1ppp/4p3/8/4P3/8/PPPP1PPP/RNBQKBNR w KQkq - 0 2","id":"WO","uci":"e7e6","san":"e6","comments":[{"id":"i","text":"e6 is a naughty move","by":"lichess"}],"glyphs":[{"id":6,"symbol":"?!","name":"Dubious move"}]}]""".trim

  val j3 = """
[{"ply":0,"fen":"rnbqkbnr/pppppppp/8/8/8/8/PPPPPPPP/RNBQKBNR w KQkq - 0 1","dests":"ksA owE bqs gvx jrz nvD muC ltB iqy pxF"},{"ply":1,"fen":"rnbqkbnr/pppppppp/8/8/3P4/8/PPP1PPPP/RNBQKBNR b KQkq - 0 1","id":".>","uci":"d2d4","san":"d4"},{"ply":2,"fen":"rnbqkbnr/ppp1pppp/8/3p4/3P4/8/PPP1PPPP/RNBQKBNR w KQkq - 0 2","id":"VF","uci":"d7d5","san":"d5"},{"ply":3,"fen":"rnbqkbnr/ppp1pppp/8/3p4/3PP3/8/PPP2PPP/RNBQKBNR b KQkq - 0 2","id":"/?","uci":"e2e4","san":"e4"},{"ply":4,"fen":"rnbqkbnr/ppp2ppp/8/3pp3/3PP3/8/PPP2PPP/RNBQKBNR w KQkq - 0 3","id":"WG","uci":"e7e5","san":"e5"}]
""".trim

  val j4 = """
[{"ply":0,"fen":"rnbqkbnr/pppppppp/8/8/8/8/PPPPPPPP/RNBQKBNR w KQkq - 0 1","comments":[{"id":"i","text":"this is a study without moves","by":{"id":"nt9","name":"nt9"}}],"dests":"ksA owE bqs gvx jrz nvD muC ltB iqy pxF"}]
""".trim

  val j5 = """
[{"ply":0,"fen":"rnbqkbnr/pppppppp/8/8/8/8/PPPPPPPP/RNBQKBNR w KQkq - 0 1","comments":[{"id":"i","text":"shape glyphs","by":{"id":"nt9","name":"nt9"}}],"dests":"ksA owE bqs gvx jrz nvD muC ltB iqy pxF"},{"ply":1,"fen":"rnbqkbnr/pppppppp/8/8/3P4/8/PPP1PPPP/RNBQKBNR b KQkq - 0 1","id":".>","uci":"d2d4","san":"d4","children":[{"ply":2,"fen":"rnbqkbnr/ppppp1pp/5p2/8/3P4/8/PPP1PPPP/RNBQKBNR w KQkq - 0 2","id":"XP","uci":"f7f6","san":"f6","children":[{"ply":3,"fen":"rnbqkbnr/ppppp1pp/5p2/8/3P4/2P5/PP2PPPP/RNBQKBNR b KQkq - 0 2","id":"-5","uci":"c2c3","san":"c3","comments":[{"id":"i","text":"jjjjjjjj","by":{"id":"nt9","name":"nt9"}}],"glyphs":[{"id":4,"symbol":"??","name":"Blunder"},{"id":15,"symbol":"⩱","name":"Black is slightly better"},{"id":138,"symbol":"⊕","name":"Time trouble"},{"id":36,"symbol":"↑","name":"Initiative"}],"shapes":[{"brush":"green","orig":"d7"},{"brush":"red","orig":"e7"},{"brush":"blue","orig":"f6"},{"brush":"yellow","orig":"h7"},{"brush":"yellow","orig":"b7"},{"brush":"green","orig":"h4","dest":"f4"},{"brush":"green","orig":"f2","dest":"e4"}],"children":[]},{"ply":3,"fen":"rnbqkbnr/ppppp1pp/5p2/8/3P3P/8/PPP1PPP1/RNBQKBNR b KQkq - 0 2","id":"2B","uci":"h2h4","san":"h4","children":[]}]}]},{"ply":2,"fen":"rnbqkbnr/pp1ppppp/2p5/8/3P4/8/PPP1PPPP/RNBQKBNR w KQkq - 0 2","id":"UM","uci":"c7c6","san":"c6"},{"ply":3,"fen":"rnbqkbnr/pp1ppppp/2p5/8/3P1P2/8/PPP1P1PP/RNBQKBNR b KQkq - 0 2","id":"0@","uci":"f2f4","san":"f4"},{"ply":4,"fen":"rnbqkbnr/pp1pppp1/2p5/7p/3P1P2/8/PPP1P1PP/RNBQKBNR w KQkq - 0 3","id":"ZJ","uci":"h7h5","san":"h5"},{"ply":5,"fen":"rnbqkbnr/pp1pppp1/2p5/7p/3P1P1P/8/PPP1P1P1/RNBQKBNR b KQkq - 0 3","id":"2B","uci":"h2h4","san":"h4","shapes":[{"brush":"blue","orig":"d4"},{"brush":"green","orig":"f4"},{"brush":"green","orig":"f7"},{"brush":"green","orig":"c2","dest":"c4"},{"brush":"green","orig":"d2","dest":"e4"}]}]
  """.trim

  val j6 = """
[{"ply":3,"fen":"rnbqkbnr/pp1ppppp/2p5/8/3P1P2/8/PPP1P1PP/RNBQKBNR b KQkq - 0 2","comments":[{"id":"i","text":"custom position with Black to move","by":{"id":"nt9","name":"nt9"}}],"dests":"QI 0KS 5O 1LT 7GPY WGO 3NV ZJR !TV 2MU XHP"},{"ply":4,"fen":"rnbqkbnr/pp1pppp1/2p5/7p/3P1P2/8/PPP1P1PP/RNBQKBNR w KQkq - 0 3","id":"ZJ","uci":"h7h5","san":"h5"},{"ply":5,"fen":"rnbqkbnr/pp1pppp1/2p5/7p/1P1P1P2/8/P1P1P1PP/RNBQKBNR b KQkq - 0 3","id":",<","uci":"b2b4","san":"b4"}]
  """.trim

  val j7 = """
[{"ply":0,"fen":"rnbqkbnr/pppppppp/8/8/8/8/PPPPPPPP/RNBQKBNR w KQkq - 0 1","dests":"ksA owE bqs gvx jrz nvD muC ltB iqy pxF"},{"ply":1,"fen":"rnbqkbnr/pppppppp/8/8/4P3/8/PPPP1PPP/RNBQKBNR b KQkq - 0 1","id":"/?","uci":"e2e4","san":"e4"},{"ply":2,"fen":"rnbqkbnr/pppp1ppp/8/4p3/4P3/8/PPPP1PPP/RNBQKBNR w KQkq - 0 2","id":"WG","uci":"e7e5","san":"e5"},{"ply":3,"fen":"rnbqkbnr/pppp1ppp/8/4p3/4P3/5N2/PPPP1PPP/RNBQKB1R b KQkq - 1 2","id":")8","uci":"g1f3","san":"Nf3"},{"ply":4,"fen":"r1bqkbnr/pppp1ppp/2n5/4p3/4P3/5N2/PPPP1PPP/RNBQKB1R w KQkq - 2 3","id":"\\M","uci":"b8c6","san":"Nc6"},{"ply":5,"fen":"r1bqkbnr/pppp1ppp/2n5/1B2p3/4P3/5N2/PPPP1PPP/RNBQK2R b KQkq - 3 3","id":"(D","uci":"f1b5","san":"Bb5"},{"ply":6,"fen":"r1bqkb1r/pppp1ppp/2n2n2/1B2p3/4P3/5N2/PPPP1PPP/RNBQK2R w KQkq - 4 4","id":"aP","uci":"g8f6","san":"Nf6"},{"ply":7,"fen":"r1bqkb1r/pppp1ppp/2n2n2/1B2p3/4P3/3P1N2/PPP2PPP/RNBQK2R b KQkq - 0 4","id":".6","uci":"d2d3","san":"d3"},{"ply":8,"fen":"r1bqk2r/pppp1ppp/2n2n2/1Bb1p3/4P3/3P1N2/PPP2PPP/RNBQK2R w KQkq - 1 5","id":"`E","uci":"f8c5","san":"Bc5"},{"ply":9,"fen":"r1bqk2r/pppp1ppp/2B2n2/2b1p3/4P3/3P1N2/PPP2PPP/RNBQK2R b KQkq - 0 5","id":"DM","uci":"b5c6","san":"Bxc6"},{"ply":10,"fen":"r1bqk2r/ppp2ppp/2p2n2/2b1p3/4P3/3P1N2/PPP2PPP/RNBQK2R w KQkq - 0 6","id":"VM","uci":"d7c6","san":"dxc6"},{"ply":11,"fen":"r1bqk2r/ppp2ppp/2p2n2/2b1p3/4P3/3P1N2/PPP2PPP/RNBQ1RK1 b kq - 1 6","id":"'*","uci":"e1h1","san":"O-O"},{"ply":12,"fen":"r1bqk2r/pppn1ppp/2p5/2b1p3/4P3/3P1N2/PPP2PPP/RNBQ1RK1 w kq - 2 7","id":"PV","uci":"f6d7","san":"Nd7"},{"ply":13,"fen":"r1bqk2r/pppn1ppp/2p5/2b1p3/4P3/3P1N1P/PPP2PP1/RNBQ1RK1 b kq - 0 7","id":"2:","uci":"h2h3","san":"h3"},{"ply":14,"fen":"r1bq1rk1/pppn1ppp/2p5/2b1p3/4P3/3P1N1P/PPP2PP1/RNBQ1RK1 w - - 1 8","id":"_b","uci":"e8h8","san":"O-O"},{"ply":15,"fen":"r1bq1rk1/pppn1ppp/2p5/2b1p3/4P3/2NP1N1P/PPP2PP1/R1BQ1RK1 b - - 2 8","id":"$5","uci":"b1c3","san":"Nc3"},{"ply":16,"fen":"r1bq1rk1/1ppn1ppp/2p5/p1b1p3/4P3/2NP1N1P/PPP2PP1/R1BQ1RK1 w - - 0 9","id":"SC","uci":"a7a5","san":"a5"},{"ply":17,"fen":"r1bq1rk1/1ppn1ppp/2p5/p1b1p3/P3P3/2NP1N1P/1PP2PP1/R1BQ1RK1 b - - 0 9","id":"+;","uci":"a2a4","san":"a4"},{"ply":18,"fen":"r1bq1rk1/1ppn2pp/2p2p2/p1b1p3/P3P3/2NP1N1P/1PP2PP1/R1BQ1RK1 w - - 0 10","id":"XP","uci":"f7f6","san":"f6"},{"ply":19,"fen":"r1bq1rk1/1ppn2pp/2p2p2/p1b1p3/P3P3/2NP1N1P/1PP1QPP1/R1B2RK1 b - - 1 10","id":"&/","uci":"d1e2","san":"Qe2"},{"ply":20,"fen":"r1bqr1k1/1ppn2pp/2p2p2/p1b1p3/P3P3/2NP1N1P/1PP1QPP1/R1B2RK1 w - - 2 11","id":"`_","uci":"f8e8","san":"Re8"},{"ply":21,"fen":"r1bqr1k1/1ppn2pp/2p2p2/p1b1p3/P3P3/2NPBN1P/1PP1QPP1/R4RK1 b - - 3 11","id":"%7","uci":"c1e3","san":"Be3"},{"ply":22,"fen":"r1bqr1k1/1ppn2pp/2pb1p2/p3p3/P3P3/2NPBN1P/1PP1QPP1/R4RK1 w - - 4 12","id":"EN","uci":"c5d6","san":"Bd6"},{"ply":23,"fen":"r1bqr1k1/1ppn2pp/2pb1p2/p3p3/P3P3/2NPB2P/1PPNQPP1/R4RK1 b - - 5 12","id":"8.","uci":"f3d2","san":"Nd2"},{"ply":24,"fen":"r1bqrnk1/1pp3pp/2pb1p2/p3p3/P3P3/2NPB2P/1PPNQPP1/R4RK1 w - - 6 13","id":"V`","uci":"d7f8","san":"Nf8"},{"ply":25,"fen":"r1bqrnk1/1pp3pp/2pb1p2/p3p3/P3P3/2NPBP1P/1PPNQ1P1/R4RK1 b - - 0 13","id":"08","uci":"f2f3","san":"f3"},{"ply":26,"fen":"r1bqr1k1/1pp3pp/2pb1pn1/p3p3/P3P3/2NPBP1P/1PPNQ1P1/R4RK1 w - - 1 14","id":"`Q","uci":"f8g6","san":"Ng6"},{"ply":27,"fen":"r1bqr1k1/1pp3pp/2pb1pn1/p3p3/P3P3/2NPBP1P/1PPN1QP1/R4RK1 b - - 2 14","id":"/0","uci":"e2f2","san":"Qf2"},{"ply":28,"fen":"r2qr1k1/1pp3pp/2pbbpn1/p3p3/P3P3/2NPBP1P/1PPN1QP1/R4RK1 w - - 3 15","id":"]O","uci":"c8e6","san":"Be6"},{"ply":29,"fen":"r2qr1k1/1pp3pp/2pbbpn1/p3p3/P3P3/3PBP1P/1PPNNQP1/R4RK1 b - - 4 15","id":"5/","uci":"c3e2","san":"Ne2"},{"ply":30,"fen":"r3r1k1/1ppq2pp/2pbbpn1/p3p3/P3P3/3PBP1P/1PPNNQP1/R4RK1 w - - 5 16","id":"^V","uci":"d8d7","san":"Qd7"},{"ply":31,"fen":"r3r1k1/1ppq2pp/2pbbpn1/p3p3/P3P3/1P1PBP1P/2PNNQP1/R4RK1 b - - 0 16","id":",4","uci":"b2b3","san":"b3"},{"ply":32,"fen":"r3r1k1/1ppq2pp/2p1bpn1/p3p3/Pb2P3/1P1PBP1P/2PNNQP1/R4RK1 w - - 1 17","id":"N<","uci":"d6b4","san":"Bb4"},{"ply":33,"fen":"r3r1k1/1ppq2pp/2p1bpn1/p3p3/Pb2P3/1P1PBP1P/2PNNQP1/3R1RK1 b - - 2 17","id":"#&","uci":"a1d1","san":"Rad1"},{"ply":34,"fen":"r3r1k1/2pq2pp/1pp1bpn1/p3p3/Pb2P3/1P1PBP1P/2PNNQP1/3R1RK1 w - - 0 18","id":"TL","uci":"b7b6","san":"b6"},{"ply":35,"fen":"r3r1k1/2pq2pp/1pp1bpn1/p3p3/Pb2P1P1/1P1PBP1P/2PNNQ2/3R1RK1 b - - 0 18","id":"1A","uci":"g2g4","san":"g4"}]
  """.trim

  val all = List(j1, j2, j3, j4, j5, j6, j7)
