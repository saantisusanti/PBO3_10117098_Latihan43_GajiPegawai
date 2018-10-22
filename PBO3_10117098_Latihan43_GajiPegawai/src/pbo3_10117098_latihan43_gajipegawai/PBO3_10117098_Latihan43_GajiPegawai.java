/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117098_latihan43_gajipegawai;
import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : Santi Susanti
 * KELAS    : PBO3
 * NIM      : 10117098
 * Deskripsi Program : Program penghitung total gaji dari gaji pokok dan 
 *                     tunjangan yang diinput oleh user
 */
public class PBO3_10117098_Latihan43_GajiPegawai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scn1 = new Scanner(System.in);
        Scanner scn2 = new Scanner(System.in);
        Scanner scn3 = new Scanner(System.in);
        GajiPegawai gp = new GajiPegawai();

        System.out.println("### Data Gaji Karyawan PT. KAKATU ###");
        System.out.println("-------------------------------------");
        System.out.print("Nama Karyawan \t    : ");
        gp.setNama(scn1.nextLine());
        System.out.print("Alamat \t\t    : ");
        gp.setAlamat(scn2.nextLine());
        System.out.print("Uang Tunjangan \t    : Rp ");
        gp.setUangTunjangan(scn3.nextInt());
        System.out.print("Uang Transportasi   : Rp ");
        gp.setUangTransportasi(scn3.nextInt());
        System.out.print("Gaji Pokok \t    : Rp ");
        gp.setGajiPokok(scn3.nextInt());
        gp.totalGaji(gp.getUangTransportasi(), gp.getUangTunjangan(), 
                gp.getGajiPokok(), gp.getTotalGaji());
        System.out.println("Total Gaji \t    : Rp "+gp.getTotalGaji());

        gp.tampilData(gp.getNama(),gp.getAlamat(),gp.getUangTunjangan(),
                gp.getUangTransportasi(),gp.getGajiPokok(), gp.getTotalGaji());
    }
    
}
