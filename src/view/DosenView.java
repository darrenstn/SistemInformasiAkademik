/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.User;
import model.MataKuliah;
import controller.DosenCtrlr;

/**
 *
 * @author Darren
 */
public class DosenView {
    DosenCtrlr dosenCtrlr = new DosenCtrlr();
    public void printNR(ArrayList<User> user) {
        String kodeMK = JOptionPane.showInputDialog("Kode MK : ");
        double output = dosenCtrlr.avgNilaiAkhirMK(user, kodeMK);
        JOptionPane.showMessageDialog(null, output, "Nilai Akhir", JOptionPane.PLAIN_MESSAGE);
    }
    
    public void printMhsGagalMK(ArrayList<User> user, ArrayList<MataKuliah> mk) {
        String kodeMK = JOptionPane.showInputDialog("Kode MK : ");
        String output = dosenCtrlr.mhsGagalMK(user, kodeMK, mk);
        JOptionPane.showMessageDialog(null, output, "Mahasiswa Gagal MK", JOptionPane.PLAIN_MESSAGE);
    }
}
