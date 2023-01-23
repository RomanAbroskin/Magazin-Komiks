package Model;

import java.io.Serializable;

public class Uzer implements Serializable {
    @Override
    public String toString() {
        return "Uzer{" +
                "id=" + id +
                ", NickName='" + NickName + '\'' +
                ", Password='" + Password + '\'' +
                '}';
    }

    private transient static int count=0;
private int id;

    public Uzer(String nickName, String password) {
        this.NickName = nickName;
        this.Password = password;
        this.id = ++count;
    }

    public void setNickName(String nickName) {
        NickName = nickName;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public int getId() {
        return id;
    }

    public String getNickName() {
        return NickName;
    }

    public String getPassword() {
        return Password;
    }

    private String NickName;
private String Password;


}
