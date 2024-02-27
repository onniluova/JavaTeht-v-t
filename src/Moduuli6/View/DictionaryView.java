package src.Moduuli6.View;

import src.Moduuli6.Model.Dictionary;
import src.Moduuli6.Controller.DictionaryController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class DictionaryView extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Dictionary dictionary = new Dictionary();
        dictionary.addWord("hello", "greeting");
        dictionary.addWord("world", "the planet Earth");

        TextField searchField = new TextField();
        Button searchButton = new Button("Search");
        TextArea meaningArea = new TextArea();
        meaningArea.setEditable(false);

        TextField wordField = new TextField();
        Label meaningLabel = new Label("Meaning:");
        TextField meaningField = new TextField();
        Button addButton = new Button("Add Word");

        FlowPane layout = new FlowPane();
        layout.getChildren().addAll(searchField, searchButton, meaningArea, wordField, meaningLabel, meaningField, addButton);

        DictionaryController controller = new DictionaryController(dictionary, searchField, meaningArea, wordField, meaningField);
        searchButton.setOnAction(controller::handleSearch); // Assuming handleSearch is defined in DictionaryController
        addButton.setOnAction(controller::handleAddWord);

        Scene scene = new Scene(layout, 400, 350);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Dictionary");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}