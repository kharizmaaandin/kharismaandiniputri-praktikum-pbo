/**
 * Nama 		: Kharisma Andini Putri
 * NIM			: 24060121140119
 * Tanggal		: 17 Mei 2023
 * File 		: MapTest.java
 * Deskripsi 	: Program yang menggunakan Generic untuk pasangan Kunci-Nilai
*/

import java.util.*;

public class MapTest {
    public static void main(String[] args) {
        // kunci -> integer, nilai -> string
        Map<Integer, String> map = new HashMap<Integer, String>();
        // Menempatkan elemen kunci dan Nilai
        map.put(1, "satu");
        map.put(2, "dua");
		map.put(3, "tiga");
		map.put(4, "empat");
		map.put(5, "lima");
        // Mengambil keseluruhan kunci sebagai objek collection ArrayListTest
        Set<Integer> keys = map.keySet();

        // Iterasi untuk mengambil keseluruhan nilai dari kunci
        for (Integer key : keys) {
            String value = map.get(key);
            System.out.println(key + " = " + value);
        }
    }
}


// Tugas
// 1 = satu
// 2 = dua
// 3 = tiga
// 4 = empat
// 5 = lima