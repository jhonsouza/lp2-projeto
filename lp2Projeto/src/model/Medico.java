package model;

public class Medico extends Pessoa {
    private String crm;
    private String esp;

    public Medico(){}

    public Medico(String crm, String esp, String nome, String cpf, String tel){
        super(nome, cpf, tel);
        this.crm = crm;
        this.esp = esp;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }
    public String getCrm() {
        return crm;
    }
    
    public void setEsp(String esp) {
        this.esp = esp;
    }
    public String getEsp() {
        return esp;
    }

    @Override
    public String toString() {
        return (super.toString()+ "\nCRM:  " + crm + "\nEspecialidade: " + esp);
    }
}
