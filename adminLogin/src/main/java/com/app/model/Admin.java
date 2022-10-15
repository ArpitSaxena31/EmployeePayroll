package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="admin")
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(unique=true)
    private String adminID;
    private String password;
    public Admin() {
        super();
        // TODO Auto-generated constructor stub
    }
    public Admin(int id, String adminID, String password) {
        super();
        this.id = id;
        this.adminID = adminID;
        this.password = password;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getAdminID() {
        return adminID;
    }
    public void setAdminID(String adminID) {
        this.adminID = adminID;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    @Override
    public String toString() {
        return "Admin [id=" + id + ", adminID=" + adminID + ", password=" + password + "]";
    }
    
}