package tcc.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import tcc.DTO.AdmDTO;

public class AdmDAO {
    private static final String STRING_CONEXAO = "jdbc:mysql://localhost:3307/loja_vanetex?"
            + "user=root&password=root";
    
    public AdmDTO autenticaAdm(String nome, String senha) throws SQLException {
        // definição da String de conexão
        // estabelecer a conexão...mysql-connector-java-5.1.43-bin.jar
        Connection conn = DriverManager.getConnection(STRING_CONEXAO);
        String sql = "select * from administrador"+
                     " where nomeAdm = ? "+
                     "   and senhaAdm = ? ";
        // enviar o select para ser analisado pelo banco de dados...
        
        PreparedStatement p = conn.prepareStatement(sql);
        // definir o valor de cada um dos parâmetros...
        
        p.setString(1, nome);
        p.setString(2, senha);
        ResultSet rs = p.executeQuery();
        AdmDTO admDTO = null;
        if (rs.next()) {
            admDTO = new AdmDTO();
            admDTO.setNome(rs.getString(1));
            admDTO.setSenha(rs.getString(2));
        }
        conn.close();
        return admDTO;
    }
}