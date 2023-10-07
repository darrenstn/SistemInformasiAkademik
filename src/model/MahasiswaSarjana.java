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
public class MahasiswaSarjana extends Mahasiswa{
    private ArrayList<MatkulAmbil> listMk;

    public MahasiswaSarjana(ArrayList<MatkulAmbil> listMk, long nim, String jurusan, String nama, String alamat, LocalDate ttl, String telepon) {
        super(nim, jurusan, nama, alamat, ttl, telepon);
        this.listMk = listMk;
    }

    public ArrayList<MatkulAmbil> getListMk() {
        return listMk;
    }

    public void setListMk(ArrayList<MatkulAmbil> listMk) {
        this.listMk = listMk;
    }

    @Override
    public String toString() {
        return super.toString()+ "\nMahasiswaSarjana{" + "listMk=" + listMk + '}';
    }
}
