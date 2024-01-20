package src.Mooduli4;
import java.util.ArrayList;
import java.util.Scanner;

public class tehtava3 {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        ArrayList<Integer> numerot = new ArrayList<>();

        System.out.print("Syötä numeroita. (Syötä 0 lopettaaksesi)");

        while(true) {
            int numero = lukija.nextInt();
            if (numero == 0) {
                break;
            }
            numerot.add(numero);
        }

        ArrayList<Integer> uudetNumerot = new ArrayList<>();

        for (Integer i : numerot) {
            if (!uudetNumerot.contains(i)) {
                uudetNumerot.add(i);
            }
        }

        lukija.close();

        System.out.print("Syötit: " + uudetNumerot);

    }
}
