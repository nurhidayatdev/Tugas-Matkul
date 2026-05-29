package com.example.javalib;

public class MyClass {
    public static void main(String[] args) {
    Lingkaran a = new Lingkaran(5);
    Lingkaran b = new Lingkaran(10);
    Lingkaran c = new Lingkaran(15);
    Lingkaran d = new Lingkaran(20);

    tampil(a, "a");
    tampil(b, "b");
    tampil(c, "c");
    tampil(d, "d");
};

    public static void tampil(Lingkaran obj, String nama) {
        System.out.println("Lingkaran " + nama + ":");
        System.out.println(" - Luas     : " + obj.hitungLuas() + " cm²");
        System.out.println(" - Keliling : " + obj.hitungKeliling() + " cm");
        System.out.println("---------------------------");
    }
}
