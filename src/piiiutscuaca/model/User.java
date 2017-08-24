/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piiiutscuaca.model;

/**
 *
 * @author Rangga A.W / 1641809
 */
public class User {
    private int su_user;
    private String nama;

    public User(int su_user, String nama) {
        this.su_user = su_user;
        this.nama = nama;
    }

    public int getSu_user() {
        return su_user;
    }

    public void setSu_user(int su_user) {
        this.su_user = su_user;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    
}
