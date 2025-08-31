/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Tugas_Unit_2_Nur_Hidayat_PTIK_C;

/**
 *
 * @author HP
 */
public class cicilan_haji {
    public static void main(String[] args) {
       
        double biayaHaji = 50000000; 
        double tabunganRumah = 20000000; 
        double tabunganPertama = 10000000; 
        int sisaBulan = 23; 

        double sisaTabungan = biayaHaji - tabunganPertama;

        double cicilanPerBulan = sisaTabungan / sisaBulan;

        System.out.println("Cicilan yang harus ditabung per bulan: Rp " + cicilanPerBulan);
    }
    
}

