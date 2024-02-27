package src.Moduuli6.tehtava2.view2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import src.Moduuli6.tehtava2.controller2.CurrencyController;
import src.Moduuli6.tehtava2.model2.Currency;
import javafx.geometry.Pos;

public class CurrencyView extends Application {
    private CurrencyController controller;

    @Override
    public void init() {
        controller = new CurrencyController(new Currency());
    }

    public void start(Stage stage) {
        stage.setTitle("Currency Converter");

        ComboBox<String> selectCurrency = new ComboBox<>();
        selectCurrency.getItems().addAll(
                "EUR",
                "USD",
                "GBP"
        );

        Label text = new Label("Select currency to convert");
        TextField currency = new TextField("Amount to convert");
        Button currencyConvert = new Button("Convert");

        VBox vbox = new VBox(text, currency, selectCurrency);
        vbox.setAlignment(Pos.CENTER);

        VBox currencyVbox = new VBox(currencyConvert);
        currencyVbox.setAlignment(Pos.CENTER);

        TextField convertedCurrency = new TextField("Converted currency");
        Label convertedText = new Label("Converted currency");

        ComboBox<String> selectToConvert = new ComboBox<>();
        selectToConvert.getItems().addAll(
                "EUR",
                "USD",
                "GBP"
        );

        VBox vbox2 = new VBox(convertedText, convertedCurrency, selectToConvert);
        vbox2.setAlignment(Pos.CENTER);

        currencyConvert.setOnAction(event -> {
            String selectedCurrency = selectCurrency.getValue();
            String selectedToConvert = selectToConvert.getValue();
            double amount = Double.parseDouble(currency.getText());
            double convertedAmount = controller.muunnaValuutta(amount, selectedCurrency, selectedToConvert);
            convertedCurrency.setText(Double.toString(convertedAmount));
        });

        HBox mainPane = new HBox(vbox, vbox2, currencyVbox);
        mainPane.setAlignment(Pos.CENTER);

        Scene scene = new Scene(mainPane);

        scene.getStylesheets().add("styles.css");

        stage.setScene(scene);
        stage.setMinWidth(600);
        stage.setMinHeight(300);

        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
