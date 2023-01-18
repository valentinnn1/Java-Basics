package lectures.test_example.users;

import lectures.test_example.utils.Grade;
import lectures.test_example.utils.UserType;

import java.util.*;
import java.util.regex.Pattern;

public class Student extends User{
    private ArrayList<Grade> grades;

    public Student(String user, String password) {
        super(user, password);
        this.grades = new ArrayList<>();
    }

    public static boolean isValidateUser(String user) {
        Pattern pattern = Pattern.compile("[0-9]{9}");
        return pattern.matcher(user).matches();
    }

    public static boolean isValidatePassword(String password) {
        Pattern pattern = Pattern.compile("[0-9]{10}");
        return pattern.matcher(password).matches();
    }

    @Override
    public UserType getUserType() {
        return UserType.STUDENT;
    }

    public ArrayList<Grade> getGrades() {
        return grades;
    }

    public String printSortedGrades() {
        this.grades.sort(Comparator.comparing(Grade::getSemester).thenComparing(Grade::getSubject));
        StringBuffer buffer = new StringBuffer();
        for(Grade grade : grades){
            buffer.append(grade);
        }
        return buffer.toString();
    }

    public void setGrade(Grade grade) {
        this.grades.add(grade);
    }

}
