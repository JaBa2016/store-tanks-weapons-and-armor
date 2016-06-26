package Users;

import java.util.ArrayList;
import java.util.List;

public class DemoLauncher {

    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        createUsers(users);
        System.out.println(users.size());

        for (User u: users) {
            System.out.println("Login: " + u.getLogin());
            System.out.println("Passwd: " + u.getPasswd());
        }

        AutorizationGUI auturizGUI = new AutorizationGUI();

    }

    public static void createUsers(List<User> users){
        User usr1 = new User();
        User usr2 = new User();
        User usr3 = new User();

        usr1.setLogin("Alex");
        usr1.setPasswd("one");
        users.add(usr1);

        usr2.setLogin("Oleg");
        usr2.setPasswd("Two");
        users.add(usr2);

        usr3.setLogin("Igor");
        usr3.setPasswd("one");
        users.add(usr3);
    }

}
