package Controller;

import Model.Produkt;

import java.util.ArrayList;
import java.util.List;

public class ControllerProdukt {
    private List<Produkt> produktList;

    public ControllerProdukt() {
        this.produktList = new ArrayList<>();
    }

    public void addProdukt(Produkt produkt){
        produktList.add(produkt);
    }

    public void deleteProdukt(Produkt produkt){
        produktList.remove(produkt);
    }

    public void update(String name, Float preis){
        for(Produkt produkt:produktList){
            if(produkt.getName().equals(name)){
                produkt.setPreis(preis);
            }
        }
    }

    public List<Produkt> getAllProdukts(){
        return produktList;
    }
}
