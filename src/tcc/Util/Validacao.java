package tcc.Util;

import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Validacao {
    //util
    public static boolean validaTextos(JTextField campos){
        if(campos.getText().trim().equals("")){
            Mensagens.Erro(campos.getToolTipText());
            campos.requestFocus();
            return false;
        }
        return true;
    }
    
    public static boolean validaSenhas(JPasswordField campo) {
        if (!String.copyValueOf(campo.getPassword()).trim().equals("1234")) {
            Mensagens.Erro(campo.getToolTipText());
            campo.requestFocus();
            return false;
        }
        return true;
    }
}
