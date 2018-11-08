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
    
    
}
