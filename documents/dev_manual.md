# TicTacToe - Þróunarleiðbeiningar

Allt sem þarf til að geta þróað verkefnið á hreinni vél.

## Samstæðustjórnunarkerfi

GitHub gagnasafnsgeymsla verkefnisins er opin öllum svo ekki þarf að veita aðgang að henni.

#### Leiðbeiningar til að klóna:

Keyrið eftirfarandi skipun í skel (í möppunni sem þú vilt klóna verkefnið):

`git clone https://github.com/NerdirMedSkapgerdir/TicTacToe.git`

Þá ætti verkefnið að vera komið á sinn stað í tölvunni ykkar.

## Þróunarumhverfi

Til að vinna með þetta verkefni þarf að niðurhala og setja upp eftirfarandi hugbúnað:

1. [Git](https://help.github.com/articles/set-up-git/)

2. [Gradle](http://www.gradle.org/installation)

3. [Java JDK](http://docs.oracle.com/javase/7/docs/webnotes/install/)

## Aðrar nauðsynlegar ánauðar

Til að hægt sé að senda ferlið í vinnslu á [Travis](https://travis-ci.org/) þarf að skrá sig þar.

Til að hægt sé að senda ferlið í vinnslu á [Heroku](https://signup.heroku.com/identity) þarf að skrá sig þar.

Til að bæta við virkniprófunum með Selenium þarf að setja upp [Selenium IDE](http://www.seleniumhq.org/download/) fyrir Mozilla Firefox. Þá er hægt að framkvæma prófunartilvik, flytja það út sem java skrá (`java / JUnit 4 / Webdriver`), bæta skránni við verkefnið í möppuna `src/selenium/java/tictactoe/` og breytið efstu línunni í `package tictactoe;`

Ekki þarf að bæta við fleiri hlutum, því að Gradle sér um að installa fyrir ykkur Spark, JUnit og Selenium.

#### Leiðbeiningar til að senda keyranlega skrá í `/tmp` möppu:

Í verkefnismöppunni, keyrið eftirfarandi skipun í skel:

`./bin/deploy`

Þegar skráin, sem verður til við þetta (ekki .bat skráin í möppunni `~/tmp/TicTacToe/bin/` heldur hin), er keyrð með skipunni `./tmp/TicTacToe/bin/TicTacToe` í Linux eða með því að opna `TicTacToe.bat` skránna í Windows, getiði skoðað forritið í vafra með því að slá inn addressu vélarinnar, tvípunkt og port númerið sem ætti að vera 4567. T.d:

`46.149.27.250:4567`

#### Leiðbeiningar til að fremja og ýta á GitHub:

Í verkefnismöppunni, notið `git add *skráarnafn*` til að bæta þeim skrám sem þið viljið fremja breytingar á á GitHub gagnasafnsgeymsluna.

Notið svo `git commit -m "*Skilaboð sem segja hvað var gert*"` til að fremja og svo `git push` til að ýta í geymsluna.

Við það fer í gang ferli sem sendir verkefnið á Travis og keyrir allar srcipturnar þar. Ef það gengur, keyrast einingarprófanir á Travis, ef þær standast, sendum við verkefnið á Heroku-þjón og keyrum virknipróf (end-to-end tests) þar og ef þau standast, þá sendum við verkefnið á annan þjón á Heroku, sem hýsir þá lokaniðurstöðuna.

## Að lokum

Nú ættuð þið að hafa allt sem þarf til að byrja að þróa forritið TicTacToe. Góða skemmtun!
