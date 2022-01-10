import Controller.ControllerBestellungen;
import Controller.ControllerProdukt;
import Model.Bestellungen;
import Model.Produkt;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestControllerBestellung {
    ControllerBestellungen controllerBestellungen;
    ControllerProdukt controllerProdukt;

    List<Produkt> produktList;

    Bestellungen bestellung1;
    Bestellungen bestellung2;
    Bestellungen bestellung3;

    @BeforeEach
    public void setUp(){
        controllerProdukt= new ControllerProdukt();
        controllerBestellungen=new ControllerBestellungen(controllerProdukt);

        produktList= new ArrayList<>();

        bestellung1= new Bestellungen(1,"str. strada nr 1",produktList);
        bestellung2= new Bestellungen(2,"str. strada nr 2",produktList);
        bestellung3= new Bestellungen(3,"str. strada nr 3",produktList);
        controllerBestellungen.addBestellung(bestellung1);
        controllerBestellungen.addBestellung(bestellung2);

    }

    @Test
    public void addProdukt(){
        controllerBestellungen.addBestellung(bestellung3);
        assertEquals(3,controllerBestellungen.getAlleBestellungen().size());
    }

    @Test
    public void deleteProdukt(){
       controllerBestellungen.deleteBestellung(bestellung3);
        assertEquals(2,controllerBestellungen.getAlleBestellungen().size());
    }
}
