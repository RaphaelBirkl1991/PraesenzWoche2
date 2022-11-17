package Computershop;

public class ComputerMain implements Artikel {
    public static void main(String[] args) {

        double preis = 0;

        Artikel[] artikel = new Artikel[5];
        artikel[0] = new Festplatte(500,68, 95);
        artikel[1] = new Maus(2,true, 20);
        artikel[2] = new SSD_Speicher(45,135);
        artikel[3] = new Prozessor(500, 185);
        artikel[4] = new Tastatur(true, true, 70);


        for(Artikel a : artikel) {

            preis += a.getPreis();
        }

        System.out.println(preis);
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
        return 0;
    }


}
