package src.Moduuli1;
import java.util.Scanner;
public class tehtava2_3 {
    public static void main(String[] args) {
        final double GRAMS_PER_LUOTI = 13.28;
        final int LUOTI_PER_NAULA = 32;
        final int NAULA_PER_LEIVISKA = 20;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Syötä paino grammoissa ");
        double grams = scanner.nextDouble();

        int totalLuoti = (int) (grams / GRAMS_PER_LUOTI);
        int leiviskä = totalLuoti / (LUOTI_PER_NAULA * NAULA_PER_LEIVISKA);
        float remainingLuoti = totalLuoti % (LUOTI_PER_NAULA * NAULA_PER_LEIVISKA);
        float naula = remainingLuoti / LUOTI_PER_NAULA;
        float luoti = remainingLuoti % LUOTI_PER_NAULA;

        System.out.println("Painot ovat: ");
        System.out.println(leiviskä + " leiviskää");
        System.out.println(naula + " naulaa");
        System.out.println(luoti + " luotia");

        scanner.close();
    }
}