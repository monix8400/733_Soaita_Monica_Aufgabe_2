package View;

import Controller.ControllerBestellungen;
import Controller.ControllerProdukt;
import Model.Bestellungen;
import Model.Produkt;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ControllerProdukt controllerProdukt = new ControllerProdukt();
        ControllerBestellungen controllerBestellungen = new ControllerBestellungen(controllerProdukt);

        List<Produkt>  produktList= new ArrayList<>();

        Produkt produkt1 = new Produkt("name", 25.00f);
        Produkt produkt2 = new Produkt("name2", 50.00f);
        Produkt produkt3 = new Produkt("name3", 100.00f);
        controllerProdukt.addProdukt(produkt1);
        controllerProdukt.addProdukt(produkt3);

        Bestellungen bestellung1 = new Bestellungen(1, "str. strada nr 1", produktList);
        Bestellungen bestellung2 = new Bestellungen(2, "str. strada nr 2", produktList);
        Bestellungen bestellung3 = new Bestellungen(3, "str. strada nr 3", produktList);
        controllerBestellungen.addBestellung(bestellung1);
        controllerBestellungen.addBestellung(bestellung2);

        System.out.println(controllerBestellungen.getAlleBestellungen());
    }
}
