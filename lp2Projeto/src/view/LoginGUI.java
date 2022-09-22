package view;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import controller.ControllerLogin.Handler;

import java.awt.EventQueue;



public class LoginGUI extends JFrame {
    private JPanel contentPane;
    private JTextField txtLogin;
    private JPasswordField txtPassword;
    private JButton btnEnviar;
    private JButton btnLimpar;
    private static LoginGUI frame;

    /**
     * 
     * launched the application
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() { 
               try {
                    frame = new LoginGUI();
                    frame.setVisible(true);
               } catch (Exception e) {
                    e.printStackTrace();
               }
            }
        });
    }
    /**
     * Crate the frame
     */
    public LoginGUI(){

        setTitle("Tela de Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(200, 200, 400, 400);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5,5,5,5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblLogin = new JLabel("Login");
        lblLogin.setFont(new Font("Tahoma", Font.BOLD, 17));
        lblLogin.setBounds(64, 38, 82, 25);
        contentPane.add(lblLogin);

        txtLogin = new JTextField();
        txtLogin.setFont(new Font("Tahoma", Font.PLAIN, 19));
        txtLogin.setBounds(64, 73, 173, 25);
        contentPane.add(txtLogin);
        txtLogin.setColumns(10);

        JLabel lblPassword = new JLabel("Password");
        lblPassword.setFont(new Font("Tahoma", Font.BOLD, 17));
        lblPassword.setBounds(64, 103, 103, 40);
        contentPane.add(lblPassword);

        txtPassword = new JPasswordField();
        txtPassword.setFont(new Font("Tahoma", Font.PLAIN, 19));
        txtPassword.setBounds(64, 143, 173, 25);
        contentPane.add(txtPassword);
        txtPassword.setColumns(10);

        btnLimpar = new JButton("Limpar");
        btnLimpar.setFont(new Font("Tahoma", Font.BOLD, 17));
        btnLimpar.setBounds(64, 193, 110, 32);
        getContentPane().add(btnLimpar);
        
        btnEnviar = new JButton("Enviar");
        btnEnviar.setFont(new Font("Tahoma", Font.BOLD, 17));
        btnEnviar.setBounds(180, 193, 110, 32);
        getContentPane().add(btnEnviar);
    }

    public JButton getBtnEnviar() {
        return btnEnviar;
    }
    public JButton getBtnLimpar() {
        return btnLimpar;
    }
    public String getUser(){
        return (txtLogin.getText());
    }
    public char[] getPassword() {
        return (txtPassword.getPassword());
    }
    public void setUser(String login){
        txtLogin.setText(login);
    }
    public void setPassword(String password){
        txtPassword.setText(password);
    }
    public void addHandlerEnviar(Handler handler){
        btnEnviar.addActionListener(handler);
    }
    public void addHandlerLimpar(Handler handler) {    
        btnLimpar.addActionListener(handler);
    }
}
