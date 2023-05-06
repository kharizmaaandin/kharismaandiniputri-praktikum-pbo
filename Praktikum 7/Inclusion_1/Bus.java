/*
 * Nama File    : Bus.java
 * Nama Pembuat : Kharisma Andini Putri
 * NIM          : 24060121140119
 * Deskripsi    : Kelas yang implementasi class Bus yang 
 *                merupakan turunan dari class Vehicle
 * Tanggal      : 6 Mei 2023
 */

public class Bus extends Vehicle {
	void calRent(int jarak, float harga) {
		float fare = jarak*harga;
		fare=fare-10000.00f;
		System.out.println("harga sewa bus ="+fare);
	}
}