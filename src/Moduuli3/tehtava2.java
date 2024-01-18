package src.Moduuli3;
import java.util.Scanner;
public class tehtava2 {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.print("Syötä binääriluku: ");
        String binaariluvut = lukija.next();

        int desimaalinumero = 0;

        for(int i = 0; i < binaariluvut.length(); i++) {
            if (binaariluvut.charAt(i) == '1') {
                desimaalinumero += (int) Math.pow(2, binaariluvut.length() - 1 - i);
            }
        }

        System.out.print("Desimaaliluku: " + desimaalinumero);

    }
}
