/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;
import model.User;
import controller.MahasiswaCtrlr;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author Darren
 */
public class MahasiswaView {
    MahasiswaCtrlr mahasiswaCtrlr = new MahasiswaCtrlr();
    public void printNA(ArrayList<User> user) {
        long nim = Long.parseLong(JOptionPane.showInputDialog("Nim : "));
        String kodeMK = JOptionPane.showInputDialog("Kode MK : ");
        float output = mahasiswaCtrlr.NilaiAkhir(user, nim, kodeMK);
        if (output!=-1) {
            JOptionPane.showMessageDialog(null, output);
        } else {
            JOptionPane.showMessageDialog(null, "No Data");
        }
    }
    
    public void printAllMKMhs(ArrayList<User> user) {
        long nim = Long.parseLong(JOptionPane.showInputDialog("Nim : "));
        String output = mahasiswaCtrlr.allMKMhs(user, nim);
        JOptionPane.showMessageDialog(null, output);
    }
}
