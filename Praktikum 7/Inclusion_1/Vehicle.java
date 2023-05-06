/*
 * Nama File    : Vehicle.java
 * Nama Pembuat : Kharisma Andini Putri
 * NIM          : 24060121140119
 * Deskripsi    : Kelas dasar atau induk dari dua kelas turunan 
 *                yaitu Car dan Bus
 * Tanggal      : 6 Mei 2023
 */

public class Vehicle {
	void calRent(int distance, float price) {
		float fare = distance*price;
		System.out.println("vehicle price = "+fare);
	}
}
