/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

//import model.*;
import factory.*;
import java.sql.*;
import java.sql.Connection;
import javax.swing.ComboBoxModel;

/**
 *
 * @author ariel
 */
public class DAOMain {
    
    private Connection connection;
    private PreparedStatement ps;
    private ResultSet rs, rsValores, rsEmail;
    private Statement st;
    private String sqlString;
    
    public DAOMain (){
        this.connection = new factory.Connection().getConnection();
    }
    
    public ResultSet GetTableValuesResultSet(){
        //Pegar variável para tabelas
    }
    
}
