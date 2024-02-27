package src.Moduuli6.controller;

import src.Moduuli6.model.Dictionary;
import src.Moduuli6.view.DiceGUI;
import src.Moduuli6.view.DictionaryView;

public class DictionaryController {
    private DictionaryView view;
    private Dictionary dictionary;

    public DictionaryController(Dictionary dictionary) {
        this.dictionary = dictionary;
    }

    public String findResult(String word) {
        String meaning = dictionary.retrieveMeaning(word);
        return meaning;
    }

    public static void main(String[] args) {
        DictionaryView.launch(DictionaryView.class);
    }
}