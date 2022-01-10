import Controller.ControllerBestellungen;
import Controller.ControllerProdukt;
import Model.Produkt;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class TestControllerProdukt {
    ControllerBestellungen controllerBestellungen;
    ControllerProdukt controllerProdukt;
    Produkt produkt1;
    Produkt produkt2;
    Produkt produkt3;

    @BeforeEach
    public void setUp(){
        controllerProdukt= new ControllerProdukt();
        controllerBestellungen=new ControllerBestellungen(controllerProdukt);

        produkt1= new Produkt("name",25.00f);
        produkt2= new Produkt("name2",50.00f);
        produkt3= new Produkt("name3",100.00f);
        controllerProdukt.addProdukt(produkt1);
        controllerProdukt.addProdukt(produkt3);

    }

    @Test
    public void addProdukt(){
        controllerProdukt.addProdukt(produkt2);
        assertEquals(3,controllerProdukt.getAllProdukts().size());
    }

    @Test
    public void deleteProdukt(){
        controllerProdukt.deleteProdukt(produkt2);
        assertEquals(2,controllerProdukt.getAllProdukts().size());
    }

    @Test
    public void updateProdukt(){
        controllerProdukt.update("name3",75.00f);
        assertNotEquals(controllerProdukt.getAllProdukts().get(1).getPreis(),100.00f);
    }
}
