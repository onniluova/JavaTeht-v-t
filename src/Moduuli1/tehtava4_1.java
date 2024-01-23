package src.Moduuli1;

public class tehtava4_1 {
    private final String name;

    public tehtava4_1(String name) {
        this.name = name;
    }

    public void meow() {
        System.out.println("The cat named " + name + " says: Meow!");
    }

    public static void main(String[] args) {
        // Create an instance of the Cat class with a name
        tehtava4_1 cat = new tehtava4_1("Whiskers");
        tehtava4_1 cat2 = new tehtava4_1("Rex");

        // Call the meow method on the cat instance
        cat.meow();
        cat.meow();
        cat2.meow();
        cat.meow();
    }
}