package Computershop;

public class Tastatur implements Artikel {
    boolean nummernblock;
    boolean drahtlos;

    double preis;
    public Tastatur(boolean nummernblock, boolean drahtlos, double preis) {
        this.nummernblock = nummernblock;
        this.drahtlos = drahtlos;
        this.preis = preis;
    }

    public boolean isNummernblock() {
        return nummernblock;
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
