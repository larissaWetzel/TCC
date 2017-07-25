package tcc.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ProdutoDAO {

    private static final String STRING_CONEXAO = "jdbc:mysql://localhost:3307/loja_vanetex?"
            + "user=root&password=root";

    public void cadastraProdutos(float pre, int qnt, String nome, String tam) throws SQLException {

        Connection conn = DriverManager.getConnection(STRING_CONEXAO);

        //mudar isso
        String sql = "insert into produto (precoProd, nomeProd, qntProd, tamProd)"
                + " values (?,?,?,?)";

        PreparedStatement p = conn.prepareStatement(sql);

        p.setFloat(1, pre);
        p.setString(2, nome);
        p.setInt(3, qnt);
        p.setString(4, tam);
        p.execute();
        conn.close();

    }

    public void mostraProdutos(int c) throws SQLException {
        Connection conn = DriverManager.getConnection(STRING_CONEXAO);
        String sql = "select * from produto where codProd  = ?";
        PreparedStatement p = conn.prepareStatement(sql);
        p.setInt(1, c);
        p.execute();
        //pegar dados e mostrar eles.
        conn.close();

    }

    public void alteraProdutos(int c) throws SQLException {
        Connection conn = DriverManager.getConnection(STRING_CONEXAO);
        //update
        String sql = "select * from produto where codProd  = ?";
        PreparedStatement p = conn.prepareStatement(sql);
        p.setInt(1, c);
        p.execute();
        //pegar dados e mostrar eles
        conn.close();
    }

    public boolean verificaCod(boolean c) throws SQLException {

        Connection conn = DriverManager.getConnection(STRING_CONEXAO);
        String sql = "select codProd from produto where exists(select ?)";
        
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql) ;
        if (rs.next()) {
           //existe
            return true;
        } else {
          //não existe
            return false;
        }
        /*if (sql == exists) {
            return true;
        } else {
            return false;
        }*/
    }

}
