/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author trinh
 */
public class Information {
    private int id;
    private String description;
    private String address;
    private String phone;
    private double wallet;
    private String image;
    private String fullName;

    public Information() {
    }

    public Information(int id, String description, String address, String phone, double wallet, String image, String fullName) {
        this.id = id;
        this.description = description;
        this.address = address;
        this.phone = phone;
        this.wallet = wallet;
        this.image = image;
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getWallet() {
        return wallet;
    }

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Information{" + "id=" + id + ", description=" + description + ", address=" + address + ", phone=" + phone + ", wallet=" + wallet + ", image=" + image + '}';
    }


    
    
    
            
}
