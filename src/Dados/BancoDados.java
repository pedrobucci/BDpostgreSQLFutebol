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
    
    public String selectTabelaSelecao (String pais) {
    	String tabela = "";
    	String stm = "";
    	conectar();
	    try {	
	    	if (pais.equals("")) {
	    		stm = "select * from selecao;";
	    	} else {
	    		stm = "select * from selecao where pais = '" + pais + "'";
	    	}
	        pst = con.prepareStatement(stm);
	        //pst.setString(1, tabela);                  
	        rs = pst.executeQuery();
	
	        tabela += "|id|Pais          |Pontos|id_continente|id_centro_olimpico|\n"
	        		+ "|--+--------------+------+-------------+------------------|\n";
	        while (rs.next()) {
	            tabela += String.format("|%2s|%-14s|%6d|%13s|%18s|\n", 
	            		rs.getInt(1), 
	            		rs.getString(2), 
	            		rs.getInt(3),
	            		rs.getInt(5),
	            		rs.getInt(6));
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
    
    public String selectTabelaJogador (String nome) {
    	String tabela = "";
    	String stm = "";
    	conectar();
	    try {	
	    	if (nome.equals("")) {
	    		stm = "select * from jogador;";
	    	} else {
	    		stm = "select * from jogador where nome = '" + nome + "'";
	    	}
	        pst = con.prepareStatement(stm);
	        //pst.setString(1, tabela);                  
	        rs = pst.executeQuery();
	
	        tabela += "|id|Nome       |Idade|Nacionalidade|id_selecao|\n"
	        		+ "|--+-----------+-----+-------------+----------|\n";
	        while (rs.next()) {
	            tabela += String.format("|%2s|%-11s|%5d|%13s|%10s|\n", 
	            		rs.getInt(1), 
	            		rs.getString(2), 
	            		rs.getInt(3),
	            		rs.getString(4),
	            		rs.getInt(5));
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
    
    public String selectTabelaTecnico (String nome) {
    	String tabela = "";
    	String stm = "";
    	conectar();
	    try {	
	    	if (nome.equals("")) {
	    		stm = "select * from tecnico;";
	    	} else {
	    		stm = "select * from tecnico where nome = '" + nome + "'";
	    	}
	        pst = con.prepareStatement(stm);
	        //pst.setString(1, tabela);                  
	        rs = pst.executeQuery();
	
	        tabela += "|id|Nome            |Idade|Nacionalidade|id_selecao|\n"
	        		+ "|--+----------------+-----+-------------+----------|\n";
	        while (rs.next()) {
	            tabela += String.format("|%2s|%-16s|%5d|%13s|%10s|\n", 
	            		rs.getInt(1), 
	            		rs.getString(2), 
	            		rs.getInt(3),
	            		rs.getString(4),
	            		rs.getInt(5));
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

    public String getTabelaDeJogos () {
    	String tabela = "";
    	conectar();
	    try {	
	        String stm = "select * from tabela_de_jogos;";
	        pst = con.prepareStatement(stm);
	        //pst.setString(1, tabela);                  
	        rs = pst.executeQuery();
	
	        tabela += "|Rodada           |Selecao A     |   |Selecao B     |Local                 |Data/Hora             |\n"
	        		+ "|-----------------+--------------+---+--------------+----------------------+----------------------|\n";
	        while (rs.next()) {
	            tabela += String.format("|%-17s|%-14s|%1dx%1d|%-14s|%-22s|%-22s|\n", 
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