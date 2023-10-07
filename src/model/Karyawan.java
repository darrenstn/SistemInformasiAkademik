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
public class Karyawan extends Staff{
    private double salary;
    ArrayList<PresensiStaff> listPresensiStaff;

    public Karyawan(double salary, ArrayList<PresensiStaff> listPresensiStaff, long nik, String nama, String alamat, LocalDate ttl, String telepon) {
        super(nik, nama, alamat, ttl, telepon);
        this.salary = salary;
        this.listPresensiStaff = listPresensiStaff;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public ArrayList<PresensiStaff> getListPresensiStaff() {
        return listPresensiStaff;
    }

    public void setListPresensiStaff(ArrayList<PresensiStaff> listPresensiStaff) {
        this.listPresensiStaff = listPresensiStaff;
    }

    @Override
    public String toString() {
        return super.toString() + "\nKaryawan{" + "salary=" + salary + ", listPresensiStaff=" + listPresensiStaff + '}';
    }

    
}
