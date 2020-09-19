package GestorBD;

import java.util.ArrayList;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.PreparedStatement;


public class GestorBD {

    private static final String CON="";
    private String USER="sa";
    private String PASS="111624";
    private Connection con;
    
    
    private void AbrirConexion() {
        try {
            con = DriverManager.getConnection(CON,USER,PASS);
            
        } 
        catch (SQLException ex) {
            ex.printStackTrace();
        } 
    }
    private void CerrarConexion()
    {
        try {
            if (con != null && !con.isClosed()) {
                con.close();
            }
        } 
        catch (SQLException ex) {
            ex.printStackTrace();
        } 
    }
}
