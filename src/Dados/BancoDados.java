package Dados;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BancoDados {

	public static void main(String[] args) {
		
		Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;

        String url = "jdbc:postgresql://localhost/";
        String user = "postgres";
        String password = "tuliolima";

        try {

            String tabela = "tabela_de_jogos";
            con = DriverManager.getConnection(url, user, password);

            String stm = "select * from juiz;";
            pst = con.prepareStatement(stm);
            //pst.setString(1, tabela);                  
            rs = pst.executeQuery();

            while (rs.next()) {
                System.out.print(rs.getString(2) + "\t");
                System.out.println(rs.getString(4) + "\n");
            }

        } catch (SQLException ex) {
            Logger lgr = Logger.getLogger(BancoDados.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);

        } finally {

            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }

            } catch (SQLException ex) {
                Logger lgr = Logger.getLogger(BancoDados.class.getName());
                lgr.log(Level.SEVERE, ex.getMessage(), ex);
            }
        }
    }
}