/**
 * File         : MPoligon.java 20/03/2023
 * Penulis      : Kharisma Andini Putri
 * Deskripsi    : Driver class untuk poligon, bujur sangkar, dan segitiga
 */

package org.main;

import org.bangundatar.Segitiga;
import org.bangunruang.LimasSegitiga;

public class MPoligon{
	public static void main(String[] args){
		Segitiga segitiga = new Segitiga(4,5);
		LimasSegitiga limassegitiga = new LimasSegitiga(segitiga);
		System.out.println("Luas Alas Limas Segitiga adalah : "+limassegitiga.hitungLuasAlas());
		System.out.println("Volume Limas Segitiga adalah : "+limassegitiga.hitungVolume());
	}
}