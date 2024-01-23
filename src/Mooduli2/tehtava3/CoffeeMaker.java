package src.Mooduli2.tehtava3;
import java.util.Scanner;
public class CoffeeMaker {
    int coffeeType = 0;
    boolean onOff = false;
    int coffeeAmount = 0;

    public CoffeeMaker(int coffeeType, int coffeeAmount, boolean onOff) {
        this.coffeeType = coffeeType;
        this.coffeeAmount = coffeeAmount;
        this.onOff = false;
    }
}

class Coffee {
    public static void main(String[] args) {
        int vastaus = 0;
        CoffeeMaker coffeeMaker = new CoffeeMaker(0, 0, false);

        while(true) {
            Scanner lukija = new Scanner(System.in);
            System.out.println("Valitse toiminto: 1. Laita päälle/pois 2. Valitse kahvi: Normal(1), Espresso(2) 3. Lisää kahvia (10-80ml) 4. Tee kahvi");
            vastaus = lukija.nextInt();

            switch (vastaus) {
                case 1:
                    if (!coffeeMaker.onOff) {
                        coffeeMaker.onOff = true;
                        System.out.println("Kahvinkeitin on päällä");
                    } else {
                        coffeeMaker.onOff = false;
                        System.out.println("Kahvinkeitin on pois päältä");
                    }
                    break;
                case 2:
                    System.out.println("Valitse kahvi: Normal(1), Espresso(2)");
                    int kahvi = lukija.nextInt();
                    if (kahvi == 1) {
                        coffeeMaker.coffeeType = 1;
                        System.out.println("Valitsit normaalin kahvin");
                    } else if (kahvi == 2) {
                        coffeeMaker.coffeeType = 2;
                        System.out.println("Valitsit espresson");
                    } else {
                        System.out.println("Valitse kahvi: Normal(1), Espresso(2)");
                    }
                    break;
                case 3:
                    while(true) {
                        System.out.println("Lisää kahvia (10-80ml)");
                        int kahviMaara = lukija.nextInt();

                        if (kahviMaara >= 10 && kahviMaara <= 80) {
                            coffeeMaker.coffeeAmount = kahviMaara;
                            System.out.println("Lisäsit " + kahviMaara + "ml kahvia");
                            break;
                        }
                    }
                    break;
                case 4:
                    if (!coffeeMaker.onOff) {
                        if (coffeeMaker.coffeeType == 1) {
                            if (coffeeMaker.coffeeAmount >= 10 && coffeeMaker.coffeeAmount <= 80) {
                                System.out.println("Teet normaalia kahvia " + coffeeMaker.coffeeAmount + "ml.");
                                break;
                            } else {
                                System.out.println("Lisää kahvia (10-80ml)");
                            }
                        } else if (coffeeMaker.coffeeType == 2) {
                            if (coffeeMaker.coffeeAmount >= 10 && coffeeMaker.coffeeAmount <= 80) {
                                System.out.println("Teet espressoa " + coffeeMaker.coffeeAmount + "ml.");
                                break;
                            } else {
                                System.out.println("Lisää kahvia (10-80ml)");
                            }
                        } else {
                            System.out.println("Valitse) kahvi: Normal(1), Espresso(2)");
                        }
                    }
            }
        }
    }
}