/**
 * File			: EsceptionOnArray.java 
 * Nama			: Kharisma Andini Putri
 * NIM 			: 24060121140119
 * Deskripsi	: Program penggunaan eksepsi menggunakan class library Java
 * Tanggal		: 29 Maret 2023
 */

public class ExceptionOnArray {
	public static void main(String[] args) {
		//instansi object array integer
		Integer[] arrayInteger = new Integer[4];
		try {
			arrayInteger[2] = 11;
			arrayInteger[4] = 10;
		}catch(ArrayIndexOutOfBoundsException exception) {
			exception.printStackTrace();
		}finally{
			System.out.println("clean up code...");
		}
	}
}

