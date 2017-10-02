
package tcc.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import tcc.DTO.ClienteDTO;


public class ClienteDAO {
    private static final String STRING_CONEXAO = "jdbc:mysql://localhost:3307/loja_vanetex?"
            + "user=root&password=root";
    
    public void cadastraClientes(String n, String f,String c,String email,String e) throws SQLException{
        
        //Fazer a conexão com o banco de dados:
        Connection conn = DriverManager.getConnection(STRING_CONEXAO);
        
        String sql ="insert into cliente (nomeCliente, foneCliente, celularCliente, emailCliente, enderecoCliente)"
                + " values (?,?,?,?,?)";
       
        PreparedStatement p = conn.prepareStatement(sql);
              
        p.setString(1, n);
        p.setString(2, f);
        p.setString(3, c);
        p.setString(4, email);
        p.setString(5, e);
        p.execute();
        conn.close();
       
    }
    
    public boolean verificaCod (int cod) throws SQLException{
         Connection conn = DriverManager.getConnection(STRING_CONEXAO);
         String sql = "select codCliente from cliente where codCliente = ?";
         PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, cod);
        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            //existe
            return true;

        } else {
            //não existe
            return false;
        }
    }
    
    public ClienteDTO pegaBD (int c) throws SQLException{
        Connection conn = DriverManager.getConnection(STRING_CONEXAO);
        String sql = "select nomeCliente, foneCliente, celularCliente, emailCliente, enderecoCliente from cliente where codCliente = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, c);
        ResultSet rs = stmt.executeQuery();
        ClienteDTO cDTO = new ClienteDTO();
        while (rs.next()) {
            cDTO.setNomeCliente(rs.getString(1));
            cDTO.setFoneCliente(rs.getString(2));
            cDTO.setCelularCliente(rs.getString(3));
            cDTO.setEmailCliente(rs.getString(4));
            cDTO.setEnderecoCliente(rs.getString(5));
        }
        conn.close();
        return cDTO;
    }     
    public ArrayList<ClienteDTO> pegaBDTudo () throws SQLException{
        Connection conn = DriverManager.getConnection(STRING_CONEXAO);
        String sql = "select codCliente, nomeCliente, foneCliente, celularCliente, emailCliente, enderecoCliente from cliente";
        PreparedStatement stmt = conn.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        ArrayList<ClienteDTO> DTOgeral = new ArrayList<>();
        while (rs.next()) {
            ClienteDTO cDTO = new ClienteDTO();
            
            cDTO.setCodCliente(rs.getInt(1));
            cDTO.setNomeCliente(rs.getString(2));
            cDTO.setFoneCliente(rs.getString(3));
            cDTO.setCelularCliente(rs.getString(4));
            cDTO.setEmailCliente(rs.getString(5));
            cDTO.setEnderecoCliente(rs.getString(6));
            DTOgeral.add(cDTO);
        }
        conn.close();
        return DTOgeral;
    }     
    
    public void alteraCliente (String nome, String telefone, String celular, String email, String endereco, String c) throws SQLException{
        Connection conn = DriverManager.getConnection(STRING_CONEXAO);
        String sql = "update cliente set nomeCliente = ?, foneCliente = ?, celularCliente = ?, emailCliente = ?, enderecoCliente = ? where codCliente = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, nome);
        stmt.setString(2, telefone);
        stmt.setString(3, celular);
        stmt.setString(4, email);
        stmt.setString(5, endereco);
        stmt.setString(6, c);
        stmt.execute();
        conn.close();
    }
    public void removeCliente(String c) throws SQLException{
        Connection conn = DriverManager.getConnection(STRING_CONEXAO);
        String sql = "delete from cliente where codCliente = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1,c);
        stmt.execute();
        conn.close();
    }
}

