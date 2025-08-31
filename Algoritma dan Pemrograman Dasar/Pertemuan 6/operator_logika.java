/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugas_unit_3_nur_hidayat_ptik_c;

/**
 *
 * @author ASUS
 */
public class operator_logika {
    public static void main(String[] args) {
        int totalSKS = 18; // Jumlah SKS yang diambil
        boolean sudahLulusPrasyarat = true; // Status kelulusan prasyarat

        // Menggunakan operator &&
        if (totalSKS <= 24 && sudahLulusPrasyarat) {
            System.out.println("Mahasiswa dapat melanjutkan ke semester berikutnya.");
        } else {
            System.out.println("Mahasiswa tidak dapat melanjutkan ke semester berikutnya.");
        }

        // Menggunakan operator ||
        boolean memilikiKehadiranBaik = false; // Status kehadiran
        if (totalSKS > 24 || !memilikiKehadiranBaik) {
            System.out.println("Mahasiswa perlu mengatur pengambilan SKS atau memperbaiki kehadiran.");
        } else {
            System.out.println("Mahasiswa dalam kondisi baik untuk melanjutkan.");
        }
    }
}
