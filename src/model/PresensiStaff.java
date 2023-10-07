/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.time.LocalDate;
import java.time.LocalTime;
/**
 *
 * @author Darren
 */
public class PresensiStaff extends Presensi{
    private LocalTime jam;

    public PresensiStaff(LocalTime jam, LocalDate tanggal, StatusEnum status) {
        super(tanggal, status);
        this.jam = jam;
    }

    public LocalTime getJam() {
        return jam;
    }

    public void setJam(LocalTime jam) {
        this.jam = jam;
    }

    @Override
    public String toString() {
        return super.toString() + "\nPresensiStaff{" + "jam=" + jam + '}';
    }
    
}
