public class E15_NumeroArmstrong_X {
    public static void main(String[] args) {
        int num = 153;

        String numStr = String.valueOf(num);
        int numLength = numStr.length();

        //System.out.println(numStr);
        //System.out.println(numLength);

        for( int i = 0; i < numLength; i++) {

            int numTemp = numStr.charAt(i);

            System.out.println((numStr.charAt(i)));
            System.out.println();

           //System.out.println(Integer.parseInt(numTemp));
        }

    }
}
