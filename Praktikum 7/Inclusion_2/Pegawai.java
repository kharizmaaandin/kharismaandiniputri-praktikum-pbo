/*
 * Nama File    : Pegawai.java
 * Nama Pembuat : Kharisma Andini Putri
 * NIM          : 24060121140119
 * Deskripsi    : Kelas yang mendefinisikan kelas Pegawai
 * Tanggal      : 6 Mei 2023
 */

public class Pegawai {
    protected String nama;
    protected int gajiPokok = 500000;
    public Pegawai(String nama){
        this.nama = nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public void tampilData(){
        System.out.println("Nama: " + this.nama + ", Gaji Pokok: " + this.gajiPokok);
    }
}