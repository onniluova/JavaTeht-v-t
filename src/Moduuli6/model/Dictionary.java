package src.Moduuli6.model;

import java.util.HashMap;

public class Dictionary {
    HashMap<String, String> words;

    public void addMeaning(String word, String meaning) {
        words.put(word, meaning);
    }

    public String retrieveMeaning(String word) {
        words.get(word);
        return word;
    }
}
