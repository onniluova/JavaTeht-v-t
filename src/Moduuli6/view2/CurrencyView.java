package src.Moduuli6.view2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.event.EventHandler;
import javafx.scene.layout.FlowPane;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import org.w3c.dom.Text;
import src.Moduuli6.controller2.CurrencyController;
import src.Moduuli6.model.Dictionary;
import src.Moduuli6.model2.Currency;
import javafx.scene.layout.VBox;

import java.awt.*;

public class CurrencyView extends Application {
    private CurrencyController controller;
    @Override
    public void init() {
        // Initialize the DictionaryController with a new Dictionary
        controller = new CurrencyController(new Currency());
    }

    public void start(Stage stage) {
        stage.setTitle("Currency Converter");

        ComboBox<String> selectCurrency = new ComboBox<String>();
        selectCurrency.getItems().addAll(
                "EUR",
                "USD",
                "GBP"
        );

        Label text = new Label("Select currency to convert");
        TextField currency = new TextField();
        Button currencyConvert = new Button("Convert");

        VBox vbox = new VBox(selectCurrency, text, currency, currencyConvert);
        vbox.setAlignment(Pos.CENTER);

        TextField convertedCurrency = new TextField();
        Label convertedText = new Label("Converted currency");

        ComboBox<String> selectToConvert = new ComboBox<String>();
        selectToConvert.getItems().addAll(
                "EUR",
                "USD",
                "GBP"
        );

        VBox vbox2 = new VBox(selectToConvert, convertedText, convertedCurrency);
        vbox2.setAlignment(Pos.CENTER);

        currencyConvert.setOnAction(event -> {
            String selectedCurrency = selectCurrency.getValue();
            String selectedToConvert = selectToConvert.getValue();
            double amount = Double.parseDouble(currency.getText());
            double convertedAmount = controller.muunnaValuutta(amount, selectedCurrency, selectedToConvert);
            convertedCurrency.setText(Double.toString(convertedAmount));
        });

        //Lisätään FlowPanet main paneen.
        FlowPane mainPane = new FlowPane();
        mainPane.getChildren().add(vbox);
        mainPane.getChildren().add(vbox2);

        mainPane.setAlignment(Pos.CENTER);

        Scene scene = new Scene(mainPane);

        stage.setScene(scene);
        stage.setMinWidth(300);
        stage.setMinHeight(200);

        stage.setMaxWidth(800);
        stage.setMaxHeight(600);

        stage.show();
    }
}
