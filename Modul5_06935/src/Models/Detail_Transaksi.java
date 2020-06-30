
package Models;


public class Detail_Transaksi {
    private Transaksi transaksi;
    private String nm_barang;
    private int id_barang;
    private int jumlah_barang;
    private int harga_total;
    
    public Transaksi getTransaksi(){
        return transaksi;
    }
    public void setTransaksi(Transaksi transaksi){
        this.transaksi = transaksi;
    }
    public String getNmbarang(){
        return nm_barang;
    }
    public void setNmbarang(String nm_barang){
        this.nm_barang = nm_barang;
    }
    public int getJumlah_barang(){
        return jumlah_barang;
    }
    public void setJumlah_barang(Integer jumlah_barang){
        this.jumlah_barang = jumlah_barang;
    }
    public void setHarga_total(Integer harga_total){
        this.harga_total = harga_total;
    }
    public int getHarga_total(){
        return harga_total;
    }
    public int getId_barang(){
        return id_barang;
    }
    public void setId_barang(int id_barang){
        this.id_barang = id_barang;
    }
}
