/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.tugas_unit_3_nur_hidayat_ptik_c;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
public class studi_kasus {
    public static void main(String[] args) {
        
        // Meminta dua angka dari pengguna
        try (Scanner input = new Scanner(System.in)) {
            // Meminta dua angka dari pengguna
            System.out.print("Masukkan angka pertama: ");
            int angka1 = input.nextInt();
            
            System.out.print("Masukkan angka kedua: ");
            int angka2 = input.nextInt();
            
            // i. Menjumlahkan kedua angka
            int jumlah = angka1 + angka2;
            System.out.println("Jumlah kedua angka: " + jumlah);
            
            // ii. Memeriksa apakah kedua angka sama
            if (angka1 == angka2) {
                System.out.println("Kedua angka sama.");
            } else {
                System.out.println("Kedua angka berbeda.");
            }
            
            // iii. Memeriksa apakah salah satu angka lebih besar dari 100
            if (angka1 > 100 || angka2 > 100) {
                System.out.println("Salah satu angka lebih besar dari 100.");
            } else {
                System.out.println("Tidak ada angka yang lebih besar dari 100.");
            }
        }
    }
}