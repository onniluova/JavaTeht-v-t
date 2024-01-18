package src.Moduuli3;
import java.util.Random;
import java.util.Scanner;
public class tehtava4 {
    public static void main(String[] args) {
        Random rand = new Random();
        int oikeat = 0;
        Scanner lukija = new Scanner(System.in);

        while (oikeat < 10) {
            int rand1 = rand.nextInt(11);
            int rand2 = rand.nextInt(11);
            System.out.println("Paljonko on " + rand1 + " kertaa " + rand2 + "?");
            int vastaus = (rand1 * rand2);
            int pvastaus = lukija.nextInt();

            if (pvastaus == vastaus) {
                oikeat += 1;
                System.out.println("Oikea vastaus! Sinulla on " + oikeat + " oikeaa vastausta!");
            }
            else {
                System.out.println("Väärin!");
            }
        }
        System.out.println("Sait 10 oikein. Hienoa!");
    }
}
