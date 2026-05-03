////////////////////////////////////////////////////////////////////
// Elico Huang 2147952
// Giovanni Veronese 2145589
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class IntegerToRoman {
  /**
     * Converte un numero intero nella corrispondente rappresentazione romana.
     * 
     * L'algoritmo utilizza un approccio greedy basato su una lista ordinata
     * di valori e simboli romani.
     * Esempi:
     * convert(1)  -> "I"
     * convert(4)  -> "IV"
     * convert(9)  -> "IX"
     * convert(58) -> "LVIII"
     * 
     * @param numero intero da convertire
     * @return stringa del numero romano
     * 
     * @pre numero > 0 && numero <= 1000
     * @post risultato != null
     * @post risultato rappresenta numero in notazone romana
     * @post risultato contiene solo i simboli {I, V, X, L, C, D, M}
     * @post il valore numerico di result è uguale a numero
     * 
     * @throws IllegalArgumentException se numero < 1 o numero > 1000
    */
    public static String convert(int numero) {
        if(numero < 1 ) {
            throw new IllegalArgumentException("Il numero deve essere positivo");
        }

        if(numero > 1000) {
            throw new IllegalArgumentException("Il numero deve essere minore di 1000");
        }

        int[] valori = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] lettere = {"M", "CM", "D",  "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder risultato = new StringBuilder();

         for (int i = 0; i < valori.length ; i++) {
            while(numero >= valori[i]) {
                risultato.append(lettere[i]);
                numero -= valori[i];
            }
         }

        return risultato.toString();
    }
}