/*
 * Nama File    : BujurSangkar.java
 * Nama Pembuat : Kharisma Andini Putri
 * NIM          : 24060121140119
 * Deskripsi    : File class implementasi method dari abstract class bangun datar
 * Tanggal      : 29 Maret 2023
 */

public class BujurSangkar extends BangunDatar{
    public double hitungLuas(double sisi){
        luas = sisi*sisi;
        return luas;
    }
	// jika implementeasi metode dari abstrak tidak dibuat maka akan terjadi errpr
    // dimana file bujursangkat tidak dapat dikompile dan tidak dianggap sebagai inherit abstract dari bangun datar
}