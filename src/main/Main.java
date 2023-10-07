/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import model.DosenTetap;
import model.MatkulAjar;
import model.PresensiStaff;
import model.StatusEnum;
import model.User;
import model.MataKuliah;
import view.MenuView;


/**
 *
 * @author Darren
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<User> user = new ArrayList<>();
        ArrayList<MataKuliah> mk = new ArrayList<>();
        
        mk.add(new MataKuliah("IF-1", 2, "Mk1"));
        
        ArrayList<MatkulAjar> listMkDiajar = new ArrayList<>();
        ArrayList<PresensiStaff> listPresensiStaff = new ArrayList<>();
        listPresensiStaff.add(new PresensiStaff(LocalTime.now(), LocalDate.now(), StatusEnum.HADIR));
        listMkDiajar.add(new MatkulAjar(new MataKuliah("IF-1", 2, "Mk1"), listPresensiStaff));
        User dosenTetap = new DosenTetap(1, "IF", listMkDiajar, 111, "Dosen1", "Alamat1", LocalDate.now(), "012345678");
        
        user.add(dosenTetap);
        
        MenuView menu = new MenuView(user, mk);
        menu.menu();
    }
}

