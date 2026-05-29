package com.example.catatantugaskuliah;

import java.io.Serializable;

public class TugasKuliah implements Serializable {

    private String judulTugas;
    private String mataKuliah;
    private String deskripsi;
    private boolean isSelesai;

    public TugasKuliah() {}

    public TugasKuliah(String judulTugas, String mataKuliah, String deskripsi, boolean isSelesai) {
        this.judulTugas = judulTugas;
        this.mataKuliah = mataKuliah;
        this.deskripsi = deskripsi;
        this.isSelesai = isSelesai;
    }

    public String dapatkanStatusTeks() {
        if (isSelesai) {
            return "Tugas ini SUDAH selesai dikerjakan.";
        } else {
            return "Tugas ini BELUM selesai, segera kerjakan!";
        }
    }

    public String getRingkasan() {
        return "Tugas: " + judulTugas + "\nMK: " + mataKuliah + "\nStatus: " + (isSelesai ? "Selesai" : "Belum");
    }

    public String getJudulTugas() { return judulTugas; }
    public void setJudulTugas(String judulTugas) { this.judulTugas = judulTugas; }

    public String getMataKuliah() { return mataKuliah; }
    public void setMataKuliah(String mataKuliah) { this.mataKuliah = mataKuliah; }

    public String getDeskripsi() { return deskripsi; }
    public void setDeskripsi(String deskripsi) { this.deskripsi = deskripsi; }

    public boolean isSelesai() { return isSelesai; }
    public void setSelesai(boolean selesai) { isSelesai = selesai; }
}