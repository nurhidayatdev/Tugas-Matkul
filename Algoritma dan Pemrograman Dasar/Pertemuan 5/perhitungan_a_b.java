/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Tugas_Unit_2_Nur_Hidayat_PTIK_C;

/**
 *
 * @author HP
 */
public class perhitungan_a_b {
    public static void main(String[] args) {
         // a. Hitung 2^8 + 4^4
        double hasilA = Math.pow(2, 8) + Math.pow(4, 4);
        System.out.println("a. Hasil dari 2^8 + 4^4 = " + hasilA);

        // b. Hitung (2^2 + 4^1) / 2^2
        double hasilB = (Math.pow(2, 2) + Math.pow(4, 1)) / Math.pow(2, 2);
        System.out.println("b. Hasil dari (2^2 + 4^1) / 2^2 = " + hasilB);
    }
}

