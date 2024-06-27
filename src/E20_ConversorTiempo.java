/*
 * Crea una función que reciba días, horas, minutos y segundos (como enteros)
 * y retorne su resultado en milisegundos.
 */

public class E20_ConversorTiempo {
    public static void main(String[] args) {
        conversorTiempo(3, 4, 2, 7);
    }

    private static void conversorTiempo(int dias, int horas, int minutos, int segundos) {
        int miliDias = dias * 86400000;
        int miliHoras = horas * 3600000;
        int miliMinutos = minutos * 60000;
        int miliSegundos = segundos * 1000;

        System.out.println("El resultado es: " + (miliDias));
        System.out.println("El resultado es: " + (miliHoras));
        System.out.println("El resultado es: " + (miliMinutos));
        System.out.println("El resultado es: " + (miliSegundos));
        System.out.println("El resultado es: " + (miliDias + miliHoras + miliMinutos + miliSegundos));
    }
}
