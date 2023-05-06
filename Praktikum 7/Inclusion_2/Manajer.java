/*
 * Nama File    : Manajer.java
 * Nama Pembuat : Kharisma Andini Putri
 * NIM          : 24060121140119
 * Deskripsi    : Kelas yang mendefinisikan kelas Manajer 
 *                yang merupakan turunan dari kelas Pegawai
 * Tanggal      : 6 Mei 2023
 */

public class Manajer extends Pegawai {
    private int tunjangan = 700000;
    public Manajer(String nama){
        super(nama);
    }
    public void tampilData(){
        System.out.println("Nama: " + this.nama + ", Gaji Pokok: " + this.gajiPokok + ", Tunjangan: " + this.tunjangan);
    }
}