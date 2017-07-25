
package tcc.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import tcc.DTO.ClienteDTO;

/**
 *
 * @author Windows
 */
public class ClienteDAO {
    
    //conexão com o banco de dados:
    private static final String STRING_CONEXAO = "jdbc:mysql://localhost/vanetex?"
            + "user=root&password=root";
    
    //passa os dados de ClienteDTO para o arrayList
    public ArrayList<ClienteDTO> montaListaClientes() throws SQLException{
        
        //cria a lista que vai ser retornada
        ArrayList<ClienteDTO> listaRetorno = new ArrayList();
        
        //Fazer a conexão com o banco de dados:
        Connection conn = DriverManager.getConnection(STRING_CONEXAO);
        String sql ="select nomeCliente, cpfCliente, foneCliente, celularCliente, emailCliente"
                + "enderecoCliente from cliente";
        
        //envia o select para o banco
        PreparedStatement p = conn.prepareStatement(sql);
        
         // definir o valor de cada um dos parâmetros...
        ResultSet rs = p.executeQuery();
        
        while (rs.next()){
            ClienteDTO clienteDTO = new ClienteDTO();
            clienteDTO.setNomeCliente(rs.getString(1));
            clienteDTO.setCpfCliente(rs.getString(2));
            clienteDTO.setEmailCliente(rs.getString(3));
            clienteDTO.setEnderecoCliente(rs.getString(4));
            clienteDTO.setFoneCliente(rs.getString(5));
            clienteDTO.setCelularCliente(rs.getString(6));
            
            listaRetorno.add(clienteDTO);
        }
        conn.close();
        //retorna a lista
        System.out.println(listaRetorno);  
        return listaRetorno;
        
    }
          
}
