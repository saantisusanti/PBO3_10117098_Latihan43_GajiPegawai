/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117098_latihan43_gajipegawai;

/**
 *
 * @author 
 * NAMA     : Santi Susanti
 * KELAS    : PBO3
 * NIM      : 10117098
 * Deskripsi Program : Program penghitung total gaji dari gaji pokok dan 
 *                     tunjangan yang diinput oleh user
 */
public class GajiPegawai {
    private String nama;
    private String alamat;
    private int uangTransportasi;
    private int uangTunjangan;
    private int gajiPokok;
    private int totalGaji;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getUangTransportasi() {
        return uangTransportasi;
    }

    public void setUangTransportasi(int uangTransportasi) {
        this.uangTransportasi = uangTransportasi;
    }

    public int getUangTunjangan() {
        return uangTunjangan;
    }

    public void setUangTunjangan(int uangTunjangan) {
        this.uangTunjangan = uangTunjangan;
    }

    public int getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(int gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public int getTotalGaji() {
        return totalGaji;
    }

    public void setTotalGaji(int totalGaji) {
        this.totalGaji = totalGaji;
    }

    public int totalGaji(int uangTunjangan, int uangTransportasi, int gajiPokok,
            int totalGaji) {
        
        totalGaji = uangTunjangan+uangTransportasi+gajiPokok;
        
        return this.totalGaji = totalGaji;
    }

    public void tampilData(String nama, String alamat, int uangTunjangan, 
            int uangTransport, int gajiPokok,
                           int totalGaji) {
        System.out.println("\n\n### Data Gaji Karyawan PT. KAKATU ###");
        System.out.println("-------------------------------------");
        System.out.println("Nama Karyawan \t  : "+nama);
        System.out.println("Alamat \t\t  : "+alamat);
        System.out.println("Uang Tunjangan \t  : Rp "+uangTunjangan);
        System.out.println("Uang Transportasi : Rp "+uangTransport);
        System.out.println("Gaji Pokok \t  : Rp "+gajiPokok);
        System.out.println("Total Gaji \t  : Rp "+totalGaji);
    }
}
