/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugas_unit_3_nur_hidayat_ptik_c;

/**
 *
 * @author ASUS
 */
public class operator_bitwise {

    public static void main(String[] args) {
        int a = 5;  // 5 dalam biner adalah 101
        int b = 3;  // 3 dalam biner adalah 011

        // Operator AND
        int resultAnd = a & b;  // Hasilnya akan 1 (001)
        System.out.println("Hasil dari 5 & 3: " + resultAnd);

        // Operator OR
        int resultOr = a | b;  // Hasilnya akan 7 (111)
        System.out.println("Hasil dari 5 | 3: " + resultOr);
    }
}
