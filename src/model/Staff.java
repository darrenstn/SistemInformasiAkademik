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
public class Staff extends User{
    private long nik;

    public Staff(long nik, String nama, String alamat, LocalDate ttl, String telepon) {
        super(nama, alamat, ttl, telepon);
        this.nik = nik;
    }

    public long getNik() {
        return nik;
    }

    public void setNik(long nik) {
        this.nik = nik;
    }

    @Override
    public String toString() {
        return super.toString() + "\nStaff{" + "nik=" + nik + '}';
    }
    
}
