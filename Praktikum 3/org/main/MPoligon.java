/**
 * File         : MPoligon.java 10/03/2023
 * Penulis      : Kharisma Andini Putri
 * Deskripsi    : Driver class untuk poligon, persegi panjang, dan segitiga
 */

package org.main;

import org.bangundatar.*;

public class MPoligon{
    public static void main(String[] args){
        PersegiPanjang persegi = new PersegiPanjang(10,10,4);
		Segitiga segitiga = new Segitiga(3,4,5,3);
		
        segitiga.printInfo();
        System.out.println("Panjang Sisi Miring adalah : "+segitiga.Pythagoras());
		
        persegi.printInfo();
        System.out.println("Luas Persegi Panjang : "+persegi.hitungLuas());
    }
}