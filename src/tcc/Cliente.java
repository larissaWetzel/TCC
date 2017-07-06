 package tcc;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import javax.swing.JOptionPane;
import tcc.DTO.ClienteDTO;

public class Cliente {

    private String nomeCliente, email, endereco;
    private char[] senhaCliente, confirmaSenhaCliente;
    private int telefone, celular;
    
    public Cliente(String nomeCliente, char[] senhaCliente, char[] confirmaSenhaCliente, String email, String endereco, int telefone, int celular) {
        this.nomeCliente = nomeCliente;
        this.senhaCliente = senhaCliente;
        this.confirmaSenhaCliente = confirmaSenhaCliente;
        this.email = email;
        this.endereco = endereco;
        this.telefone = telefone;
        this.celular = celular;
       
    }
    

    public void cadastroCliente() throws FileNotFoundException, IOException {
        //importar nomeCliente para Cliente
      /*if (!ClienteDTO.getNomeCliente().trim().equals("")) {
            OutputStream ops = new FileOutputStream("Banco de dados do paraguai.txt");
            OutputStreamWriter osw = new OutputStreamWriter(ops);
            BufferedWriter bw = new BufferedWriter(osw);
            bw.write(ClienteDTO.getNomeCliente());
            bw.close();
            JOptionPane.showMessageDialog(null, "Cadastrado.");
        }*/
    }

    public void editaCliente() {

    }

    public void excluiCliente() {

    }
}
