package src.Moduuli1;

public class tehtava4 {
    private final String name;

    public tehtava4(String name) {
        this.name = name;
    }

    public void meow() {
        System.out.println("The cat named " + name + " says: Meow!");
    }

    public static void main(String[] args) {
        // Create an instance of the Cat class with a name
        tehtava4 cat = new tehtava4("Whiskers");
        tehtava4 cat2 = new tehtava4("Rex");

        // Call the meow method on the cat instance
        cat.meow();
        cat.meow();
        cat2.meow();
        cat.meow();
    }
}