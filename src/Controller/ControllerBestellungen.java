package Controller;

import Model.Bestellungen;

import java.util.ArrayList;
import java.util.List;

public class ControllerBestellungen {

    private List<Bestellungen> bestellungenList;
    ControllerProdukt controllerProdukt;

    public ControllerBestellungen( ControllerProdukt controllerProdukt) {
        this.bestellungenList = new ArrayList<>();
        this.controllerProdukt = controllerProdukt;
    }

    public void addBestellung(Bestellungen bestellungen){
        bestellungenList.add(bestellungen);
    }

    public void deleteBestellung(Bestellungen bestellungen){
        bestellungenList.remove(bestellungen);
    }

    public void updateBestellung(int bestellungsid, String adresse){
        for(Bestellungen bestellung:bestellungenList){
            if(bestellungsid==bestellung.getBestellnr()){
                bestellung.setAdresse(adresse);
            }
        }
    }

    public List<Bestellungen> getAlleBestellungen(){
        return bestellungenList;
    }

    public List<Bestellungen> sortNachGesamtpreis(){
        return bestellungenList;
    }

    public List<Bestellungen> filterNachProdukt(){
        return  bestellungenList;
    }
}
