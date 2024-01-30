package src.Moduuli2.tehtavisto2.tehtava2_4;

import java.util.HashMap;
import java.util.Map;

public class GroceryListManager4 {
    HashMap<String, HashMap<String, String>> groceryTypes = new HashMap<>();
    HashMap<String, Double> groceryDetails = new HashMap<>();
    HashMap<String, Integer> itemQuantities = new HashMap<>();

    public void addItem(String item, double cost) {
        groceryDetails.put(item, cost);
        System.out.println(item + " lisätty ostoslistaan.");
    }

    public void removeItem(String item) {
        if (groceryDetails.remove(item) != null) {
            System.out.println(item + " poistettu listasta.");
        } else {
            System.out.println(item + " ei löydy listasta.");
        }
    }

    public void displayList() {
        System.out.println("Listassa on:");
        for (Map.Entry<String, Double> entry : groceryDetails.entrySet()) {
            System.out.println(entry.getKey() + " - hinta: " + entry.getValue());
        }
    }

    public boolean checkItem(String item) {
        if (groceryDetails.containsKey(item)) {
            System.out.println("Tuote löytyi listasta.");
            return true;
        } else {
            System.out.println("Tuotetta ei löytynyt listasta.");
            return false;
        }
    }

    public void calculateCost() {
        double totalCost = 0;
        for (Double cost : groceryDetails.values()) {
            totalCost += cost;
        }
        System.out.println("Kokonaiskustannus: " + totalCost);
    }

    public void addItemWithCategory(String item, String category, double cost, String propertyValue) {
        groceryDetails.putIfAbsent(item, cost);
        groceryTypes.putIfAbsent(category, new HashMap<>());
        groceryTypes.get(category).put(item, propertyValue);
    }

    public void addItemWithQuantity(String item, double cost, int quantity) {
        groceryDetails.put(item, cost);
        itemQuantities.put(item, itemQuantities.getOrDefault(item, 0) + quantity);
    }
    public void updateItemWithQuantity(String item, double cost, int newQuantity) {
        if (itemQuantities.containsKey(item)) {
            itemQuantities.put(item, newQuantity);
            groceryDetails.put(item, cost);
        } else {
            System.out.println(item + " ei löydy listasta.");
        }
    }

    public void displayAvailableItems() {
        for (Map.Entry<String, Integer> entry : itemQuantities.entrySet()) {
            String item = entry.getKey();
            Integer quantity = entry.getValue();
            System.out.println(item + " - määrä: " + quantity);
        }
    }

    public static void main(String[] args) {
        GroceryListManager4 list = new GroceryListManager4();
        list.addItemWithQuantity("Peruna", 2, 3);
        list.addItemWithQuantity("Juusto", 1, 7);
        list.updateItemWithQuantity("Juusto", 1, 4);
        list.displayAvailableItems();
    }
}