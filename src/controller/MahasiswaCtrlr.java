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
public class MahasiswaCtrlr {
    public float NilaiAkhir(ArrayList<User> user, long nim, String kodeMK) {
        User tempUser = getMahasiswa(user, nim); 
        float result = -1;
        if(tempUser!=null) {
            Mahasiswa temp = (Mahasiswa)tempUser;
            if (temp instanceof MahasiswaSarjana){
                MatkulAmbil tempMK = getMKMahasiswa(((MahasiswaSarjana) temp).getListMk(), kodeMK);
                if (tempMK!=null) {
                    result = (tempMK.getN1()+tempMK.getN2()+tempMK.getN3())/3;
                }
            } else if (temp instanceof MahasiswaMagister) {
                MatkulAmbil tempMK = getMKMahasiswa(((MahasiswaMagister) temp).getListMk(), kodeMK);
                if (tempMK!=null) {
                    result = (tempMK.getN1()+tempMK.getN2()+tempMK.getN3())/3;
                }
            } else {
                result = (((MahasiswaDoktor)temp).getNilaiSidang1() + ((MahasiswaDoktor)temp).getNilaiSidang2() + ((MahasiswaDoktor)temp).getNilaiSidang3())/3;
            }
        }
        return result;
    }
    public User getMahasiswa(ArrayList<User> user, long nim) {
        for (User temp : user) {
            if (temp instanceof Mahasiswa){
                if(((Mahasiswa) temp).getNim()==nim) {
                    return temp;
                }
            }
        }
        return null;
    }
    
    public ArrayList<Mahasiswa> getAllMahasiswa(ArrayList<User> user) {
        ArrayList<Mahasiswa> mahasiswa = new ArrayList<>();
        for (User temp : user) {
            if (temp instanceof Mahasiswa){
                mahasiswa.add((Mahasiswa)temp);
            }
        }
        return mahasiswa;
    }
    
    public MatkulAmbil getMKMahasiswa(ArrayList<MatkulAmbil> listMK, String kodeMK){
        for(MatkulAmbil temp : listMK){
            if(temp.getMataKuliah().getKode().equals(kodeMK)) {
                return temp;
            }
        }
        return null;
    }
    
    public String allMKMhs(ArrayList<User> user, long nim) {
        String result = "No Data";
        MahasiswaCtrlr mahasiswaCtrlr = new MahasiswaCtrlr();
        
        Mahasiswa tempMhs = (Mahasiswa)mahasiswaCtrlr.getMahasiswa(user, nim);
        if(tempMhs!=null) {
            if(tempMhs instanceof MahasiswaSarjana) {
                if (!((MahasiswaSarjana) tempMhs).getListMk().isEmpty()) {
                    for (MatkulAmbil tempMK :((MahasiswaSarjana) tempMhs).getListMk()) {
                        int count = 0;
                        for(Presensi tempPresensi : tempMK.getListPresensi()) {
                            if (tempPresensi.getStatus() == StatusEnum.HADIR) {
                                count++;
                            }
                        }
                        result += tempMK.getMataKuliah().getNama() + "\nTotalPresensi : " + count + "\n\n"; 
                    }
                }
            } else if (tempMhs instanceof MahasiswaMagister) {
                if (!((MahasiswaMagister) tempMhs).getListMk().isEmpty()) {
                    for (MatkulAmbil tempMK :((MahasiswaMagister) tempMhs).getListMk()) {
                        int count = 0;
                        for(Presensi tempPresensi : tempMK.getListPresensi()) {
                            if (tempPresensi.getStatus() == StatusEnum.HADIR) {
                                count++;
                            }
                        }
                        result += tempMK.getMataKuliah().getNama() + "\nTotalPresensi : " + count + "\n\n"; 
                    }
                }
            }
        }
        
        return result;
    }
}
