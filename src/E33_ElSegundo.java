/*
 * Dado un listado de números, encuentra el SEGUNDO más grande
 */
public class E33_ElSegundo {
    public static void main(String[] args) {
        int[] listado = {83, 8, 10, 20, 5, 19, 3};

        int primero = listado[0];
        int segundo = listado[0];
        for (int i = 0; i < listado.length; i++) {
            if (primero < listado[i]) {
                primero = listado[i];
            }
        }
        System.out.println("El número más grande es: " + primero);

        segundo = (segundo == primero) ? listado[1] : segundo;

        for (int i = 0; i < listado.length; i++) {
                if (segundo < listado[i] && listado[i] != primero) {
                    segundo = listado[i];
                }
        }
        System.out.println("El segundo número más grande es: " + segundo);
    }
}
