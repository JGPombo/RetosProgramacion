/*
 * Crea una función que reciba dos array, un booleano y retorne un array.
 * - Si el booleano es verdadero buscará y retornará los elementos comunes
 *   de los dos array.
 * - Si el booleano es falso buscará y retornará los elementos no comunes
 *   de los dos array.
 * - No se pueden utilizar operaciones del lenguaje que
 *   lo resuelvan directamente.
 */

import java.util.ArrayList;

public class E23_Conjuntos_X {
    public static void main(String[] args) {
        int[] a1 = {1, 3, 5, 6 };
        int[] a2 = {4, 5, 1, 6, 8};
        boolean bool = true;

        check(a1, a2, bool);
    }

    public static ArrayList check(int[] a1, int[] a2, boolean bool) {
        ArrayList rest = new ArrayList();
        if(bool) {
            for (int i = 0; i < a1.length; i++) {
                for (int x = 0; x < a2.length; x++) {
                    if( i == x ) {
                        rest.add(i);
                        System.out.println("a1: " + a1[i]);
                        System.out.println("a2: " + a2[x]);
                        System.out.println(a1[i]);
                    }
                }
            }
            // Se devuelve el array con los elementos comunes
        } else {
            // Se devuelve el array con los elementos no comunes
        }

        return rest;
    }
}
