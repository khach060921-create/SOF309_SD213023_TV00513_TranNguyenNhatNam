/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quanlycafe.dao;
import com.mycompany.quanlycafe.entity.Drink;
import com.mycompany.quanlycafe.util.DBConnection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PC
 */
public class DrinkDAO {

    private Drink map(ResultSet rs) throws SQLException {
        return new Drink(
                rs.getInt("ID"),
                rs.getString("Name"),
                rs.getDouble("Price"),
                rs.getString("Image"),
                rs.getString("Description"),
                rs.getBoolean("Active"),
                rs.getInt("Category_ID"));
    }

    public List<Drink> getAll() {
        List<Drink> list = new ArrayList<>();
        String sql = "SELECT * FROM Drinks";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) list.add(map(rs));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public List<Drink> getByCategory(int categoryId) {
        List<Drink> list = new ArrayList<>();
        String sql = "SELECT * FROM Drinks WHERE Category_ID = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, categoryId);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) list.add(map(rs));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public List<Drink> searchByName(String keyword) {
        List<Drink> list = new ArrayList<>();
        String sql = "SELECT * FROM Drinks WHERE Name LIKE ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, "%" + keyword + "%");
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) list.add(map(rs));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public Drink getById(int id) {
        String sql = "SELECT * FROM Drinks WHERE ID = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) return map(rs);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean insert(Drink d) {
        String sql = "INSERT INTO Drinks(Name, Price, Image, Description, Active, Category_ID) "
                   + "VALUES(?, ?, ?, ?, ?, ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, d.getName());
            ps.setDouble(2, d.getPrice());
            ps.setString(3, d.getImage());
            ps.setString(4, d.getDescription());
            ps.setBoolean(5, d.isActive());
            ps.setInt(6, d.getCategoryId());
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean update(Drink d) {
        String sql = "UPDATE Drinks SET Name = ?, Price = ?, Image = ?, Description = ?, "
                   + "Active = ?, Category_ID = ? WHERE ID = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, d.getName());
            ps.setDouble(2, d.getPrice());
            ps.setString(3, d.getImage());
            ps.setString(4, d.getDescription());
            ps.setBoolean(5, d.isActive());
            ps.setInt(6, d.getCategoryId());
            ps.setInt(7, d.getId());
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean delete(int id) {
        String sql = "DELETE FROM Drinks WHERE ID = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
