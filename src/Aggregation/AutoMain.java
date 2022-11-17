package Aggregation;

public class AutoMain {
    public static void main(String[] args) {

        Rad[] raeder = new Rad[4];
        raeder[0] = new Rad(35);
        raeder[1] = new Rad(35);
        raeder[2] = new Rad(35);
        raeder[3] = new Rad(35);

        Tuer[] tueren = new Tuer[4];
        tueren[0] = new Tuer(75);
        tueren[1] = new Tuer(75);
        tueren[2] = new Tuer(75);
        tueren[3] = new Tuer(75);

        Auto auto = new Auto(raeder, tueren,1000);
        System.out.println(auto.getGesamtGewicht());
    }
}
