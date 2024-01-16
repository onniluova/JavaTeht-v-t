package src.Moduuli1;
import java.util.Scanner;

public class Testi {
    public static void main(String[] args) {
        Scanner luku = new Scanner(System.in);

        System.out.print("Anna luku: ");

        int numero = luku.nextInt();

        luku.close();

        if (numero > 0) {
            System.out.print("Luku on " + numero);
        }
    }
}