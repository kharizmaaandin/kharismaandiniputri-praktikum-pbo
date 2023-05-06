/*
 * Nama File    : PegawaiDanGaji.java
 * Nama Pembuat : Kharisma Andini Putri
 * NIM          : 24060121140119
 * Deskripsi    : Program yang mencetak gaji 
 *                dari tiga objek Pegawai yang berbeda
 * Tanggal      : 6 Mei 2023
 */

public class PegawaiDanGaji{
	public static void main (String args[]){
		Pegawai pegawai = new Programmer ("Mira");
		Pegawai pegawai2 = new Manajer("Joko");
		Pegawai pegawai3 = new Manajer("Argo");
		
		Payroll payroll = new Payroll();
		payroll.cetakGaji(pegawai);
		payroll.cetakGaji(pegawai2);
		payroll.cetakGaji(pegawai3);
	}
}