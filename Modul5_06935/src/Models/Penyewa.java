/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;




public class Penyewa {
    private Integer id_penyewa;
    private String nm_penyewa;
    private String alamat;
    private String no_telp;
    private String no_kk;
    
    public Integer getId_penyewa(){
        return this.id_penyewa;
    }
    public void setId_penyewa(Integer id_penyewa){
        this.id_penyewa = id_penyewa;
    }
    public String getNm_penyewa(){
        return this.nm_penyewa;
    }
    public void setNm_penyewa(String nm_penyewa){
        this.nm_penyewa = nm_penyewa;
    }
    public String getAlamat(){
        return this.alamat;
    }
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    public String getNo_telp (){
        return this.no_telp;
    }
    public void setNo_telp (String no_telp){
        this.no_telp = no_telp;
    }
    public String getNo_kk(){
        return this.no_kk;
    }
    public void setNo_kk(String no_kk){
        this.no_kk = no_kk;
    }
   
}
