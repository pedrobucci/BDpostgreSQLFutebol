package Dados;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BancoDados {
	
	Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    String url = "jdbc:postgresql://localhost/";
    String user = "postgres";
    String password = "tuliolima";
    
    public BancoDados () {
    	
    }
    
    private void conectar () {
    	try {
            con = DriverManager.getConnection(url, user, password);
    	} catch (SQLException ex) {
            Logger lgr = Logger.getLogger(BancoDados.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);
        }
    }
    
    private void desconectar () {
        try {
            if (con != null) {
                con.close();
                con = null;
            }
        } catch (SQLException ex) {
            Logger lgr = Logger.getLogger(BancoDados.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);
        }
    }

    public String getTabelaDeJogos () {
    	String tabela = "";
    	conectar();
	    try {	
	        String stm = "select * from tabela_de_jogos;";
	        pst = con.prepareStatement(stm);
	        //pst.setString(1, tabela);                  
	        rs = pst.executeQuery();
	
	        while (rs.next()) {
	            tabela += String.format("|%-17s|%14s|%1dx%1d|%-14s|%-22s|%-22s|\n", 
	            		rs.getString(1), 
	            		rs.getString(2), 
	            		rs.getInt(3),
	            		rs.getInt(4),
	            		rs.getString(5),
	            		rs.getString(6),
	            		rs.getString(7));
	        }
	
	    } catch (SQLException ex) {
	        Logger lgr = Logger.getLogger(BancoDados.class.getName());
	        lgr.log(Level.SEVERE, ex.getMessage(), ex);
	
	    } finally {
	
	        try {
	            if (pst != null) {
	                pst.close();
	            }	
	        } catch (SQLException ex) {
	            Logger lgr = Logger.getLogger(BancoDados.class.getName());
	            lgr.log(Level.SEVERE, ex.getMessage(), ex);
	        }
	    }
	    return tabela;
	}
}