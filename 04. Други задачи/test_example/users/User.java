package lectures.test_example.users;

import lectures.test_example.utils.UserType;

import java.io.Serializable;

public abstract class User implements Serializable {
    private String user;
    private String password;

    public User(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public abstract UserType getUserType();

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
