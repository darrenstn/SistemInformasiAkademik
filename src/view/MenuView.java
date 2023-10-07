/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.User;
import model.MataKuliah;
/**
 *
 * @author Darren
 */
public class MenuView {
    ArrayList<User> user;
    ArrayList<MataKuliah> mk;
    UserDataView userDataView = new UserDataView();
    MahasiswaView mahasiswaView = new MahasiswaView();
    DosenView dosenView = new DosenView();
    StaffView staffView = new StaffView();
    
    public MenuView(ArrayList<User> user, ArrayList<MataKuliah> mk) {
        this.user = user;
        this.mk = mk;
    }
    
    public void menu () {
        boolean r = true;
        while (r) {
            int n = Integer.parseInt(JOptionPane.showInputDialog("Menu\n1. Print User Data\n2. Print Nilai Akhir\n3. Print Rata-Rata Nilai Akhir\n4. Print Berapa Banyak Mahasiswa Tidak Lulus MK\n5. Print Matkul Ambil Apa Saja untuk Mahasiswa Tertentu\n6. Print Total Jam Seorang Dosen Mengajar\n7. Print Gaji Seorang Staff\n8. Keluar\n\nInput Nomer Menu"));
            if (n==1) {
                userDataView.printUserData(user);
            } else if (n==2) {
                mahasiswaView.printNA(user);
            } else if (n==3) {
                dosenView.printNR(user);
            } else if (n==4) {
                dosenView.printMhsGagalMK(user, mk);
            } else if (n==5) {
                mahasiswaView.printAllMKMhs(user);
            } else if (n==6) {
                staffView.printTotalJamAjarDosen(user);
            } else if (n==7) {
                staffView.printGajiStaff(user);
            } else if (n==8) {
                r = false;
            } else {
                JOptionPane.showMessageDialog(null, "Menu tidak ada", "Error", JOptionPane.PLAIN_MESSAGE);
            }
        }
    }
}
