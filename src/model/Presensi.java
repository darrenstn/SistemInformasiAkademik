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
public class Presensi {
    private LocalDate tanggal;
    private StatusEnum status;

    public Presensi(LocalDate tanggal, StatusEnum status) {
        this.tanggal = tanggal;
        this.status = status;
    }

    public LocalDate getTanggal() {
        return tanggal;
    }

    public void setTanggal(LocalDate tanggal) {
        this.tanggal = tanggal;
    }

    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }
    
    public String toString() {
        return "Presensi{" + "tanggal=" + tanggal + ", status=" + status + '}';
    }
}
