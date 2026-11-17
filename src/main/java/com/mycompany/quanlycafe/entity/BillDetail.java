/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quanlycafe.entity;

/**
 *
 * @author PC
 */
public class BillDetail {
    private int billId;
    private int drinkId;
    private int quantity;
    private double price;

    public BillDetail() {
    }

    public BillDetail(int billId, int drinkId, int quantity, double price) {
        this.billId = billId;
        this.drinkId = drinkId;
        this.quantity = quantity;
        this.price = price;
    }

    public int getBillId() { return billId; }
    public void setBillId(int billId) { this.billId = billId; }

    public int getDrinkId() { return drinkId; }
    public void setDrinkId(int drinkId) { this.drinkId = drinkId; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
}
