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
import model.Marca;

/**
 *
 * @author ariel
 */
public class DAOMarca {

private Connection connection;
    private String sqlString;
    private PreparedStatement ps;
    private Statement statemant;
    private ResultSet resultSet;    
    
    public DAOMarca(){
        this.connection = new factory.Connection().getConnection();
    }
    
    public ResultSet getMarcaResultSet() {
        ResultSet resultSet;
        try {
            sqlString = "SELECT * FROM marca";
            statemant = connection.prepareStatement(sqlString);
            resultSet = statemant.executeQuery(sqlString);
            
        } catch (SQLException sQLException) {
            resultSet = null;
        }
        
        return resultSet;
    }
    
    public int nextIdMarcaInt() {
        try {
            sqlString = "SHOW TABLE STATUS WHERE `Name` = 'marca'";
            statemant = connection.prepareStatement(sqlString);
            resultSet = statemant.executeQuery(sqlString);
            resultSet.first();
            return (Integer) resultSet.getInt("Auto_increment");
        } catch (Exception e) {
            return 0;
        }
    }
    
    public String insertMarca(Marca marca) {
        try {
            sqlString = "INSERT INTO marca (marca, cidade, telefone, qtdGames) VALUES (?,?,?,?)";
            ps = connection.prepareStatement(sqlString);
            ps.setString(1, marca.getMarca());
            ps.setString(2, marca.getCidade());
            ps.setInt(3, marca.getTelefone());
            ps.setInt(4, marca.getQtdGames());
            ps.execute();
            return "Sucesso!";
        } catch (Exception e) {
            return e.getMessage();
        }
    }
    
    public String updateMarca(Marca marca){
        try {
            sqlString = "UPDATE marca SET marca = ?, cidade = ?, telefone = ?, qtdGames = ? WHERE codigo_marca = ?";
            ps = connection.prepareStatement(sqlString);
            ps.setString(1, marca.getMarca());
            ps.setString(2, marca.getCidade());
            ps.setInt(3, marca.getTelefone());
            ps.setInt(4, marca.getQtdGames());
            ps.setInt(5, marca.getCodigo_marca());
            ps.execute();
            return "Sucesso!";
        } catch (Exception e) {
            return e.getMessage();
        }
    }
    
    public String removeMarca(int id){
        try {
            sqlString = "DELETE FROM marca WHERE codigo_marca = ?";
            ps = connection.prepareStatement(sqlString);
            ps.setInt(1, id);
            ps.executeUpdate();
            return  "Sucesso!";
        } catch (Exception e) {
            return e.getMessage();
        }
    }
    
}
