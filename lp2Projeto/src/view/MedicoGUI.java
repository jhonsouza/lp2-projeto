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
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.EventQueue;



public class MedicoGUI extends JFrame {
    private JPanel contentPane;

    private JTextField txtTelefone;
    private JTextField txtCRM;
    private JTextField txtNome;
    private JTextField txtCPF;

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

        setTitle("Cadastro de Médicos");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(800, 800, 400, 400);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5,5,5,5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblCRM = new JLabel("CRM");
        lblCRM.setFont(new Font("Tahoma", Font.BOLD, 17));
        lblCRM.setBounds(64, 38, 82, 25);
        contentPane.add(lblCRM);

        txtCRM = new JTextField();
        txtCRM.setFont(new Font("Tahoma", Font.PLAIN, 19));
        txtCRM.setBounds(64, 73, 173, 25);
        contentPane.add(txtCRM);
        txtCRM.setColumns(10);

        JLabel lblNome = new JLabel("NOME");
        lblNome.setFont(new Font("Tahoma", Font.BOLD, 17));
        lblNome.setBounds(64, 38, 82, 25);
        contentPane.add(lblNome);

        txtNome = new JTextField();
        txtNome.setFont(new Font("Tahoma", Font.PLAIN, 19));
        txtNome.setBounds(64, 73, 173, 25);
        contentPane.add(txtNome);
        txtNome.setColumns(10);

        JLabel lblCPF = new JLabel("CPF");
        lblCPF.setFont(new Font("Tahoma", Font.BOLD, 17));
        lblCPF.setBounds(64, 38, 82, 25);
        contentPane.add(lblCPF);

        txtCPF = new JTextField();
        txtCPF.setFont(new Font("Tahoma", Font.PLAIN, 19));
        txtCPF.setBounds(64, 73, 173, 25);
        contentPane.add(txtCPF);
        txtCPF.setColumns(10);

        JLabel lblTelefone = new JLabel("Telefone");
        lblTelefone.setFont(new Font("Tahoma", Font.BOLD, 17));
        lblTelefone.setBounds(64, 103, 103, 40);
        contentPane.add(lblTelefone);

        txtTelefone = new JTextField();
        txtTelefone.setFont(new Font("Tahoma", Font.PLAIN, 19));
        txtTelefone.setBounds(64, 143, 173, 25);
        contentPane.add(txtTelefone);
        txtTelefone.setColumns(10);

        btnLimpar = new JButton("Limpar");
        btnLimpar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                txtCRM.setText("");
                txtNome.setText("");
                txtCPF.setText("");
                txtTelefone.setText("");
        }
        });
        btnLimpar.setFont(new Font("Tahoma", Font.BOLD, 17));
        btnLimpar.setBounds(64, 193, 110, 32);
        contentPane.add(btnLimpar);
        
        btnEnviar = new JButton("Enviar");
        btnEnviar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (
                    txtCRM.getText().equals("") || txtNome.getText().equals("") ||
                    txtCPF.getText().equals("") || txtTelefone.getText().equals("")
                    ) {
                    JOptionPane.showMessageDialog(frame, "Todos os campos devem ser preenchidos!");
                    txtCRM.setText("");
                    txtNome.setText("");
                    txtCPF.setText("");
                    txtTelefone.setText("");
                }
            }
        });
        btnEnviar.setFont(new Font("Tahoma", Font.BOLD, 17));
        btnEnviar.setBounds(180, 193, 110, 32);
        contentPane.add(btnEnviar);
    }
    
}
