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
public class DosenCtrlr {
    public double avgNilaiAkhirMK (ArrayList<User> user, String kodeMK) {
        double result = 0;
        int count = 0;
        MahasiswaCtrlr mahasiswaCtrlr = new MahasiswaCtrlr();
        ArrayList<Mahasiswa> mahasiswa = mahasiswaCtrlr.getAllMahasiswa(user);
        
        for(Mahasiswa temp : mahasiswa){
            if (temp instanceof MahasiswaSarjana) {
                MatkulAmbil tempMK = mahasiswaCtrlr.getMKMahasiswa(((MahasiswaSarjana)temp).getListMk(), kodeMK);
                if(tempMK!=null){
                    result += (tempMK.getN1()+tempMK.getN2()+tempMK.getN3())/3;
                    count++;
                }
            } else if (temp instanceof MahasiswaMagister) {
                MatkulAmbil tempMK = mahasiswaCtrlr.getMKMahasiswa(((MahasiswaMagister)temp).getListMk(), kodeMK);
                if(tempMK!=null){
                    result += (tempMK.getN1()+tempMK.getN2()+tempMK.getN3())/3;
                    count++;
                }
            }
        }
        
        if(count == 0) {
            return result;
        }
        
        return result/count;
    }
    
    public String mhsGagalMK(ArrayList<User> user, String kodeMK, ArrayList<MataKuliah> mk) {
        int result = 0;
        int count = 0;
        MahasiswaCtrlr mahasiswaCtrlr = new MahasiswaCtrlr();
        ArrayList<Mahasiswa> mahasiswa = mahasiswaCtrlr.getAllMahasiswa(user);
        String namaMK = null;
        for (MataKuliah temp : mk) {
            if (temp.getKode().equals(kodeMK)) {
                namaMK = temp.getNama();
            }
        }

        if (namaMK != null) {

            for (Mahasiswa temp : mahasiswa) {
                if (temp instanceof MahasiswaSarjana) {
                    MatkulAmbil tempMK = mahasiswaCtrlr.getMKMahasiswa(((MahasiswaSarjana) temp).getListMk(), kodeMK);
                    if (tempMK != null) {
                        float tempNA = (tempMK.getN1() + tempMK.getN2() + tempMK.getN3()) / 3;
                        if (tempNA < 56) {
                            result++;
                        }
                        count++;
                    }
                } else if (temp instanceof MahasiswaMagister) {
                    MatkulAmbil tempMK = mahasiswaCtrlr.getMKMahasiswa(((MahasiswaMagister) temp).getListMk(), kodeMK);
                    if (tempMK != null) {
                        float tempNA = (tempMK.getN1() + tempMK.getN2() + tempMK.getN3()) / 3;
                        if (tempNA < 56) {
                            result++;
                        }
                        count++;
                    }
                }
            }
            return "<" + result + "> dari <" + count + "> mahasiswa tidak lulus matakuliah <" + namaMK + ">";
        }
        return null;
    }
    
}
