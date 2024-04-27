package com.example.springapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name  = "DS_Garden")
public class DSgarden {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id ;
    @Column(name = "Plant_name")
    String name;
    @Column(name = "Address")
    String address;
    @Column(name = "Phone_NO")
    int ph_number;
    public DSgarden() {
    }
    public DSgarden(int id, String name, String address, int ph_number) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.ph_number = ph_number;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public int getPh_number() {
        return ph_number;
    }
    public void setPh_number(int ph_number) {
        this.ph_number = ph_number;
    }
    
    
}