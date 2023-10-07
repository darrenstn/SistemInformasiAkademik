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
public class DosenHonorer extends Dosen{
    private double honorPerSKS;

    public DosenHonorer(double honorPerSKS, String departemen, ArrayList<MatkulAjar> listMkDiajar, long nik, String nama, String alamat, LocalDate ttl, String telepon) {
        super(departemen, listMkDiajar, nik, nama, alamat, ttl, telepon);
        this.honorPerSKS = honorPerSKS;
    }

    public double getHonorPerSKS() {
        return honorPerSKS;
    }

    public void setHonorPerSKS(double honorPerSKS) {
        this.honorPerSKS = honorPerSKS;
    }

    public ArrayList<MatkulAjar> getListMkDiajar() {
        return listMkDiajar;
    }

    public void setListMkDiajar(ArrayList<MatkulAjar> listMkDiajar) {
        this.listMkDiajar = listMkDiajar;
    }

    @Override
    public String toString() {
        return toString() + "\nDosenHonorer{" + "honorPerSKS=" + honorPerSKS + '}';
    }
    
}
