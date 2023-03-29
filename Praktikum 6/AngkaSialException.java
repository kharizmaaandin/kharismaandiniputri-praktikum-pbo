/**
 * File			: AngkasialException.java 
 * Nama			: Kharisma Andini Putri
 * NIM 			: 24060121140119
 * Deskripsi	: Eksepsi buatan sendiri, menolak masukan angka 13!
 * Tanggal		: 29 Maret 2023
 */

public class AngkaSialException extends Exception {
	public AngkaSialException() {
		super("jangan masukkan angka 13 karena angka sial!!!");
	}
}