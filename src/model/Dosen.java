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
public class Dosen extends Staff{
    private String departemen;
    ArrayList<MatkulAjar> listMkDiajar;

    public Dosen(String departemen, ArrayList<MatkulAjar> listMkDiajar, long nik, String nama, String alamat, LocalDate ttl, String telepon) {
        super(nik, nama, alamat, ttl, telepon);
        this.departemen = departemen;
        this.listMkDiajar = listMkDiajar;
    }

    public String getDepartemen() {
        return departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    public ArrayList<MatkulAjar> getListMkDiajar() {
        return listMkDiajar;
    }

    public void setListMkDiajar(ArrayList<MatkulAjar> listMkDiajar) {
        this.listMkDiajar = listMkDiajar;
    }

    @Override
    public String toString() {
        return super.toString() + "\nDosen{" + "departemen=" + departemen + ", listMkDiajar=" + listMkDiajar + '}';
    }
}
