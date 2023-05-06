/*
 * Nama File    : Car.java
 * Nama Pembuat : Kharisma Andini Putri
 * NIM          : 24060121140119
 * Deskripsi    : Mendefinisikan kelas Car yang 
 *                merupakan turunan dari kelas Vehicle
 * Tanggal      : 6 Mei 2023
 */

public class Car extends Vehicle {
	void calRent(int jarak, float harga) {
		float fare = jarak*harga;
		fare=fare-40000.00f;
		System.out.println("harga sewa mobil ="+fare);
	}
}