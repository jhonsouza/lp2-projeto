package model;

public class Usuario {
    
    private String Login;
    private String Password;

    public Usuario(String login, String password) {  
        this.Login = login;
        this.Password = password;
    }

    public void setLogin(String login) {
        Login = login;
    }
    public String getLogin() {
        return Login;
    }
    public void setPassword(String password) {
        Password = password;
    }
    public String getPassword() {
        return Password;
    }
}
