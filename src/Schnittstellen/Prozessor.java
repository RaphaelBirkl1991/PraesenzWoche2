package Schnittstellen;

public class Prozessor implements ComputerInterface {
    public int id;
    public String produktName;

    public int geschwindigkeit;
    public int anzahlKerne;

    public String beschreibe() {
        String ausgabe = "  Taktung: " + geschwindigkeit + "\n";
        ausgabe += "  Kerne:   " + anzahlKerne + "\n";
        return ausgabe;
    }
}
