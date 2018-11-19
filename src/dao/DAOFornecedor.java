/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import gui.form_Main;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import model.Fornecedor;

/**
 *
 * @author ariel
 */
public class DAOFornecedor {

    
    private Connection connection;
    private String sqlString;
    private PreparedStatement ps;
    private Statement statemant;
    private ResultSet resultSet;
    
    public DAOFornecedor(){
        this.connection = new factory.Connection().getConnection();
    }
    
    public ResultSet getFornecedoresResultSet() {
        ResultSet resultSet;
        try {
            sqlString = "SELECT * FROM fornecedor";
            statemant = connection.prepareStatement(sqlString);
            resultSet = statemant.executeQuery(sqlString);
            
        } catch (SQLException sQLException) {
            resultSet = null;
        }
        
        return resultSet;
    }
    
    public int nextIdFornecedorInt() {
        try {
            sqlString = "SHOW TABLE STATUS WHERE `Name` = 'fornecedor'";
            statemant = connection.prepareStatement(sqlString);
            resultSet = statemant.executeQuery(sqlString);
            resultSet.first();
            return (Integer) resultSet.getInt("Auto_increment");
        } catch (Exception e) {
            return 0;
        }
    }
    
    public String insertFornecedor(Fornecedor fornecedor){
        try {
            sqlString = "INSERT INTO fornecedor (fornecedor, garantia_fornecedor, sac, cidade, ceo, qtdGames) VALUES (?,?,?,?,?,?)";
            ps = connection.prepareStatement(sqlString);
            
            ps.setString(1, fornecedor.getFornecedor());
            ps.setInt(2, fornecedor.getGarantia_fornecedor());
            ps.setInt(3, fornecedor.getSac());
            ps.setString(4, fornecedor.getCidade());
            ps.setString(5, fornecedor.getCeo());
            ps.setInt(6, fornecedor.getQtdGames());
            ps.execute(); 
            return "Sucesso!";
        } catch (Exception e) {
            return  e.getMessage();
        }
    }
    
    public String updateFornecedor(Fornecedor fornecedor){
        try {
            sqlString = "UPDATE fornecedor SET fornecedor = ?, garantia_fornecedor = ?, sac = ?, cidade = ?, ceo = ?, qtdGames = ? WHERE codigo_fornecedor = ?";
            ps = connection.prepareStatement(sqlString);
            
            ps.setString(1, fornecedor.getFornecedor());
            ps.setInt(2, fornecedor.getGarantia_fornecedor());
            ps.setInt(3, fornecedor.getSac());
            ps.setString(4, fornecedor.getCidade());
            ps.setString(5, fornecedor.getCeo());
            ps.setInt(6, fornecedor.getQtdGames());
            ps.setInt(7, fornecedor.getCodigo_fornecedor());
            ps.executeUpdate(); 
            return "Sucesso!";
        } catch (Exception e) {
            return  e.getMessage();
        }
    }
    
    public String removeFornecedor(int id){
        try {
            sqlString = "DELETE FROM fornecedor WHERE codigo_fornecedor = ?";
            ps = connection.prepareStatement(sqlString);
            ps.setInt(1, id);
            ps.executeUpdate();
            return  "Sucesso!";
        } catch (Exception e) {
            return e.getMessage();
        }
    }
    
}
