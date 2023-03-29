
/*
 * Nama File    : Lingkaran.java
 * Nama Pembuat : Kharisma Andini Putri
 * NIM          : 24060121140119
 * Deskripsi    : File kelas implementasi IArea berupa cara menghitung luas lingkaran
 * Tanggal      : 29 Maret 2023
 */

import static java.lang.Math.PI;

class Lingkaran implements IArea{
    private double jejari;

    public Lingkaran(double r){
        jejari = r;
    }

    public double hitungLuas(){
        return PI*jejari*jejari;
    }
}