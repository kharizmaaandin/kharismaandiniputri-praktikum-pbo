/**
 * Titik.java 1 Maret 2023
 * Penulis   : Kharisma Andini Putri
 * NIM       : 24060121140119 
 * Deskripsi : kelas yang mendeskripsikan titik
 *
 */

 class Titik {
	double absis;
	double ordinat;
	static int counterTitik;
	
	Titik() {
		absis = 0;
		ordinat = 0;
		counterTitik++;
	}
	
	Titik(double x, double y){
		absis = x;
		ordinat = y;
		counterTitik++;
	}
	
	void setAbsis(double a) {
		absis = a;
	}
	
	double getAbsis() {
		return absis;
	}
	
	void setOrdinat(double b) {
		ordinat = b;
	}
	
	double getOrdinat() {
		return ordinat;
	}
	
	double getCounterTitik() {
		return counterTitik;
	}
	
	void printTitik() {
		System.out.println("("+absis+","+ordinat+")");
	}
}