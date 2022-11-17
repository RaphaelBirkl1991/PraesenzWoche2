package Computershop;

public class SSD_Speicher implements Artikel {
    int groesse;

    double preis;


    public SSD_Speicher(int groesse, double preis) {
        this.groesse = groesse;
        this.preis = preis;
    }

    public int getGroesse() {
        return groesse;
    }

    @Override
    public void getName() {

    }

    @Override
    public void getHerstellername() {

    }

    @Override
    public void getArtikelnummer() {

    }

    @Override
    public double getPreis() {
        return preis;

    }


}
