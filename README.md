# dea-week-2-vrijdag

## Deel 1 opzet

* Creeer een Java project met Maven
    * Kies een groupId die zinnig is en aan de conventies voldoet
    * Kies een artifactId die zinnig is.
* Zorg ervoor dat je JUnit versie 4.12 als dependency in je pom hebt staan
* Plaats de drie bestanden die in dit project zetten op de juiste plek in je nieuwe project.

## Deel 2 Project werkend maken

Het project bevat nu een klein programmatje waarmee je kunt testen of getallen
een priemgetal zijn. Er mist nog een belangrijk onderdeel, namelijk de methode die test of een getal priem is. Deze gaan we niet zelf schrijven.

* Importeer mbv Maven de dependency `org.apache.commons.commons-math3`, versie 3.6.1.
* Deze dependency bevat een klasse `Primes` met een methode `isPrime()`. Deze zie je terug op regel 23 van `PrimeTester`. Zorg dat hij het doet.
* Met een beetje geluk heb je nu een werkende applicatie. Run hem via de commandline met Maven

## Deel 3 Multithreaded maken
We gaan er nu voor zorgen dat je vanuit de `PrimeTestingApp` meerdere threads opstart met een `PrimeTester`. Deze zullen gelijktijdig naar priemgetallen gaan zoeken. Vier threads is genoeg.

* Zorg ervoor dat je `PrimeTesters` als Threads kunt opstarten.
* Maak in `PrimeTestingApp` vier instanties van `PrimeTesters` en start deze op in afzonderlijke threads.
* Maak je applicatie ThreadSafe






**Met dank aan Roel, Gio en Stijn voor de code van hun OptelParty...**

