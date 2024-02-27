package src.Moduuli6.tehtava1.controller;

import src.Moduuli6.tehtava1.model.Dictionary;
import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class DictionaryController {

    private Dictionary dictionary;
    private TextField searchField, wordField, meaningField;
    private TextArea meaningArea;

    public DictionaryController(Dictionary dictionary, TextField searchField, TextArea meaningArea,
                                TextField wordField, TextField meaningField) {
        this.dictionary = dictionary;
        this.searchField = searchField;
        this.meaningArea = meaningArea;
        this.wordField = wordField;
        this.meaningField = meaningField;
    }

    public void handleSearch(ActionEvent event) {
        String word = searchField.getText().trim();
        if (word.isEmpty()) {
            meaningArea.setText("Please enter a word to search.");
        } else {
            String meaning = dictionary.searchWord(word);
            meaningArea.setText(meaning);
        }
    }

    public void handleAddWord(ActionEvent event) {
        String word = wordField.getText().trim();
        String meaning = meaningField.getText().trim();
        if (word.isEmpty() || meaning.isEmpty()) {
            meaningArea.setText("Please enter both word and meaning.");
        } else {
            dictionary.addWord(word, meaning);
            meaningArea.setText("Word added successfully!");
            wordField.clear();
            meaningField.clear();
        }
    }
}