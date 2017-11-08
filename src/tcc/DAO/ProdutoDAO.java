package tcc.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import tcc.DTO.ProdutoDTO;

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
        System.out.println(p);
        //pegar dados e mostrar eles.
        conn.close();

    }

    public void alteraProd(String nome, int qnt, float preco, int cod) throws SQLException {

        Connection conn = DriverManager.getConnection(STRING_CONEXAO);
        String sql = "update produto set nomeProd = ?, qntProd = ?, precoProd = ? where codProd = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, nome);
        stmt.setInt(2, qnt);
        stmt.setFloat(3, preco);
        stmt.setInt(4, cod);

        stmt.execute();
        conn.close();
    }

    public ProdutoDTO pegaBD(int c) throws SQLException {
        Connection conn = DriverManager.getConnection(STRING_CONEXAO);
        String sql = "select nomeProd, qntProd, precoProd, tamProd from produto where codProd = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, c);
        ResultSet rs = stmt.executeQuery();
        ProdutoDTO pDTO = new ProdutoDTO();
        while (rs.next()) {
            pDTO.setNomeProd(rs.getString(1));
            pDTO.setQntProd(rs.getInt(2));
            pDTO.setPrecoProd(rs.getFloat(3));
            pDTO.setTamProd(rs.getString(4));
        }
        conn.close();
        return pDTO;

    }

    public ArrayList<ProdutoDTO> pegaBDTudo() throws SQLException {
        Connection conn = DriverManager.getConnection(STRING_CONEXAO);
        String sql = "select codProd, nomeProd, qntProd, precoProd, tamProd from produto";
        PreparedStatement stmt = conn.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        ArrayList<ProdutoDTO> DTOgeral = new ArrayList<>();
        while (rs.next()) {
            ProdutoDTO cDTO = new ProdutoDTO();

            cDTO.setCodProd(rs.getInt(1));
            cDTO.setNomeProd(rs.getString(2));
            cDTO.setQntProd(rs.getInt(3));
            cDTO.setPrecoProd(rs.getFloat(4));
            cDTO.setTamProd(rs.getString(5));
            DTOgeral.add(cDTO);
        }
        conn.close();
        return DTOgeral;
        
    }

    public boolean verificaCod(int c) throws SQLException {

        Connection conn = DriverManager.getConnection(STRING_CONEXAO);
        String sql = "select codProd from produto where codProd = ?";

        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, c);
        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            //existe
            return true;

        } else {
            //não existe
            return false;
        }
    }

    public void removeProd(String c) throws SQLException {
        Connection conn = DriverManager.getConnection(STRING_CONEXAO);
        String sql = "delete from produto where codProd = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, c);
        stmt.execute();
        conn.close();
    }
    
    public void baixaEstoque(int total, int c) throws SQLException{
        Connection conn = DriverManager.getConnection(STRING_CONEXAO);
        String sql = "update produto set qntProd = ? where codProd = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, total);
        stmt.setInt(2, c);
        stmt.execute();
        conn.close();
    }
}
