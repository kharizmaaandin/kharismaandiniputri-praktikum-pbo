/*
 * Nama File    : BangunDatar.java
 * Nama Pembuat : Kharisma Andini Putri
 * NIM          : 24060121140119
 * Deskripsi    : File abstract class bangun datar
 * Tanggal      : 29 Maret 2023
 */

public abstract class BangunDatar{
    protected double luas;

    public abstract double hitungLuas(double sisi);

    public void setLuas(double l){
        luas = l;
    }

    public double getLuas(){
        return luas;
    }
}