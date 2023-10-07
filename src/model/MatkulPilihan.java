/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Darren
 */
public class MatkulPilihan extends MataKuliah{
    private int jumlahMinimumMhs;

    public MatkulPilihan(int jumlahMinimumMhs, String kode, int sks, String nama) {
        super(kode, sks, nama);
        this.jumlahMinimumMhs = jumlahMinimumMhs;
    }

    public int getJumlahMinimumMhs() {
        return jumlahMinimumMhs;
    }

    public void setJumlahMinimumMhs(int jumlahMinimumMhs) {
        this.jumlahMinimumMhs = jumlahMinimumMhs;
    }

    @Override
    public String toString() {
        return super.toString() + "\nMatkulPilihan{" + "jumlahMinimumMhs=" + jumlahMinimumMhs + '}';
    }
    
}
