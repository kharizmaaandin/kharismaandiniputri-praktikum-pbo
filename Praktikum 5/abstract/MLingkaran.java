/*
 * Nama File    : MLingkaran.java
 * Nama Pembuat : Kharisma Andini Putri
 * NIM          : 24060121140119
 * Deskripsi    : File implementasi cara mengihtung luas lingkaran
 * Tanggal      : 29 Maret 2023
 */

import java.util.Scanner;

public class MLingkaran {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan panjang jari-jari lingkaran : ");
        double jari = scan.nextDouble();
        Lingkaran lr = new Lingkaran(jari);
        System.out.println("Luas lingkaran dengan jejari "+ jari + " satuan adalah : "+ lr.hitungLuas());
    }
}