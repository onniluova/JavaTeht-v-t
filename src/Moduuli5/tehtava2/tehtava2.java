package src.Moduuli5.tehtava2;

public class tehtava2 {
    int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int numThreads = 4; // Muuta tätä arvoa säikeiden määrän muuttamiseksi
    int chunkSize = numbers.length / numThreads;

    // Luo säikeet
    Thread[] threads = new Thread[numThreads];
    PartialSum[] partialSums = new PartialSum[numThreads];

    public void startCalculation() {
        for (int i = 0; i < numThreads; i++) {
            int start = i * chunkSize;
            int end = Math.min((i + 1) * chunkSize, numbers.length);

            partialSums[i] = new PartialSum(numbers, start, end);
            threads[i] = new Thread(partialSums[i]);
            threads[i].start();
        }

        // Odotetaan thredit
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Lasketaan summa
        int totalSum = 0;
        for (PartialSum partialSum : partialSums) {
            totalSum += partialSum.getSum();
        }
        System.out.println("Total Sum: " + totalSum);
    }

    static class PartialSum implements Runnable {
        private final int[] numbers;
        private final int start;
        private final int end;
        private int sum;

        public PartialSum(int[] numbers, int start, int end) {
            this.numbers = numbers;
            this.start = start;
            this.end = end;
        }

        @Override
        public void run() {
            sum = 0;
            for (int i = start; i < end; i++) {
                sum += numbers[i];
            }
        }

        public int getSum() {
            return sum;
        }
    }

    public static void main(String[] args) {
        tehtava2 multiLaskin = new tehtava2();
        multiLaskin.startCalculation();
    }
}