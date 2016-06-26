package Users;

import java.util.List;

public class Authorization {

    private boolean login = false;
    private boolean passwd = false;
    private Buffer buffer;
    private List<User> users;

    public Authorization(String login, String passwd, Buffer buffer) {
        this.buffer = buffer;
        users = buffer.getUsers();
        String passwdMD5 = new Passwd().md5Custom(passwd);


    }

    public boolean isLogin() {
        return login;
    }

    public void setLogin(boolean logim) {
        this.login = logim;
    }

    public boolean isPasswd() {
        return passwd;
    }

    public void setPasswd(boolean passwd) {
        this.passwd = passwd;
    }


}
