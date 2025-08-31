/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Tugas_Unit_2_Nur_Hidayat_PTIK_C;

/**
 *
 * @author HP
 */
public class gaji_bersih {
    public static void main(String[] args) {
        double gajiKotor = 1000000;

        double pajak = 0.10;

        double potongan = pajak * gajiKotor;

        double gajiBersih = gajiKotor - potongan;

        System.out.println("Gaji Bersih: " + gajiBersih);
    }
    
}

