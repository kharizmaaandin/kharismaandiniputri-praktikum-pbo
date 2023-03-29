/**
 * File			: Asersi2.java 
 * Nama			: Kharisma Andini Putri
 * NIM 			: 24060121140119
 * Deskripsi	: Program untuk demo asersi, yang akan menolak input jari-jari lingkaran yang bernilai nol
 * Tanggal		: 29 Maret 2023
 */

//class Lingkaran
class Lingkaran {
	private double jariJari;
	public Lingkaran(double jariJari) {
		this.jariJari = jariJari;
	}
	
	public double hitungKeliling() {
		double keliling = 2*Math.PI*jariJari;
		return keliling;
	}
}

//class Asersi2
public class Asersi2 {
	public static void main(String[] args) {
		double jariJari = 0;
		assert(jariJari>0):"jari jari tidak boleh nol!!!";
		Lingkaran l = new Lingkaran(jariJari);
		double kelilingLingkaran = l.hitungKeliling();
		System.out.println("keliling lingkaran = "
			+kelilingLingkaran);
	}
}

// PERTANYAAN : secara konsep, ada yang kurang tepat pada program Asersi2 di atas? 
// JAWAB : Yang kurang tepat yaitu ekspresi di dalam arsersi. 
//         Seharusnya ekspresi didalam asersi adalah jariJari < 0. Jika arsersi dimatikan meskipun 
//         memasukan jariJari=0 maka akan menghasilkan keliling lingkaran = 0, sebenarnya 0 tidak < 0, 
//         maka ia akan di terminate dan arsersi akan mengeluarkan pesan kesalahan dengan menujukan letak kesalahannya. 
//         Pada kelas lingkaran seharusnya juga diberikan enkapsulasi.