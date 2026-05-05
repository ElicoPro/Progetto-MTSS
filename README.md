[![build](https://github.com/ElicoPro/Progetto-MTSS/actions/workflows/build.yml/badge.svg?branch=main)](https://github.com/ElicoPro/Progetto-MTSS/actions/workflows/build.yml)
![Coverage Status](https://coveralls.io/repos/github/ElicoPro/Progetto-MTSS/badge.svg)

# ROMAN NUMBER CONVERTER

Elico Huang 2147952 <br>
Giovanni Veronese 2145589

Il progetto **Roman Number Converter** è un’applicazione Java sviluppata con Maven che permette la conversione dei primi 1000 numeri da interi a romani e la loro stampa in **ASCIART**.

## TECNOLOGIE USATE
- Java 17
- Maven
- Git & Github
- Jacoco & Coveralls
- Junit 4

## Processo di Build

Il progetto utilizza Maven come tool di build.
Oltre a ciò ha un processo di build che viene attivato quando avviene una push o una PR su `main` o `develop`, questo per verificare che il nuovo codice non crei problemi, seguendo i principi della CI.
Durante il processo di build automatico i test vengono anche inviati a coveralls per l'analisi sul code coverage.
I comandi utilizzati per la build sono:
```bash
mvn -B compile
mvn -B checkstyle:check
mvn -B verify
```

## Analisi statica del codice

È stato configurato il plugin Maven Chekstyle

SonoState implementati i seguenti moduli:
- BooleanExpressionComplexity
- CyclomaticComplexity
- FileLength
- LineLength
- MethodLength
- EmptyCatchBlock
- FileTabCharacter
- AvoidStarImport
- IllegalImport
- NeedBraces
- Header

### Header utilizzato
```
////////////////////////////////////////////////////////////////////
// Elico Huang 2147952
// Giovanni Veronese 2145589
////////////////////////////////////////////////////////////////////
```

la build fallisce automaticamente in presenza di violazioni

## Conversione Numeri Romani

Il progetto include una classe `IntegerToRoman` che permette la conversione di numeri arabi in numeri romani.

Il metodo `convert(int numero)`:
- accetta valori compresi tra 1 e 1000
- utilizza un algoritmo greedy
- gestisce la notazione sottrattiva (IV, IX, XL, XC, CD, CM)

Esempi:
- 1 → I
- 4 → IV
- 9 → IX
- 58 → LVIII
## Stampa ASCII dei Numeri Romani

Il progetto include la classe `RomanPrinter`, che consente di visualizzare numeri romani in formato ASCII art.

Il metodo `print(int num)`:
- utilizza `IntegerToRoman.convert(int)` per ottenere la rappresentazione romana
- costruisce l'output ASCII concatenando le rappresentazioni dei singoli simboli
- restituisce una stringa composta da 6 righe

Sono supportati i seguenti simboli:
- I, V, X, L, C, D, M

## Test

`IntergerToRomanTest` implementa i test per la classe `IntegerToRoman`, coprendo i principali casi e anche i casi di errore. 
`RomanPrinterTest` implementa i test per la classe `RomanPrinter`, coprendo tutti caratteri che possono venire stampati e assicurandosi che le righe stampate siano effettivamente 6.