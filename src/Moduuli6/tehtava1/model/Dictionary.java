package src.Moduuli6.tehtava1.model;
import java.util.HashMap;

public class Dictionary {

    private HashMap<String, String> dictionary;

    public Dictionary() {
        dictionary = new HashMap<>();
    }

    public void addWord(String word, String meaning) {
        dictionary.put(word.toLowerCase(), meaning);
    }

    public String searchWord(String word) {
        String meaning = dictionary.get(word.toLowerCase());
        return meaning != null ? meaning : "Word not found";
    }
}