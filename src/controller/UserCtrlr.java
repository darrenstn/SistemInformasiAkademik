/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import java.util.ArrayList;
import model.*;
/**
 *
 * @author Darren
 */
public class UserCtrlr {
    public ArrayList<String> UserData(ArrayList<User> user, String name) {
        ArrayList<String> result = new ArrayList<>();
        for (User temp : user) {
            if (temp.getNama().equalsIgnoreCase(name)) {
                String tempData = temp.getNama() + "\nAlamat : " + temp.getAlamat() + "\nTelepon : " + temp.getTelepon();
                if (temp instanceof Mahasiswa) {
                    tempData += "\nStatus : Mahasiswa";
                } else if (temp instanceof DosenTetap) {
                    tempData += "\nStatus : Dosen Tetap";
                } else if (temp instanceof DosenHonorer) {
                    tempData += "\nStatus : Dosen Honorer";
                } else if (temp instanceof Karyawan) {
                    tempData += "\nStatus : Karyawan";
                }
                result.add(tempData);
            }
        }
        return result;
    }
}
