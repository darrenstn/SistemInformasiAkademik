/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;


/**
 *
 * @author Darren
 */
public class MahasiswaDoktor extends Mahasiswa{
    private String judulPenelitianDisertasi;
    private float nilaiSidang1, nilaiSidang2, nilaiSidang3;

    public MahasiswaDoktor(String judulPenelitianDisertasi, float nilaiSidang1, float nilaiSidang2, float nilaiSidang3, long nim, String jurusan, String nama, String alamat, LocalDate ttl, String telepon) {
        super(nim, jurusan, nama, alamat, ttl, telepon);
        this.judulPenelitianDisertasi = judulPenelitianDisertasi;
        this.nilaiSidang1 = nilaiSidang1;
        this.nilaiSidang2 = nilaiSidang2;
        this.nilaiSidang3 = nilaiSidang3;
    }

    public String getJudulPenelitianDisertasi() {
        return judulPenelitianDisertasi;
    }

    public void setJudulPenelitianDisertasi(String judulPenelitianDisertasi) {
        this.judulPenelitianDisertasi = judulPenelitianDisertasi;
    }

    public float getNilaiSidang1() {
        return nilaiSidang1;
    }

    public void setNilaiSidang1(float nilaiSidang1) {
        this.nilaiSidang1 = nilaiSidang1;
    }

    public float getNilaiSidang2() {
        return nilaiSidang2;
    }

    public void setNilaiSidang2(float nilaiSidang2) {
        this.nilaiSidang2 = nilaiSidang2;
    }

    public float getNilaiSidang3() {
        return nilaiSidang3;
    }

    public void setNilaiSidang3(float nilaiSidang3) {
        this.nilaiSidang3 = nilaiSidang3;
    }

    @Override
    public String toString() {
        return super.toString() + "\nMahasiswaDoktor{" + "judulPenelitianDisertasi=" + judulPenelitianDisertasi + ", nilaiSidang1=" + nilaiSidang1 + ", nilaiSidang2=" + nilaiSidang2 + ", nilaiSidang3=" + nilaiSidang3 + '}';
    }

    
}
