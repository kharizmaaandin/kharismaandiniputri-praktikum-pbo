/**
 * MOperasiTitik.java 1 Maret 2023
 * Penulis   : Kharisma Andini Putri
 * NIM       : 24060121140119
 * Deskripsi : kelas yang berisi program utama yang memanfaatkan 
 *             kelas OperasiTitik
 */
 
 class MOperasiTitik {
	public static void main(String[]args) {
		Titik t1 = new Titik(5.0, 3.0);
		OperasiTitik op = new OperasiTitik();
		
		System.out.println("Titik("+t1.getAbsis()+","+t1.getOrdinat()+")");
		
		op.refleksiX(t1);
		System.out.println("\nTitik setelah refleksi sumbu X");
		System.out.println("Titik("+t1.getAbsis()+","+t1.getOrdinat()+")");
		
		op.refleksiY(t1);
		System.out.println("\nTitik setelah refleksi sumbu Y");
		System.out.println("Titik("+t1.getAbsis()+","+t1.getOrdinat()+")");
	}
}		