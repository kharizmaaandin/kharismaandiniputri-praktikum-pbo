/*
 * Nama File    : Programmer.java
 * Nama Pembuat : Kharisma Andini Putri
 * NIM          : 24060121140119
 * Deskripsi    : Kelas yang merupakan turunan dari kelas Manajer
 * Tanggal      : 6 Mei 2023
 */

public class Programmer extends Manajer {
    private int bonus = 450000;
    public Programmer(String nama){
        super(nama);
    }
    public void tampilData(){
        System.out.println("Nama: " + this.nama + ", Gaji Pokok: " + this.gajiPokok + ", Bonus: " + this.bonus);
    }
}