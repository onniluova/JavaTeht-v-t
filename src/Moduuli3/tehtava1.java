package src.Moduuli3;
import java.util.Scanner;
public class tehtava1 {
    ///ax^2 + bx + c = 0
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.print("Syötä numero: ");
        double a = lukija.nextDouble();

        System.out.print("Syötä numero: ");
        double b = lukija.nextDouble();

        System.out.print("Syötä numero: ");
        double c = lukija.nextDouble();

        lukija.close();

        double diskriminantti = ((b * b) - 4 * a * c);

        if (diskriminantti > 0) {
            double juuri1 = (-b + Math.sqrt(diskriminantti) / 2 * a);
            double juuri2 = (b + Math.sqrt(diskriminantti) / 2 * a);
            System.out.print("Juuret: " + juuri1 + " " + juuri2);
        }

        else if (diskriminantti == 0){
            double juuri = -b / (2 * a);
            System.out.print("Juuri: " + juuri);
        }

        else {
            System.out.print("Ei juuria.");
        }
    }
}
