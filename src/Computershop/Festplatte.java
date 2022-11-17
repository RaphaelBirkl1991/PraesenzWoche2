package Computershop;

public class Festplatte implements Artikel {
    int groesse;
    int drehzahl;

    double preis;

    public Festplatte(int groesse, int drehzahl, double preis) {
        this.groesse = groesse;
        this.drehzahl = drehzahl;
        this.preis = preis;
    }

    public int getGroesse() {
        return groesse;
    }

    public int getDrehzahl() {
        return drehzahl;
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
