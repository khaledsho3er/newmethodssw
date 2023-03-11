package model;

public class user {

    private String fn;
    private String ln;
    private String email;
    private String password;


    public user(String fn, String ln, String email, String password) {
        this.fn = fn;
        this.ln = ln;
        this.email = email;
        this.password = password;
    }
    
    public String getFn() {
        return fn;
    }

    public void setFn(String fn) {
        this.fn = fn;
    }
    
    
    public String getLn() {
        return ln;
    }

    public void setLn(String ln) {
        this.ln = ln;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
