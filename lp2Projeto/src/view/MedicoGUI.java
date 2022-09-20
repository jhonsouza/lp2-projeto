package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.EventQueue;



public class MedicoGUI extends JFrame {
    private JPanel contentPane;
    private JTextField txtLogin;
    private JPasswordField txtPassword;
    private JButton btnEnviar;
    private JButton btnLimpar;
    private static MedicoGUI frame;

    /**
     * 
     * launched the application
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() { 
               try {
                    frame = new MedicoGUI();
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
    public MedicoGUI(){

        setTitle("Cadastrp de Médicos");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(800, 800, 400, 400);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5,5,5,5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblLogin = new JLabel("CRM");
        lblLogin.setFont(new Font("Tahoma", Font.BOLD, 17));
        lblLogin.setBounds(64, 38, 82, 25);
        contentPane.add(lblLogin);

        txtCRM = new JTextField();
        txtLogin.setFont(new Font("Tahoma", Font.PLAIN, 19));
        txtLogin.setBounds(64, 73, 173, 25);
        contentPane.add(txtCRM);
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
        btnLimpar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                txtLogin.setText("");
                txtPassword.setText("");
        }
        });
        btnLimpar.setFont(new Font("Tahoma", Font.BOLD, 17));
        btnLimpar.setBounds(64, 193, 110, 32);
        contentPane.add(btnLimpar);
        
        btnEnviar = new JButton("Enviar");
        btnEnviar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                char[] input = txtPassword.getPassword();
                if (txtLogin.getText().equals("") || input.length == 0) {
                    JOptionPane.showMessageDialog(frame, "Todos os campos devem ser preenchidos!");
                    txtLogin.setText("");
                    txtPassword.setText("");
                }
                else {
                    if (txtLogin.getText().equals("user") && isPasswordValid(input)) {
                        JOptionPane.showMessageDialog(frame, "parabens você sabe a porra do seu login e senha!");
                    }
                    else{
                        JOptionPane.showMessageDialog(frame, "Senha ou Login invalidos!");
                    }
                }
            }

            private boolean isPasswordValid(char[] input) {
                boolean passwordValid = false;
                char[] password = {'1', '2', '3', '4', '5'};
                if (input.length == 0){
                    passwordValid = false;
                }
                else{
                    passwordValid = Arrays.equals(input, password);
                }

                return passwordValid;
            }
        });
        btnEnviar.setFont(new Font("Tahoma", Font.BOLD, 17));
        btnEnviar.setBounds(180, 193, 110, 32);
        contentPane.add(btnEnviar);
    }
    
}
