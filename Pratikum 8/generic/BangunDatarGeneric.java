/**
 * Nama 		: Kharisma Andini Putri
 * NIM			: 24060121140119
 * Tanggal		: 17 Mei 2023
 * File 		: BangunDatarGeneric.java
 * Deskripsi 	: Kelas konstruksi generic untuk BangunDatar
*/

public class BangunDatarGeneric <T1234 extends BangunDatar>{
	private T1234 bangunDatar;

	public void set (T1234 tipeBangunDatar){
		bangunDatar = tipeBangunDatar;
	}
	public T1234 get(){
		return bangunDatar;
	}
	public double hitungKeliling(){
		return bangunDatar.hitungKeliling();
	}
}

// Tugas
// Cobalah pada saat praktikum : Gantilah ‘T’ (dan segala T) pada BangunDatarGeneric.java diganti 
// dengan karakter yang lain seperti, T1,T2,T1234. Simpulkan apa yang anda lakukan !

// JAWAB
// Penggantian 'T' dengan karakter lain seperti 'T1', 'T2', atau 'T1234' pada kelas BangunDatarGeneric,
// karena pada dasarnya kita hanya mengganti nama parameter generik tersebut. 
// Nama parameter generik tersebut hanya berfungsi sebagai penanda jenis tipe data yang digunakan, 
// dan nama yang diberikan tidak memiliki pengaruh pada fungsionalitas kode.
// Jadi, mengganti 'T' dengan 'T1', 'T2', atau 'T1234' tidak akan mempengaruhi cara kerja kelas BangunDatarGeneric,
// karena T itu merupakan singkatan dari type data yang bisa diganti dengan karakter lain.