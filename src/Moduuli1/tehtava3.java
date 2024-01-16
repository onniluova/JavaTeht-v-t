package src.Moduuli1;
import java.util.Scanner;
public class tehtava3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int first = Integer.parseInt(scanner.nextLine());

        System.out.println("Give the second number:");
        int second = Integer.parseInt(scanner.nextLine());

        System.out.println("Give the third number:");
        int third = Integer.parseInt(scanner.nextLine());

        float keskiarvo = (float)(first + second + third) / 3;

        int tulo = first * second * third;

        System.out.println("The sum of the numbers is " + (first + second + third + ", product is " + tulo + " and the average is " + keskiarvo + "."));
    }
}