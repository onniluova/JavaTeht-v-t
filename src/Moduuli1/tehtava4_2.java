package src.Moduuli1;
import java.util.Scanner;

public class tehtava4_2 {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int size = lukija.nextInt();
        int[] lukuArray = new int[size];

        for (int i = 0; i < size; i++) {
            lukuArray[i] = lukija.nextInt();
        }

        lukija.close();

        int maxSum = Integer.MIN_VALUE;

        for (int start = 0; start < lukuArray.length; start++) {
            int sum = 0;
            for (int end = start; end < lukuArray.length; end++) {
                sum += lukuArray[end];
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }
        System.out.println("Suurin summa oli " + maxSum);
    }
}