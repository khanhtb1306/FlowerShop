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
public class Order {

    private int id;
    private String date;
    private int uid;
    private double totalmoney;
    private int comfirm;
    private int ship;
    private int done;

    public Order() {
    }

    public Order(int id, String date, int uid, double totalmoney, int comfirm, int ship, int done) {
        this.id = id;
        this.date = date;
        this.uid = uid;
        this.totalmoney = totalmoney;
        this.comfirm = comfirm;
        this.ship = ship;
        this.done = done;
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public double getTotalmoney() {
        return totalmoney;
    }

    public void setTotalmoney(double totalmoney) {
        this.totalmoney = totalmoney;
    }

    public int getComfirm() {
        return comfirm;
    }

    public void setComfirm(int comfirm) {
        this.comfirm = comfirm;
    }

    public int getShip() {
        return ship;
    }

    public void setShip(int ship) {
        this.ship = ship;
    }

    public int getDone() {
        return done;
    }

    public void setDone(int done) {
        this.done = done;
    }

    @Override
    public String toString() {
        return "Order{" + "id=" + id + ", date=" + date + ", uid=" + uid + ", totalmoney=" + totalmoney + ", comfirm=" + comfirm + ", ship=" + ship + ", done=" + done + '}';
    }
    
    

}
