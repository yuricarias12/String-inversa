import java.util.Scanner;

public class ReverseString {
    public static String stringInversa(String minhaString) {

        if (minhaString == null)
            return minhaString;

        String stringReversa = "";

        for (int i = minhaString.length() - 1; i >= 0; i--) {

            stringReversa  = stringReversa  + minhaString.charAt(i);
        }
        return stringReversa ;
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Informe uma palavra para inverter: ");
        String palavra = ler.next();

        String resultado = stringInversa(palavra);

        System.out.println(resultado);

    }




}