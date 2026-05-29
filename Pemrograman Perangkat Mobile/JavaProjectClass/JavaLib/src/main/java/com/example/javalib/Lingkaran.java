package com.example.javalib;

public class Lingkaran {
    private double diameter;
    private final double PI = 3.14;

    public Lingkaran(double diameter) {
        this.diameter = diameter;
    }

    public double hitungLuas() {
        return 0.25 * PI * diameter * diameter;
    }

    public double hitungKeliling() {
        return PI * diameter;
    }
}
