package tcc.Util;

import javax.swing.JOptionPane;

public class Mensagens {
    
    public static void Erro(String mensagem){
        //ERROR_MESSAGE - para erros.
        JOptionPane.showMessageDialog(null, mensagem, "ERRO: ", JOptionPane.ERROR_MESSAGE);
    }
    
    public static void Aviso (String mensagem){
        //WARNING_MESSAGE - para avisos !
        JOptionPane.showMessageDialog(null, mensagem, "Aviso sobre: ", JOptionPane.WARNING_MESSAGE);
    }
    
    public static void Info (String mensagem){
        //INFORMATION_MESSAGE - para informações.
        JOptionPane.showMessageDialog(null, mensagem, "Informação: ", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static boolean Confirma (String mensagem){
        //YES_NO_OPTION - para confirmação
        //boolean para retornar um sim ou não.
        return JOptionPane.showConfirmDialog(null, mensagem, "Confirmação", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
    }
}
