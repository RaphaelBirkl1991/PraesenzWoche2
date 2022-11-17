package Schnittstellen;

public class Monitor implements ComputerInterface {
    public int id;
    public String produktName;

    public int groesse;
    public float gewicht;

    public String beschreibe() {
        String ausgabe = "  Größe:   " + groesse + "\n";
        ausgabe += "  Gewicht: " + gewicht + "\n";
        return ausgabe;
    }
}
