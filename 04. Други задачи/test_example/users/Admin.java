package lectures.test_example.users;

import lectures.test_example.db.UserDB;
import lectures.test_example.utils.UserType;

public class Admin extends User {
    private static final Admin admin = new Admin("admin", "admin");

    private Admin(String user, String password) {
        super(user, password);
    }

    public static Admin getAdmin() {
        return admin;
    }

    @Override
    public UserType getUserType() {
        return UserType.ADMIN;
    }

    public User CreateUser(UserType userType, String user, String password) {
        switch (userType) {
            case TEACHER -> {
                Teacher teacher = new Teacher(user, password);
                UserDB.users.add(teacher);
                UserDB.SafeUsers(UserDB.users);
                return teacher;
            }
            case STUDENT -> {
                Student student = new Student(user, password);
                UserDB.users.add(student);
                UserDB.SafeUsers(UserDB.users);
                return student;
            }
            default -> {
                return null;
            }
        }
    }
}

