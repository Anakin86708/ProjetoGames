package factory;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ariel
 */
public class Connection {
    public java.sql.Connection getConnection(){   
        try{
            return DriverManager.getConnection("jdbc:mysql://localhost/projetoGames", "root", "");
        } catch(SQLException ex) {
            throw new RuntimeException(ex);
        }
    }   
}
