/**
 * Nama 		: Kharisma Andini Putri
 * NIM			: 24060121140119
 * Tanggal		: 17 Mei 2023
 * File 		: ArrayListTest.java
 * Deskripsi 	: Program penggunaan objek ArrayList sebagai Collection class
*/

import java.util.ArrayList;

public class ArrayListTest{
	public static void main(String[] args){
		//inisialisasi ArrayListTest yang hanya dapat
		//berisi objek String
		ArrayList<String> strings = new ArrayList<String>();
		//menambah elemen
		strings.add("praktikum");
		strings.add("collection");
		strings.add("dan generics");
		//menghapus elemen
		strings.remove("praktikum");
		//iterasi pada keseluruhan ArrayList
		for(String s : strings) {
			System.out.print(s+" ");
		}
	}
}