/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author ASUS
 */
public class viewTabel {
    private Integer Transaksi;
    private String Admin;
    private String Penyewa;
    private String Barang;
    private Integer Jumlah;
    private Integer Harga_total;

    public Integer getTransaksi() {
        return Transaksi;
    }

    public void setTransaksi(Integer Transaksi) {
        this.Transaksi = Transaksi;
    }
    
    
    
    public String getAdmin() {
        return Admin;
    }

    public void setAdmin(String Admin) {
        this.Admin = Admin;
    }

    public String getPenyewa() {
        return Penyewa;
    }

    public void setPenyewa(String Penyewa) {
        this.Penyewa = Penyewa;
    }

    public String getBarang() {
        return Barang;
    }

    public void setBarang(String Barang) {
        this.Barang = Barang;
    }

    public Integer getJumlah() {
        return Jumlah;
    }

    public void setJumlah(Integer Jumlah) {
        this.Jumlah = Jumlah;
    }

    public Integer getHarga_total() {
        return Harga_total;
    }

    public void setHarga_total(Integer Harga_total) {
        this.Harga_total = Harga_total;
    }
    
    
}
