package src.Moduuli1;
import java.util.Scanner;
public class tehtava1_4 {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        String[] firstNames = {"John", "Bob", "Alice"};
        String[] lastNames = {"Smith", "Jones", "Williams"};

        System.out.println("Kuinka monta nimeä haluat generoida?");

        int nimiLuku = lukija.nextInt();

        for (int i = nimiLuku; i > 0; i--) {
            System.out.print(firstNames[(int) (Math.random() * firstNames.length)]);
            System.out.print(" " + lastNames[(int) (Math.random() * lastNames.length)] + "\n");
        }
    }
}
