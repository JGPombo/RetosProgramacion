public class E12_EliminandoCaracteres_X {
    public static void main(String[] args) {
        parameters("Hola", "Adios");
    }

    public static void parameters(String str1, String str2) {
        String out1= "";
        String out2= "";

        for( int i = 0; i < str1.length(); i++ ){
            for( int x = 0; x < str2.length(); x++ ) {
                if( str1.charAt(i) == str2.charAt(x)) {
                    break;
                }
                else{
                    out1.concat(String.valueOf(str1.charAt(i)));
                }

            }
            //System.out.println( str1.charAt(i) );
        }

        System.out.println(out1);
        System.out.println(out2);
    }
}
