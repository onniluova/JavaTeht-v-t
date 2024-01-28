package src.Mooduli2.tehtava2_2;

import java.util.ArrayList;

public class GroceryListManager {
    private ArrayList<String> groceryList = new ArrayList<>();

    public void addItem(String item) {
        groceryList.add(item);
        System.out.println(item + "lisätty ostoslistaan.");
    }

    public void removeItem(String item) {
        groceryList.remove(item);
        System.out.println(item + "poistettu listasta.");
    }

    public void displayList() {
        System.out.println(groceryList);
    }

    public boolean checkItem(String item) {
        if (groceryList.contains(item)) {
            System.out.println("Tuote löytyi listasta.");
            return true;

        }
        else {
            System.out.println("Tuotetta ei löytynyt listasta.");
            return false;
        }
    }

    public static void main(String[] args) {
        GroceryListManager list = new GroceryListManager();
        list.addItem("Milk");
        list.addItem("Bread");
        list.addItem("Butter");
        list.displayList();
        list.removeItem("Bread");
        list.displayList();
        list.checkItem("Milk");
        list.checkItem("Eggs");
    }

}