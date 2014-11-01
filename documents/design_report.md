# TicTacToe - Design Report

Í þessari skýrslu verður farið yfir þær hönnunarákvarðanir sem teknar voru áður en hafist var handa við forritun leiksins TicTacToe. Megin áherslan var lögð á klasarit en þar sem þetta er tiltölulega lítið verkefni, verða önnur rit ekki með í skýrslunni.

## Class Diagram

Hér má sjá klasaritið sem hópurinn gerði í upphafi verkefnis:

![alt tag](https://raw.github.com/NerdirMedSkapgerdir/TicTacToe/master/documents/klasarit_upprunalegt.jpg)


Hópurinn setti svo upp nýtt klasarit áður en byrjað var að forrita:

![alt tag](https://raw.github.com/NerdirMedSkapgerdir/TicTacToe/master/documents/klasarit.jpg)


Að lokum hentum við svo TTTInterface klasanum eftir að við vefvæddum verkefnið en í stað hans kom TTTWeb klasinn. Föllunum instructions() og run() var hent þar sem þau voru óþörf, en fallið welcome() var fært yfir í TicTacToe klasann. Einnig bættum við við einu falli í TicTacToe, clearBoard().
