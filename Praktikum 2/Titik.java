/**
 * Titik.java 1 Maret 2023
 * Penulis   : Kharisma Andini Putri
 * NIM       : 24060121140119 
 * Deskripsi : kelas yang mendeskripsikan titik
 *
 */

class Titik { // Identity
    // Atribut/State
    private double absis;
    private double ordinat;
    static int counterTitik;

    // Konstruktor
    Titik() {
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    // Overloading
    Titik(double x, double y) {
        absis = x;
        ordinat = y;
        counterTitik++;
    }

    Titik(int x, int y) {
        absis = x;
        ordinat = y;
        counterTitik++;
    }

    // Method/Behaviour
    public void setAbsis(double x) {
        absis = x;
    }

    public void setOrdinat(double y) {
        ordinat = y;
    }

    public double getAbsis() {
        return absis;
    }

    public double getOrdinat() {
        return ordinat;
    }

    public int getCounterTitik() {
        return counterTitik;
    }

}