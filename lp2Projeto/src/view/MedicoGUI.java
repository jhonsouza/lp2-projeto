package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import controller.ControllerMedico.Handler;

import java.awt.EventQueue;
import javax.swing.JComboBox;



public class MedicoGUI extends JFrame {
    private JPanel contentPane;
    private JTextField txtTelefone;
    private JTextField txtCRM;
    private JTextField txtNome;
    private JTextField txtCPF;
    private JButton btnEnviar;
    private JButton btnLimpar;
    public String especialidade[] = {"Cardiologista", "Clinico Geral", "Dermatologista", "Endocrinologista", "Neurologista"};
    private JComboBox<String> cbBox;
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

        setTitle("Cadastro de M" + '\u00E9' + "dicos");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(800, 800, 400, 500);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5,5,5,5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblCRM = new JLabel("CRM");
        lblCRM.setFont(new Font("Tahoma", Font.BOLD, 17));
        lblCRM.setBounds(90, 30, 80, 25);
        contentPane.add(lblCRM);

        txtCRM = new JTextField();
        txtCRM.setFont(new Font("Tahoma", Font.PLAIN, 19));
        txtCRM.setBounds(90, 60, 170, 25);
        contentPane.add(txtCRM);
        txtCRM.setColumns(10);

        JLabel lblNome = new JLabel("NOME");
        lblNome.setFont(new Font("Tahoma", Font.BOLD, 17));
        lblNome.setBounds(90, 100, 80, 25);
        contentPane.add(lblNome);

        txtNome = new JTextField();
        txtNome.setFont(new Font("Tahoma", Font.PLAIN, 19));
        txtNome.setBounds(90, 130, 170, 25);
        contentPane.add(txtNome);
        txtNome.setColumns(10);

        JLabel lblCPF = new JLabel("CPF");
        lblCPF.setFont(new Font("Tahoma", Font.BOLD, 17));
        lblCPF.setBounds(90, 170, 82, 25);
        contentPane.add(lblCPF);

        txtCPF = new JTextField();
        txtCPF.setFont(new Font("Tahoma", Font.PLAIN, 19));
        txtCPF.setBounds(90, 200, 170, 25);
        contentPane.add(txtCPF);
        txtCPF.setColumns(10);

        JLabel lblEspecialidade = new JLabel("Especialidade");
        lblEspecialidade.setBounds(90, 230, 170, 25);
        lblEspecialidade.setFont(new Font("Tahoma",Font.BOLD, 19));
        contentPane.add(lblEspecialidade);

        
        cbBox = new JComboBox<>();
        cbBox.setFont(new Font("Tahoma", Font.PLAIN, 19));
        cbBox.setModel(new DefaultComboBoxModel<>(new String[] {"Cardiologista", "Clinico Geral", "Dermatologista", "Endocrinologista", "Neurologista"}));
        cbBox.setSelectedIndex(0);
        cbBox.setBounds(90, 270, 170, 25);
        getContentPane().add(cbBox);
      

        JLabel lblTelefone = new JLabel("Telefone");
        lblTelefone.setFont(new Font("Tahoma", Font.BOLD, 17));
        lblTelefone.setBounds(90, 310, 100, 25);
        contentPane.add(lblTelefone);

        txtTelefone = new JTextField();
        txtTelefone.setFont(new Font("Tahoma", Font.PLAIN, 19));
        txtTelefone.setBounds(90, 340, 170, 25);
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
        btnLimpar.setBounds(64, 390, 110, 32);
        getContentPane().add(btnLimpar);
        
        btnEnviar = new JButton("Enviar");
        btnEnviar.setFont(new Font("Tahoma", Font.BOLD, 17));
        btnEnviar.setBounds(180, 390, 110, 32);
        getContentPane().add(btnEnviar);
    }
    public JButton getBtnEnviar() {
        return btnEnviar;
    }
    public JButton getBtnLimpar() {
        return btnLimpar;
    }
    public String getName() {
        return txtNome.getText();
    }
    public String getCrm() {
        return txtCRM.getText();
    }
    public String getCPF(){
        return txtCPF.getText();
    }
    public String getTelefone(){
        return txtTelefone.getText();
    }
    public Object getEsp(){
        return cbBox.getSelectedItem();
    }
    public void setName(String name){
        txtNome.setText(name);
    }
    public void setCrm(String crm){
        txtCRM.setText(crm);
    }
    public void setCpf(String cpf){
        txtCPF.setText(cpf);
    }
    public void setTelefone(String telefone){
        txtTelefone.setText(telefone);
    }
    public void addHandlerEnviar(Handler handler){
        btnEnviar.addActionListener(handler);
    }
    public void addHandlerLimpar(Handler handler) {    
        btnLimpar.addActionListener(handler);
    }
}
