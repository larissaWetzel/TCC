
package tcc.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


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
          
}

