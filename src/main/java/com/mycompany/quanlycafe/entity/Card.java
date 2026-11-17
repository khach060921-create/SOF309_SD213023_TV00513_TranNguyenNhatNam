/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quanlycafe.entity;

/**
 *
 * @author PC
 */
public class Card {
    private int id;
    private String code;
    private int status;

    public Card() {
    }

    public Card(int id, String code, int status) {
        this.id = id;
        this.code = code;
        this.status = status;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }

    public int getStatus() { return status; }
    public void setStatus(int status) { this.status = status; }
}
