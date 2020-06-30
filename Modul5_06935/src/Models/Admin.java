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
public class Admin {
    private Integer id_admin;
    private String username;
    private String password;
    
    public Integer getId_admin(){
        return id_admin;
    }
    public void setId_admin(Integer id_admin){
        this.id_admin = id_admin;
    }
    public String getUsername (){
        return username;
    }
    public void setUsername (String username){
        this.username = username;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword (String Password){
        this.password = password;
    }
}

