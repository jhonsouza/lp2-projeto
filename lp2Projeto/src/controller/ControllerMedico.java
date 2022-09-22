package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import view.MedicoGUI;
import model.Medico;
public class ControllerMedico extends Medico {
    
    private MedicoGUI mGui;
    private Medico m;

    public ControllerMedico(MedicoGUI mGui) {
        this.mGui = mGui;
        mGui.setVisible(true);
        Handler handler = new Handler();
        mGui.addHandlerEnviar(handler);
        mGui.addHandlerLimpar(handler);
    }

    public class Handler implements ActionListener {
    

        public Handler() {
        }

        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == mGui.getBtnEnviar()){
                String name = mGui.getName();
                String cpf = mGui.getCPF();
                String crm = mGui.getCrm();
                String tel = mGui.getTelefone();
                Object esp = mGui.getEsp();
                if (name.equals("") || cpf.equals("") || crm.equals("") || tel.equals("")){
                    JOptionPane.showMessageDialog(mGui.getContentPane(), "todos os campos devem ser preenchidos","Alerta!",2);
                }
                else{
                    m = new Medico(crm, esp, name, cpf, tel);
                    JOptionPane.showMessageDialog(mGui.getContentPane(), "Dado Cadastrados com sucesso\n" + m,"Resultado",1);
                }
            }
        }

        @Override
        public String toString() {
            return "Handler []";
        }

    }
    

}
