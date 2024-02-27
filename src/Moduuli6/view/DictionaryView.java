package src.Moduuli6.view;

import src.Moduuli6.controller.DiceController;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.event.EventHandler;
import javafx.scene.layout.FlowPane;
import javafx.scene.control.Spinner;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import src.Moduuli6.controller.DictionaryController;
import javafx.scene.control.TextField;
import src.Moduuli6.model.Dictionary;

public class DictionaryView extends Application {

    private DictionaryController controller;

    @Override
    public void init() {
        // Initialize the DictionaryController with a new Dictionary
        controller = new DictionaryController(new Dictionary());
    }

    public void start(Stage stage) {

        TextField addMeaning = new TextField();
        Button addButton = new Button("Add");
        FlowPane addPane = new FlowPane();

        TextField searchField = new TextField();
        Button searchButton = new Button("Search");
        FlowPane searchPane = new FlowPane();

        stage.setTitle("Dictionary");


        //Put the meaning and add button in a separate pane
        addPane.setAlignment(Pos.CENTER);
        addPane.setHgap(10);
        addPane.setVgap(10);
        addPane.setPadding(new Insets(25, 25, 25, 25));

        addPane.getChildren().add(addMeaning);
        addPane.getChildren().add(addButton);

        //Put the search field and search button in a separate pane
        searchPane.setAlignment(Pos.CENTER);
        searchPane.setHgap(10);
        searchPane.setVgap(10);
        searchPane.setPadding(new Insets(25, 25, 25, 25));

        searchPane.getChildren().add(searchField);
        searchPane.getChildren().add(searchButton);

        // add outside margins for components
        Insets insets = new Insets(10, 10, 10, 10);
        searchPane.setMargin(searchButton, insets);

        // Create a main pane and add the addPane and searchPane to it
        FlowPane mainPane = new FlowPane();
        mainPane.getChildren().add(addPane);
        mainPane.getChildren().add(searchPane);

        Scene scene = new Scene(mainPane);
        stage.setScene(scene);
        stage.show();

        searchButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String word = searchField.getText();
                String meaning = controller.findResult(word);

                if (meaning == null) {
                    meaning = "Word not found";
                }
                else {
                    meaning = "Meaning: " + meaning;
                }
            }
        });
    }
}
