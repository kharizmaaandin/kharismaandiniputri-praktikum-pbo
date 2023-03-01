/**
 * OperasiTitik.java 1 Maret 2023
 * Penulis   : Kharisma Andini Putri
 * NIM       : 24060121140119
 * Deskripsi : kelas yang berisi program operasi titik
 *
 */

class OperasiTitik {
	private void refleksiSumbuX(Titik titik) {
		double ordinat = titik.getOrdinat();
		ordinat = ordinat * -1;
		titik.setOrdinat(ordinat);	
	}
	
	private void refleksiSumbuY(Titik titik) {
		double absis = titik.getAbsis();
		absis = absis * -1;
		titik.setAbsis(absis);
	}
	
	public Titik refleksiX(Titik t1) {
		refleksiSumbuX(t1);
		return t1;
	}
			
	public Titik refleksiY(Titik t1) {
		refleksiSumbuY(t1);
		return t1;
	}
}

