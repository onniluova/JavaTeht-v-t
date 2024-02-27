package src.Moduuli6.tehtava2.model2;

import java.util.ArrayList;

public class Currency {

    ArrayList<String> valuutat;

    public Currency() {
        valuutat = new ArrayList<String>();

        valuutat.add("EUR");
        valuutat.add("USD");
        valuutat.add("GBP");
    }

    public ArrayList<String> getValuutat() {
        return valuutat;
    }
}
