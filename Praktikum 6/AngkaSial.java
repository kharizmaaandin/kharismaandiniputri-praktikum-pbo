/**
 * File			: Angkasial.java 
 * Nama			: Kharisma Andini Putri
 * NIM 			: 24060121140119
 * Deskripsi	: Program penggunaan excetion buatan sendiri
                  Pengenalan klausa 'throw' dan 'throws'
 * Tanggal		: 29 Maret 2023
 */

public class AngkaSial{
	
	public void cobaAngka(int angka) throws AngkaSialException {
		if(angka==13) {
			throw new AngkaSialException();
		}
		System.out.println(angka+" bukan angka sial");
	}
	
	public static void main(String[] args) {
		AngkaSial as = new AngkaSial();
		try {
			as.cobaAngka(10);
			as.cobaAngka(13);
			as.cobaAngka(12);
		}catch(AngkaSialException ase) {
			//method getMessage() telah ada pada kelas "Exception"
			System.out.println(ase.getMessage());
			System.out.println("hati-hati memasukkan angka!!!");
		}
	}
}

// PERTANYAAN :
// 1*Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi?
// 2*Apakah baris 21 pada AngkaSial.java di atas dieksekusi?

// JAWAB :
// 1. Ketika terjadi eksepsi yaitu berupa masukannya angka 13 maka 
//    method cobaAngka akan langsung melakukan throws dan baris 12 
//    tidak akan tereksekusi karena masukannya adalah angka 13.
// 2. Ketika terjadi eksepsi yaitu berupa masuknya angka 13 maka 
//    baris 21 akan dieksekusi, dan langsung melakukan throw ke 
//    AngkaSialException yang nantinya akan memberikan output pesan.