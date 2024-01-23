package src.Moduuli1;
public class tehtava1_2 {
    public static void main(String[] args) {
        int rivi = 4;

        for (int i = 0; i < rivi; i++) {
            for (int j = rivi - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i * 2; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
