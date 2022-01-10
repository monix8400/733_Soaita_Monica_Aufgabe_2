package Model;

import java.util.List;

public class Bestellungen {
    private int bestellnr;
    private String adresse;
    private List<Produkt> produktList;

    public Bestellungen(int bestellnr, String adresse, List<Produkt> produktList) {
        this.bestellnr = bestellnr;
        this.adresse = adresse;
        this.produktList = produktList;
    }

    public int getBestellnr() {
        return bestellnr;
    }

    public void setBestellnr(int bestellnr) {
        this.bestellnr = bestellnr;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public List<Produkt> getProduktList() {
        return produktList;
    }

    public void setProduktList(List<Produkt> produktList) {
        this.produktList = produktList;
    }

    @Override
    public String toString() {
        return "Bestellungen{" +
                "bestellnr=" + bestellnr +
                ", adresse='" + adresse + '\'' +
                ", produktList=" + produktList +
                '}';
    }
}
