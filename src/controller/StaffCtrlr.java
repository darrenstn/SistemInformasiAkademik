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
public class StaffCtrlr {
    public int totalJamAjar (ArrayList<User> user, long nik) {
        Dosen tempDosen = (Dosen)getStaff(user, nik);
        int total = 0;
        
        if (tempDosen == null) {
            return -1;
        }
        
        if (tempDosen.getListMkDiajar().isEmpty()) {
            return 0;
        }
        for (MatkulAjar mk : tempDosen.getListMkDiajar()) {
            int sks = mk.getMataKuliah().getSks();
            int count = 0;
            for (PresensiStaff ps : mk.getListPresensiStaff()) {
                if (((Presensi)ps).getStatus() == StatusEnum.HADIR) {
                    count++;
                }
            }
            total += count * sks;
        }
        return total;
    }
    
    public Staff getStaff(ArrayList<User> user, long nik) {
        for(User tempUser : user) {
            if (tempUser instanceof Staff) {
                if (((Staff)tempUser).getNik() == nik) {
                    return (Staff)tempUser;
                }
            }
        }
        return null;
    }
    
    private int getPresensi (Staff staff) {
        int result = 0;
        if (staff instanceof Karyawan) {
            for (PresensiStaff ps : ((Karyawan)staff).getListPresensiStaff()) {
                if (((Presensi)ps).getStatus() == StatusEnum.HADIR) {
                    result++;
                }
            }
            return result;
        } else if (staff instanceof Dosen) {
            for (MatkulAjar mk : ((Dosen)staff).getListMkDiajar()) {
                for (PresensiStaff ps : mk.getListPresensiStaff()) {
                    if (((Presensi)ps).getStatus() == StatusEnum.HADIR) {
                       result++;
                    }
                }
            }
            return result;
        }
        return 0;
    }
    
    public double gajiStaff (ArrayList<User> user, long nik) {
        double total = 0;
        Staff tempStaff = getStaff(user, nik);
        
        if (tempStaff == null) {
            return -1;
        }
        
        int presensi = getPresensi(tempStaff);
        
        if (tempStaff instanceof Karyawan) {
            total = presensi/22 * (((Karyawan)tempStaff).getSalary());
        } else if (tempStaff instanceof DosenTetap) {
            total = presensi * 25000 + (((DosenTetap)tempStaff).getSalary());
        } else if (tempStaff instanceof DosenHonorer) {
            total = totalJamAjar(user, nik) * ((DosenHonorer)tempStaff).getHonorPerSKS();
        }
        
        return total;
    }
}
