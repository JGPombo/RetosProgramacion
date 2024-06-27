/*
 * Crea una función que imprima los 30 próximos años bisiestos
 * siguientes a uno dado.
 * - Utiliza el menor número de líneas para resolver el ejercicio.
 */

public class E32_AnosBisiestos {
    public static void main(String[] args) {
        int bisiesto = 2024;
        int contador = 0;

        while (contador < 30) {
            if (bisiesto % 4 == 0 && bisiesto % 100 != 0 || bisiesto % 400 == 0) {
                System.out.println(bisiesto);
                contador++;
            }
        bisiesto++;
        }
    }
}
