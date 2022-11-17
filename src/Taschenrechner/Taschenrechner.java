package Taschenrechner;

public class Taschenrechner {
    private int ergebnis;

    public Taschenrechner() {
        ergebnis = 0;
    }

    public void plus(int addend) {
        ergebnis = ergebnis + addend;
    }

    public void minus(int subtrahend) {
        ergebnis = ergebnis - subtrahend;
    }

    public void mal(int multiplier) {
        ergebnis = ergebnis * multiplier;
    }

    public void geteilt(int divisor) {
        ergebnis = ergebnis / divisor;
    }

    public int getErgebnis() {
        return this.ergebnis;
    }

}
