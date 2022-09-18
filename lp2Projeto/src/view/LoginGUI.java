package view;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
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
        setBounds(100, 100, 319, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5,5,5,5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblLogin = new JLabel("Login");
        lblLogin.setFont(new Font("Tahoma", Font.BOLD, 17));
        lblLogin.setBounds(64, 38, 82, 25);
        contentPane.add(lblLogin);

        // txtLogin = new JTextField();
        // txtLogin.setFont(new Font("Tahoma", Font.PLAIN, 19));
        // txtLogin.setBounds(64, 73, 173, 25);
        // contentPane.add(txtLogin);
        // txtLogin.setColumns(10);

        // JLabel lblPassword = new JLabel("Password");
        // lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
        // lblPassword.setBounds(58, 41, 48, 14);
        // contentPane.add(lblPassword);

        // txtPassword = new JPasswordField();
        // txtPassword.setFont(new Font("Tahoma", Font.PLAIN, 19));
        // txtPassword.setBounds(64, 73, 173, 25);
        // contentPane.add(txtPassword);
        // txtPassword.setColumns(10);

        // btnLimpar = new JButton("Limpar");
        // btnLimpar.setFont(new Font("Tahoma", Font.BOLD, 20));
        // btnLimpar.setBounds(64, 193, 91, 32);
        // contentPane.add(btnLimpar);
        
        
        btnEnviar = new JButton("Enviar");

    }
    
}
