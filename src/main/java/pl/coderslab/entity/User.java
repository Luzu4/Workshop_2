package pl.coderslab.entity;

public class User {


    private int id=0;
    private String userName;
    private String email;
    private String password;

    public User(String username, String email, String password){
        this.userName = username;
        this.email = email;
        this.password = password;
    }

    public int getId(){
        return this.id;
    }

    public String getUserName(){
        return this.userName;
    }

    public String getEmail(){
        return this.email;
    }

    public String getPassword(){
        return this.password;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
