package src.Moduuli1;
import java.util.Scanner;
public class tehtava2_2 {
    public static void main(String[] args) {
        System.out.println("Anna kaksi sivua:");
        Scanner skanneri = new Scanner(System.in);
        int sivu1 = skanneri.nextInt();
        int sivu2 = skanneri.nextInt();

        double hypotenuusa = Math.sqrt(Math.pow(sivu1, 2) + Math.pow(sivu2, 2));

        System.out.println("Hypotenuusan pituus on " + hypotenuusa);
    }
}
