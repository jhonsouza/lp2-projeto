package controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.JOptionPane;

import model.Usuario;
import view.LoginGUI;
import view.MedicoGUI;
public class ControllerLogin extends Usuario {
    
    private LoginGUI lGUI;
    private MedicoGUI mGui;
    private Usuario mUsuario;
    public ControllerLogin(LoginGUI lGUI){
        this.lGUI = lGUI;
        lGUI.setVisible(true);
        Handler handler = new Handler();
        lGUI.addHandlerEnviar(handler);
        lGUI.addHandlerLimpar(handler);
        mUsuario = new Usuario();
    }

    /**
     * Handler for listen events for login events.
     */
    public class Handler implements ActionListener {
        public void actionPerformed(ActionEvent e) {    
            if (e.getSource() == lGUI.getBtnEnviar()) {
                String userLogin = lGUI.getUser();
                char[] password = lGUI.getPassword();
                boolean isValid = mUsuario.isLoginValid(password, userLogin);
                if (userLogin.equals("") || password.length == 0) {
                    JOptionPane.showMessageDialog(lGUI.getContentPane(), "Todos os campos devem ser preenchidos!","Alerta!",2);
                    lGUI.setPassword("");
                    lGUI.setUser("");
                }
                else{
                    if (isValid) {
                        lGUI.dispose();
                        mGui = new MedicoGUI();
                        ControllerMedico cMedico = new ControllerMedico(mGui);
                    }
                    else{
                        JOptionPane.showMessageDialog(lGUI.getContentPane(), "Senha ou Login invalidos!","Erro",2);
                    }
                }
            }
            else{
                if (e.getSource() == lGUI.getBtnLimpar()) {
                    lGUI.setPassword("");
                    lGUI.setUser("");
                }
            }
        }
    
        
    }
    
}
