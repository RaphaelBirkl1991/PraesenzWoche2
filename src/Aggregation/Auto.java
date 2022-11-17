package Aggregation;

public class Auto {
    private Rad[] raeder;
    private Tuer[] tueren;
    private double gewicht = 1000;

    public Auto(Rad[] raeder, Tuer[] tueren, double gewicht) {
        this.raeder = raeder;
        this.tueren = tueren;
        this.gewicht = gewicht;
    }

    public double getGesamtGewicht() {
        double gesamtGewicht;

        gewicht = gesamtGewicht = 1000;


        for (Rad rad: raeder) {
            gesamtGewicht = gesamtGewicht + rad.getGewicht();
        }

        for (Tuer tuer : tueren) {
            gesamtGewicht = gesamtGewicht + tuer.getGewicht();
        }

        return gesamtGewicht;

    }
}