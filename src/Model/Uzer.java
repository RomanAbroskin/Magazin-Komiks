package Model;

public class Uzer {

    private static int count=0;
private int id;

    public Uzer(String nickName, String password) {
        this.NickName = nickName;
        this.Password = password;
        this.id = ++count;
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
