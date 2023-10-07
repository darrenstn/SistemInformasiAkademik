/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.User;
import controller.StaffCtrlr;
/**
 *
 * @author Darren
 */
public class StaffView {
    StaffCtrlr staffCtrlr = new StaffCtrlr();
    public void printTotalJamAjarDosen (ArrayList<User> user) {
        long nik = Long.parseLong(JOptionPane.showInputDialog("Nik : "));
        int output = staffCtrlr.totalJamAjar(user, nik);
        if(output == -1) {
            JOptionPane.showMessageDialog(null, "No Data", "Error", JOptionPane.PLAIN_MESSAGE);
            return;
        }
        JOptionPane.showMessageDialog(null, output, "Total Jam Ajar", JOptionPane.PLAIN_MESSAGE);
    }
    
    public void printGajiStaff (ArrayList<User> user) {
        long nik = Long.parseLong(JOptionPane.showInputDialog("Nik : "));
        double output = staffCtrlr.gajiStaff(user, nik);
        if(output == -1) {
            JOptionPane.showMessageDialog(null, "No Data", "Error", JOptionPane.PLAIN_MESSAGE);
            return;
        }
        JOptionPane.showMessageDialog(null, output, "Gaji", JOptionPane.PLAIN_MESSAGE);
    }
}
