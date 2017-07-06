package tcc;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Produto {
   ArrayList<String> listaProdutos = new ArrayList(); 
   
   public void CadastroProd(String nome){
       //teste
       JOptionPane.showMessageDialog(null, "Veio pra classe produto");
       if (nome.equals("")){
          listaProdutos.add(nome);
       }
    
    }
    public static void EditaProd(){
        
    }
    public static void ExcluiProd(){
        
    }
    public static void ConsultaProd(){
        
    } 
    
}
