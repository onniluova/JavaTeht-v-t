package src.Moduuli5;

class evenThreading implements Runnable {
    int lowest;
    int highest;

    public evenThreading(int lowest, int highest) {
        this.lowest = lowest;
        this.highest = highest;
    }
    @Override
    public void run() {
        int number = lowest;
        while (number < highest) {
            number += 2;
            System.out.println("Even thread: " + number);
        }
    }
}

class oddThreading implements Runnable {
    int lowest;
    int highest;

    public oddThreading(int lowest, int highest) {
        this.lowest = lowest;
        this.highest = highest;
    }
    @Override
    public void run() {
        int number = lowest;
        while (number < highest) {
            if (number % 2 != 0) {
                System.out.println("Odd thread: " + number);
            }
            number += 1;
        }
    }
}

public class tehtava1 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new evenThreading(1, 20));
        Thread thread2 = new Thread(new oddThreading(1, 20));

        thread1.start(); // Starts the first thread
        thread2.start(); // Starts the second thread
    }
}