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
import model.Games;

/**
 *
 * @author ariel
 */
public class DAOGames {
    
    private Connection connection;
    private String sqlString;
    private PreparedStatement ps;
    private Statement statemant;
    private ResultSet resultSet;
    
    public DAOGames(){
        this.connection = new factory.Connection().getConnection();
    }
    
    public ResultSet getGamesResultSet(){
        try {
            sqlString = "SELECT * FROM games";
            statemant = connection.prepareStatement(sqlString);
            resultSet = statemant.executeQuery(sqlString);
            
        } catch (SQLException sQLException) {
            resultSet = null;
        }
        
        return resultSet;
    }
    
    public int nextIdGamesInt() {
        try {
            sqlString = "SHOW TABLE STATUS WHERE `Name` = 'games'";
            statemant = connection.prepareStatement(sqlString);
            resultSet = statemant.executeQuery(sqlString);
            resultSet.first();
            return (Integer) resultSet.getInt("Auto_increment");
        } catch (Exception e) {
            return 0;
        }
    }
    
    public String insertGames(Games games) {
        try {
            sqlString = "INSERT INTO games (codigo_barras, codigo_marca, titulo, plataforma, idiomas, faixa_etaria, conteudo_embalagem, genero, codigo_fornecedor, preco, avaliacao) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
            ps = connection.prepareStatement(sqlString);
            
            ps.setInt(1, games.getCodigo_barras());
            ps.setInt(2, games.getCodigo_marca());
            ps.setString(3, games.getTitulo());
            ps.setString(4, games.getPlataforma());
            ps.setString(5, games.getIdiomas());
            ps.setString(6, games.getFaixa_etaria());
            ps.setString(7, games.getConteudo_embalagem());
            ps.setString(8, games.getGenero());
            ps.setInt(9, games.getCodigo_fornecedor());
            ps.setDouble(10, games.getPreco());
            ps.setDouble((11), games.getAvaliacao());
            ps.execute();
            return "Sucesso!";
        } catch (Exception e) {
            return e.getMessage();
        }
    }
    
    public String updateGames(Games games) {
        try {
            sqlString = "UPDATE games SET codigo_barras = ?, codigo_marca = ?, titulo = ?, plataforma = ?, idiomas = ?, faixa_etaria = ?, conteudo_embalagem = ?, genero = ?, codigo_fornecedor = ?, preco = ?, avaliacao = ?  WHERE codigo = ?";
            ps = connection.prepareStatement(sqlString);
                    
            ps.setInt(1, games.getCodigo_barras());
            ps.setInt(2, games.getCodigo_marca());
            ps.setString(3, games.getTitulo());
            ps.setString(4, games.getPlataforma());
            ps.setString(5, games.getIdiomas());
            ps.setString(6, games.getFaixa_etaria());
            ps.setString(7, games.getConteudo_embalagem());
            ps.setString(8, games.getGenero());
            ps.setInt(9, games.getCodigo_fornecedor());
            ps.setDouble(10, games.getPreco());
            ps.setDouble((11), games.getAvaliacao());
            ps.setInt(12, games.getCodigo());
            ps.executeUpdate();
            return "Sucesso!";
        } catch (Exception e) {
            return e.getMessage();
        }
    }
    
    public String removeGames(int id){
        try {
            sqlString = "DELETE FROM games WHERE codigo = ?";
            ps = connection.prepareStatement(sqlString);
            ps.setInt(1, id);
            ps.executeUpdate();
            return  "Sucesso!";
        } catch (Exception e) {
            return e.getMessage();
        }
    }
}
