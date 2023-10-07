/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;
import model.User;
import controller.UserCtrlr;
import javax.swing.JOptionPane;
import java.util.ArrayList;
/**
 *
 * @author Darren
 */
public class UserDataView {
    UserCtrlr userCtrlr = new UserCtrlr();
    public void printUserData(ArrayList<User> user) {
        String name = JOptionPane.showInputDialog("Nama : ");
        ArrayList<String> data = userCtrlr.UserData(user, name);
        if (data.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No Data");
        } else {
            String output = "User Data : \n";
            for(String p : data){
                output += p + "\n\n";
            }
            JOptionPane.showMessageDialog(null, output);
        }
    }
}
