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
public class DosenTetap extends Dosen{
    private double salary;

    public DosenTetap(double salary, String departemen, ArrayList<MatkulAjar> listMkDiajar, long nik, String nama, String alamat, LocalDate ttl, String telepon) {
        super(departemen, listMkDiajar, nik, nama, alamat, ttl, telepon);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + "\nDosenTetap{" + "salary=" + salary + '}';
    }
}
