package Schnittstellen;

public class Main {
    public static void main(String[] args) {

        Prozessor prozessor1= new Prozessor();
        prozessor1.id = 1;
        prozessor1.produktName = "Intel Core I7";
        prozessor1.geschwindigkeit = 3000;
        prozessor1.anzahlKerne = 2;

        Prozessor prozessor2 = new Prozessor();
        prozessor2.id = 2;
        prozessor2.produktName = "Amd threadripper";
        prozessor2.geschwindigkeit = 3500;
        prozessor2.anzahlKerne = 3;

        Tastatur tastatur = new Tastatur();
        tastatur.id = 3;
        tastatur.farbe = "dunkelgrün";
        tastatur.produktName = "Microsoft Natural keyboard";

        Monitor monitor = new Monitor();
        monitor.id = 4;
        monitor.produktName = "Samsung T191T";
        monitor.groesse = 24;
        monitor.gewicht = 5.5f;

        // TODO Aufgabe B: Lege eine Bestandsliste (Array) mit den unterschiedlichen Produkten an.


        ComputerInterface[] computer = new ComputerInterface[4];
        computer[0] = prozessor1;
        computer[1] = prozessor2;
        computer[2] = tastatur;
        computer[3] = monitor;



        druckeProdukte(computer);

    }

    private static void druckeProdukte(ComputerInterface[] computer) {

        /* TODO Aufgabe C: Gib die Beschreibungen über eine separate Methode aus. */

        for(ComputerInterface c: computer){
            System.out.println(c.beschreibe());
        }
    }

}
