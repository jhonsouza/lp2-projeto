package model;

import java.util.Arrays;

public class Usuario {
    
    private String Login;
    private String Password;

    public Usuario(String login, String password) {  
        this.Login = login;
        this.Password = password;
    }

    public Usuario(){}

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

    public boolean isLoginValid(char[] password, String Login) {
        if (isPasswordValid(password) && isUserValid(Login)) {
            return true;
        }
        else{
            return false;
        }
    }

    private boolean isPasswordValid(char[] password2) {
        boolean passwordValid = false;
        char[] password = {'1', '2', '3', '4', '5'};
        if (password2.length == 0){
            passwordValid = false;
        }
        else{
            passwordValid = Arrays.equals(password2, password);
        }

        return passwordValid;
    }

    private boolean isUserValid(String input) {
        boolean userValid = false;
        if (input.equals("user")){
            userValid = true;            
        }
        return userValid;
    }
}
