/*
 * Nama File    : PolimorfismeCoercion.java
 * Nama Pembuat : Kharisma Andini Putri
 * NIM          : 24060121140119
 * Deskripsi    : Kelas yang mengimplementasi konsep polimorfisme coercion
 * Tanggal      : 6 Mei 2023
 */

public class PolimorfismeCoercion {
	public static int kuadrat(int bilangan) {
		return bilangan*bilangan;
	}
	
	public static void main(String[]args) {
	//deklarasi objek integer
	Integer bilangan = 10;
	
	//objek integer 'dipaksa' untuk diubah
	//menjadi primitif
	int hasilKuadrat = kuadrat(bilangan);
	
	System.out.printf("Hasil kuadrat %d adalah %d", 
			bilangan,
			hasilKuadrat);
	}
}