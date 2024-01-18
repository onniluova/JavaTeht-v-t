package src.Moduuli3;
import java.util.Scanner;

public class tehtava3 {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        int start = lukija.nextInt();
        int end = lukija.nextInt();

        lukija.close();

        int numero = start;

        while (numero <= end) {
            if (isPrime(numero)) { //Käytetään metodia joka tarkistaa onko numero alkuluku
                System.out.print(numero + " ");
            }
            numero++;
        }
    }

    //Metodi millä tarkistetaan onko numero alkuluku
    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}