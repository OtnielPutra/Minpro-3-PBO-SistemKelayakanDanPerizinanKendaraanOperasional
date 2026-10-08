/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class Perizinan {

    private final String nomorIzin;
    private String platNomor;
    private String jenisIzin;
    private String tanggalBerlaku;

    public Perizinan(
        String nomorIzin,
        String platNomor,
        String jenisIzin,
        String tanggalBerlaku
    ) {

        this.nomorIzin = periksaIsi(nomorIzin, "Nomor izin");
        this.platNomor = periksaIsi(platNomor, "Plat nomor");
        this.jenisIzin = periksaIsi(jenisIzin, "Keterangan ");
        this.tanggalBerlaku = periksaIsi(tanggalBerlaku, "Tanggal berlaku");
    }

    // private: pengecekan data tidak boleh kosong, dipakai constructor dan setter
    private static String periksaIsi(String nilai, String nama) {

        if (nilai == null || nilai.trim().isEmpty()) {
            throw new IllegalArgumentException(nama + " tidak boleh kosong.");
        }

        return nilai.trim();
    }

    public String getNomorIzin() {
        return nomorIzin;
    }

    public String getPlatNomor() {
        return platNomor;
    }

    public void setPlatNomor(String platNomor) {
        this.platNomor = periksaIsi(platNomor, "Plat nomor");
    }

    public String getJenisIzin() {
        return jenisIzin;
    }

    public void setJenisIzin(String jenisIzin) {
        this.jenisIzin = periksaIsi(jenisIzin, "Jenis izin");
    }

    public String getTanggalBerlaku() {
        return tanggalBerlaku;
    }

    public void setTanggalBerlaku(String tanggalBerlaku) {
        this.tanggalBerlaku = periksaIsi(tanggalBerlaku, "Tanggal berlaku");
    }
}
