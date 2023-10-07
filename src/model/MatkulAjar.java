/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.ArrayList;
/**
 *
 * @author Darren
 */
public class MatkulAjar {
    private MataKuliah mataKuliah;
    private ArrayList<PresensiStaff> listPresensiStaff;

    public MatkulAjar(MataKuliah mataKuliah, ArrayList<PresensiStaff> listPresensiStaff) {
        this.mataKuliah = mataKuliah;
        this.listPresensiStaff = listPresensiStaff;
    }

    public MataKuliah getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(MataKuliah mataKuliah) {
        this.mataKuliah = mataKuliah;
    }

    public ArrayList<PresensiStaff> getListPresensiStaff() {
        return listPresensiStaff;
    }

    public void setListPresensiStaff(ArrayList<PresensiStaff> listPresensiStaff) {
        this.listPresensiStaff = listPresensiStaff;
    }

    @Override
    public String toString() {
        return super.toString() + "\nMatkulAjar{" + "listPresensiStaff=" + listPresensiStaff + '}';
    }
    
}
