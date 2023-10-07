/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Darren
 */
public class MahasiswaMagister extends Mahasiswa{
    private ArrayList<MatkulAmbil> listMk;
    private String judulPenelitianTesis;

    public MahasiswaMagister(ArrayList<MatkulAmbil> listMk, String judulPenelitianTesis, long nim, String jurusan, String nama, String alamat, LocalDate ttl, String telepon) {
        super(nim, jurusan, nama, alamat, ttl, telepon);
        this.listMk = listMk;
        this.judulPenelitianTesis = judulPenelitianTesis;
    }

    public ArrayList<MatkulAmbil> getListMk() {
        return listMk;
    }

    public void setListMk(ArrayList<MatkulAmbil> listMk) {
        this.listMk = listMk;
    }

    public String getJudulPenelitianTesis() {
        return judulPenelitianTesis;
    }

    public void setJudulPenelitianTesis(String judulPenelitianTesis) {
        this.judulPenelitianTesis = judulPenelitianTesis;
    }

    @Override
    public String toString() {
        return super.toString() + "\nMahasiswaMagister{" + "listMk=" + listMk + ", judulPenelitianTesis=" + judulPenelitianTesis + '}';
    }
    
}
