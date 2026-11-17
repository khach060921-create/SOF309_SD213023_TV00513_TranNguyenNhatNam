/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quanlycafe.entity;
import java.time.LocalDateTime;

/**
 *
 * @author PC
 */
public class Bill {
    private int id;
    private String code;
    private LocalDateTime createdAt;
    private double total;
    private int status;
    private int userId;
    private int cardId;

    public Bill() {
    }

    public Bill(int id, String code, LocalDateTime createdAt, double total,
                int status, int userId, int cardId) {
        this.id = id;
        this.code = code;
        this.createdAt = createdAt;
        this.total = total;
        this.status = status;
        this.userId = userId;
        this.cardId = cardId;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public double getTotal() { return total; }
    public void setTotal(double total) { this.total = total; }

    public int getStatus() { return status; }
    public void setStatus(int status) { this.status = status; }

    public int getUserId() { return userId; }
    public void setUserId(int userId) { this.userId = userId; }

    public int getCardId() { return cardId; }
    public void setCardId(int cardId) { this.cardId = cardId; }
}
