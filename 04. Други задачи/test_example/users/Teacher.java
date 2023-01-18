package lectures.test_example.users;

import lectures.test_example.utils.Grade;
import lectures.test_example.db.UserDB;
import lectures.test_example.utils.UserType;

import java.util.List;
import java.util.regex.Pattern;

public class Teacher extends User{
    public Teacher(String user, String password) {
        super(user, password);
    }

    public void addGrade(String facNumber, Grade grade){
        List<User> users = UserDB.LoadUsers();
        if (users != null) {
            for (User user: users){
                if (user.getUserType() == UserType.STUDENT && user.getUser().equals(facNumber)){
                    Student st = (Student)user;
                    st.setGrade(grade);
                    break;
                }
            }
            UserDB.SafeUsers(users);
        }
    }

    public static boolean isValidateUser(String user) {
        Pattern pattern = Pattern.compile("[A-Za-z]+@tu-sofia.com");
        return pattern.matcher(user).matches();
    }

    public static boolean isValidPassword(String password) {
        Pattern pattern = Pattern.compile(".{5,}");
        return pattern.matcher(password).matches();
    }

    @Override
    public UserType getUserType() {
        return UserType.TEACHER;
    }
}
