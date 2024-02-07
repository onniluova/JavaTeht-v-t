package src.Moduuli3.tehtavisto4;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class tehtava2 {
    public static void main(String[] args) {
        HashMap<Integer, Integer> fib = new HashMap<>();
        fib.put(0, 0);
        fib.put(1, 1);

        for (int i = 2; i < 100; i++) {
            fib.put(i, fib.get(i - 1) + fib.get(i - 2));
        }

        //Write them into a csv file
        try (Writer writer = new FileWriter("fibonacci.csv"); BufferedWriter bufferedWriter = new BufferedWriter(writer)) {

            for (Map.Entry<Integer, Integer> entry  : fib.entrySet()) {
                bufferedWriter.write(String.valueOf(entry.getKey()) +  " " + String.valueOf(entry.getValue()));
                bufferedWriter.newLine();
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(fib);
        }
    }
