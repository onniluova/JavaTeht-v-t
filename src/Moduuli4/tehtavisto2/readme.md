    package src.Moduuli4.tehtavisto2;
    
    class Calculator {
    private int value;
    
        public int sum(int a, int b) {
            if (a < 0 || b < 0) {
                throw new IllegalArgumentException("Only positive integers are allowed");
            }
            value = a + b;
            return value;
        }
    
        public void resetCalculator() {
            value = 0;
        }
    
        public int getCurrentValue() {
            return value;
        }
    }
    
    public class tehtava1 {
    public static void main(String[] args) {
    Calculator calc = new Calculator();
    System.out.println(calc.sum(5, 5));
    System.out.println(calc.getCurrentValue());
    calc.resetCalculator();
    System.out.println(calc.getCurrentValue());
    }
    }

The code creates a simple calculator class with a sum method, a reset method and a method to get the current value.
The main method creates a new calculator object and calls the sum method with two parameters. It then prints the result and the current value of the calculator.