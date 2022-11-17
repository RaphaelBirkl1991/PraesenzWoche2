package Computershop;

public class Prozessor implements Artikel {
    int frequenz;

    double preis;

    public Prozessor(int frequenz, double preis) {
        this.frequenz = frequenz;
        this.preis = preis;
    }

    public int getFrequenz() {
        return frequenz;
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
