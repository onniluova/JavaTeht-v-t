package src.Moduuli6.tehtava2.controller2;

import src.Moduuli6.tehtava2.model2.Currency;
import src.Moduuli6.tehtava2.view2.CurrencyView;

import java.util.ArrayList;

public class CurrencyController {
    private Currency currency;
    private CurrencyView view;

    public CurrencyController(Currency currency) {
        this.currency = currency;
    }

    public double muunnaValuutta(double maara, String valuutta, String toConvert) {
        ArrayList<String> valuutat = currency.getValuutat();
        if (valuutat.contains(valuutta)) {
            return maara * getConversionRate(valuutta, toConvert);
        }
        System.out.println("Valuuttaa ei löytynyt");
        return 0;
    }

    public double getConversionRate(String from, String to) {
        if (from.equals("USD") && to.equals("EUR")) {
            return 1.1;
        } else if (from.equals("USD") && to.equals("GBP")) {
            return 0.9;
        } else if (from.equals("EUR") && to.equals("USD")) {
            return 1 / 1.1;
        } else if (from.equals("EUR") && to.equals("GBP")) {
            return 0.9 / 1.1;
        } else if (from.equals("GBP") && to.equals("USD")) {
            return 1 / 0.9;
        } else if (from.equals("GBP") && to.equals("EUR")) {
            return 1.1 / 0.9;
        } else if (from.equals(to)) {
            return 1;
        }
        return 0;
    }
    public static void main (String[]args){
            CurrencyView.launch(CurrencyView.class);
    }
}
