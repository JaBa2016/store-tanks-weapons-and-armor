package Users;

import java.util.ArrayList;
import java.util.List;

public class Buffer {

    private List<User> users;

    public Buffer() {
        users = new ArrayList<>();
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
