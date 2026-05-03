////////////////////////////////////////////////////////////////////
// Elico Huang 2147952
// Giovanni Veronese 2145589
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

/**
 * Converte un numero intero nella sua rappresentazione romana
 * e restituisce una stringa contenente la corrispondente stampa
 * in formato ASCII art.
 *
 * Il metodo utilizza IntegerToRoman.convert per ottenere la
 * rappresentazione romana e successivamente costruisce la
 * rappresentazione grafica concatenando le lettere ASCII.
 *
 * Esempi:
 * print(1)  -> ASCII art della lettera "I"
 * print(5)  -> ASCII art della lettera "V"
 * print(10) -> ASCII art della lettera "X"
 *
 * @param num numero intero da convertire e stampare
 * @return stringa contenente il numero romano in formato ASCII art
 *
 * @pre num > 0 && num <= 1000
 * @post risultato != null
 * @post risultato contiene solo caratteri ASCII rappresentanti simboli romani
 * @post il risultato è composto da 6 righe di testo
 *
 * @throws IllegalArgumentException se num < 1 o num > 1000
 */

public class RomanPrinter {
  public static String print(int num) {
    return printAsciiArt(IntegerToRoman.convert(num));
  }


  private static String printAsciiArt(String romanNumber) {
    StringBuilder risultato = new StringBuilder();
    for (int row = 0; row < 6; row++) {
        for (char c : romanNumber.toCharArray()) {
            risultato.append(getAscii(c)[row]);
            risultato.append("  ");
        }
        risultato.append("\n");
    }
    return risultato.toString();
  }


      // ===== COSTANTI ASCII =====

    private static final String[] ASCII_I = {
        " _____ ",
        "|_   _|",
        "  | |  ",
        "  | |  ",
        " _| |_ ",
        "|_____|"
    };

    private static final String[] ASCII_V = {
        "__      __",
        "\\ \\    / /",
        " \\ \\  / / ",
        "  \\ \\/ /  ",
        "   \\   /  ",
        "    \\ /   "
    };

    private static final String[] ASCII_X = {
        "__   __",
        "\\ \\ / /",
        " \\ V / ",
        "  > <  ",
        " / . \\ ",
        "/_/ \\_\\"
    };

    private static final String[] ASCII_L = {
        " _      ",
        "| |     ",
        "| |     ",
        "| |     ",
        "| |____ ",
        "|______|"
    };

    private static final String[] ASCII_C = {
        " _____ ",
        "/ ____|",
        "| |    ",
        "| |    ",
        "| |____",
        "\\_____|"
    };

    private static final String[] ASCII_D = {
        " _____  ",
        "|  __ \\ ",
        "| |  | |",
        "| |  | |",
        "| |__| |",
        "|_____/ "
    };

    private static final String[] ASCII_M = {
        "__  __ ",
        "|  \\/  |",
        "| \\  / |",
        "| |\\/| |",
        "| |  | |",
        "|_|  |_|"
    };

    // ===== METODO RIDOTTO =====

    private static String[] getAscii(char lettera) {
        switch (lettera) {
            case 'I':
                return ASCII_I;
            case 'V':
                return ASCII_V;
            case 'X':
                return ASCII_X;
            case 'L':
                return ASCII_L;
            case 'C':
                return ASCII_C;
            case 'D':
                return ASCII_D;
            case 'M':
                return ASCII_M;
            default:
                throw new IllegalArgumentException(
                    "Carattere romano non valido: " + lettera
                );
        }
    }
}