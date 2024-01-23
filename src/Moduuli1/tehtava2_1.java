package src.Moduuli1;

import java.util.Scanner;

public class tehtava2_1 {
    public static void main(String[] args) {
        System.out.println("Anna lämpötila celsiusasteina:");
        Scanner skanneri = new Scanner(System.in);
        int celsius = skanneri.nextInt();

        double fahrenheit = (double)(celsius * 9 / 5) + 32;

        System.out.println(celsius + " celciusta " + fahrenheit + " fahrenheittia.");
    }
}
