/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Tugas_Unit_2_Nur_Hidayat_PTIK_C;

/**
 *
 * @author HP
 */
public class perhitungan_c {
    public static void main(String[] args) {
        // c. Menyelesaikan persamaan (2x + 6) / (6 - 4) = (2x - 2) / 3
        
        int ax = 2;
        int b = 6;
        int c = 6;
        int d = 4;
        int ex = 2;
        int f = -2;
        int g = 3;
        
        // (2x + 6) / (6 - 4) = (2x -2) / 3
        int cd = c - d;
        
        // (2x + 6) * 3 = (2x - 2) * 2
        int xKiri = (ax * g);
        int yKiri = (b * g);
        int xKanan = (ex * cd);
        int yKanan = (f * cd);
        
        // 6x - 4x = -4 - 18
        int x = (xKiri - xKanan);
        int y = yKanan - yKiri;
        
        // 2x = -22
        // x = -22 / 2
        double xNilai = y / x;
        System.out.println("c. Nilai x adalah: " + xNilai);
    }
}

