/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Tugas_Unit_2_Nur_Hidayat_PTIK_C;

/**
 *
 * @author HP
 */
public class konversi {
    public static void main(String[] args) {
        // 1. Konversi dari int ke double
        int intVal = 10;
        double doubleVal = (double) intVal;

        // 2. Konversi dari double ke int
        double doubleVal2 = 9.78;
        int intVal2 = (int) doubleVal2;

        // 3. Konversi dari String ke int
        String strVal = "100";
        int intVal3 = Integer.parseInt(strVal);

        // 4. Konversi dari int ke String
        int intVal4 = 50;
        String strVal2 = Integer.toString(intVal4);

        // 5. Konversi dari char ke int
        char charVal = 'A';
        int intVal5 = (int) charVal;
    }
    
}

