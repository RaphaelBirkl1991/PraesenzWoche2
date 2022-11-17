package Computershop;

public class Maus implements Artikel {
    int anzahlTasten;
    boolean drahtlos;

    double preis;

    public Maus(int anzahlTasten, boolean drahtlos, double preis) {
        this.anzahlTasten = anzahlTasten;
        this.drahtlos = drahtlos;
        this.preis = preis;
    }

    public int getAnzahlTasten() {
        return anzahlTasten;
    }

    public boolean isDrahtlos() {
        return drahtlos;
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
