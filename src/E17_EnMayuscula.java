/*
 * Crea una función que reciba un String de cualquier tipo y se encargue de
 * poner en mayúscula la primera letra de cada palabra.
 * - No se pueden utilizar operaciones del lenguaje que
 *   lo resuelvan directamente.
 */

public class E17_EnMayuscula {
    public static void main(String[] args) {
        String sentence = "maria antonieta de los pescadores";

        for ( int i = 0; i < sentence.length(); i++ ) {
            if( i == 0){
                String first = (sentence.substring(0, 1).toUpperCase());
                System.out.print(first);
                i++;
            }
            if(sentence.substring(i, (i+1)).equals(" ")) {
                System.out.print(" ");
                System.out.print(sentence.substring(i+1, i+2).toUpperCase());
                i++;
            }
            else{
                System.out.print(sentence.charAt(i));
            }
        }
    }
}
