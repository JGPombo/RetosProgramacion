/*
 * Crea una función que ordene y retorne una matriz de números.
 * - La función recibirá un listado (por ejemplo [2, 4, 6, 8, 9]) y un parámetro
 *   adicional "Asc" o "Desc" para indicar si debe ordenarse de menor a mayor
 *   o de mayor a menor.
 * - No se pueden utilizar funciones propias del lenguaje que lo resuelvan
 *   automáticamente.
 */

public class E30_OrdenaLaLista_P {
    public static void main(String[] args) {
        int[] array = {3, 2, 5, 1, 4};

        String tipo = "Ascendente";
        sort(array, tipo);
    }

    public static void sort(int[] array, String tipo) {

        if(tipo.equals("Ascendente")) {
            System.out.println("Ascendente");
            int aux = array[0];

            int i;
            int posAux = 0;
            int posArray = 0;

            while(posArray != 4) {
                for (i = posArray; i < array.length - 1; i++) {
                    if (array[i] > array[i + 1]) {
                        aux = array[i + 1];
                        posAux = i + 1;
                    }
                }
                System.out.println("aux " + aux);
                System.out.println("posAux " + posAux);

                // POngo el número de la posición 0 en la posAux
                array[posAux] = array[i];
                // Pongo aux en la posición 0;
                array[i] = aux;
                // Repito el bucle desde la posicion 1
                posArray++;

                System.out.println("posArray " + posArray);
            }
           // resultado[position-1] = aux;


            System.out.println("El resultado es: ");
            for (int x = 0; x < array.length; x++){
                System.out.println(array[x]);
            }
        } else {
            System.out.println("Descendente");
        }
    }
}
