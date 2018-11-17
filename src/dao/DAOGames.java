/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

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
    
    public String insertMarca(Games games) {
        try {
            sqlString = "INSERT INTO games (codigo_barras, codigo_marca, titulo, plataforma, idiomas, faixa_etaria, conteudo_fornecedor, genero, codigo_fornecedor, preco, avaliacao) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
            ps = connection.prepareStatement(sqlString);
            //
            //PAREI AQUI
            //Pegar informações do model
            //
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
