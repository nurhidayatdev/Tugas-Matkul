/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugas_unit_3_nur_hidayat_ptik_c;

/**
 *
 * @author ASUS
 */
public class operator_penugasan {

    public static void main(String[] args) {
        int a = 5;
        int b = 3;

        // Menggunakan operator penugasan +=
        a += b; // a sekarang 8
        System.out.println("Hasil a += b: " + a);

        // Menggunakan penugasan biasa
        a = 5; // Reset a ke nilai awal
        a = a + b; // a sekarang 8
        System.out.println("Hasil a = a + b: " + a);
    }
}
