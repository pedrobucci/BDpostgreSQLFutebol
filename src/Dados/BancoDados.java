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
	            //System.out.print(rs.getString(2) + "\t");
	            //System.out.println(rs.getString(4) + "\n");
	            tabela += rs.getString(2) + "\t";
	            tabela += rs.getString(4) + "\n";
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