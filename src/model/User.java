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
public class User {
    private String nama;
    private String alamat;
    private LocalDate ttl;
    private String telepon;
    
    public User(String nama, String alamat, LocalDate ttl, String telepon) {
        this.nama = nama;
        this.alamat = alamat;
        this.ttl = ttl;
        this.telepon = telepon;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setTtl(LocalDate ttl) {
        this.ttl = ttl;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public LocalDate getTtl() {
        return ttl;
    }

    public String getTelepon() {
        return telepon;
    }
    
    public String toString() {
        return "User{" + "nama=" + nama + ", alamat=" + alamat + ", ttl=" + ttl + ", telepon=" + telepon + '}';
    }
}
