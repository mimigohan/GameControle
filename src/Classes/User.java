package Classes;

import java.time.LocalDate;
import java.util.function.BooleanSupplier;

/**
 * Created by peter on 3/17/2018.
 */
public class User {
    int LoginID;
    String Username;
    String Password;
    String Email;
    LocalDate Birthday;
    Boolean Logged;

    public User(int loginID, String username, String password, String email, LocalDate birthday) {
        LoginID = loginID;
        Username = username;
        Password = password;
        Email = email;
        Birthday = birthday;
        Logged=false;
    }

    public int getLoginID() {
        return LoginID;
    }

    public void setLoginID(int loginID) {
        LoginID = loginID;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public LocalDate getBirthday() {
        return Birthday;
    }

    public void setBirthday(LocalDate birthday) {
        Birthday = birthday;
    }

    public Boolean getLogged() {
        return Logged;
    }

    public void setLogged(Boolean logged) {
        Logged = logged;
    }
    private Boolean LoginCeck(String username,String password)
    {
        return username.equals(this.Username)&& password.equals(this.Password);
    }
    public void Login(String username,String password)
    {
        if (LoginCeck(username,password))
        {
            Logged=true;
        }
    }
}
