/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App;

/**
 *
 * @author LENOVO
 */
public class Resources {
    
    int id_umkm;
    String nama_umkm;
    String jenis_umkm;
    String bidang_umkm;
    String pemilik_umkm;
    String alamat_umkm;
    String kota_kabupaten;

    public Resources() {
    }

    public Resources(int id_umkm, String nama_umkm, String jenis_umkm, String bidang_umkm, String pemilik_umkm, String alamat_umkm) {
        this.id_umkm = id_umkm;
        this.nama_umkm = nama_umkm;
        this.jenis_umkm = jenis_umkm;
        this.bidang_umkm = bidang_umkm;
    }

    public int getId_umkm() {
        return id_umkm;
    }

    public void setId_umkm(int id_umkm) {
        this.id_umkm = id_umkm;
    }

    public String getNama_umkm() {
        return nama_umkm;
    }

    public void setNama_umkm(String nama_umkm) {
        this.nama_umkm = nama_umkm;
    }

    public String getJenis_umkm() {
        return jenis_umkm;
    }

    public void setJenis_umkm(String jenis_umkm) {
        this.jenis_umkm = jenis_umkm;
    }

    public String getBidang_umkm() {
        return bidang_umkm;
    }

    public void setBidang_umkm(String bidang_umkm) {
        this.bidang_umkm = bidang_umkm;
    }
    
    public String getPemilik_umkm() {
        return pemilik_umkm;
    }

    public void setPemilik_umkm(String pemilik_umkm) {
        this.pemilik_umkm = pemilik_umkm;
    }
    
    public String getAlamat_umkm() {
        return alamat_umkm;
    }

    public void setAlamat_umkm(String alamat_umkm) {
        this.alamat_umkm = alamat_umkm;
    }
    
    public String getKota_kabupaten() {
        return kota_kabupaten;
    }

    public void setKota_kabupaten(String kota_kabupaten) {
        this.kota_kabupaten = kota_kabupaten;
    }
}
