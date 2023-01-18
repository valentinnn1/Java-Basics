package lectures.test_example;

import lectures.test_example.users.Admin;
import lectures.test_example.users.Student;
import lectures.test_example.users.Teacher;
import lectures.test_example.utils.Grade;
import lectures.test_example.utils.UserType;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientResolver implements Runnable {
    private final Socket client;
    Admin admin = Admin.getAdmin();

    public ClientResolver(Socket client) {
        this.client = client;
    }

    @Override
    public void run() {
        BufferedReader reader;
        PrintWriter writer;
        try {
            writer = new PrintWriter(client.getOutputStream(), true);
            reader = new BufferedReader(new InputStreamReader(client.getInputStream()));

            writer.println("Enter username and password: ");
            String[] input = reader.readLine().split(" ");
            String username = input[0];
            String password = input[1];
            if (username.equals("admin") && password.equals("admin")) {
                openAdminCommunication(writer, reader);
            }
            if (Teacher.isValidateUser(username) && Teacher.isValidPassword(password)) {
                Teacher teacher = (Teacher) admin.CreateUser(UserType.TEACHER, username, password);
                openTeacherCommunication(writer, reader, teacher);
            }
            if (Student.isValidateUser(username) && Student.isValidatePassword(password)) {
                Student student = (Student) admin.CreateUser(UserType.STUDENT, username, password);
                openStudentCommunication(writer, student);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void openAdminCommunication(PrintWriter writer, BufferedReader reader) {
        try {
            writer.println("Welcome master");
            String userType = reader.readLine();
            if (userType.equalsIgnoreCase(String.valueOf(UserType.TEACHER))) {
                admin.CreateUser(UserType.TEACHER, reader.readLine(), reader.readLine());
            }
            if (userType.equalsIgnoreCase(String.valueOf(UserType.STUDENT))) {
                admin.CreateUser(UserType.STUDENT, reader.readLine(), reader.readLine());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void openStudentCommunication(PrintWriter writer, Student student) {
        writer.println(student.printSortedGrades());
    }

    private void openTeacherCommunication(PrintWriter writer, BufferedReader reader, Teacher teacher) {
        try {
            writer.println("Enter student id");
            String facNumber = reader.readLine();
            writer.println("Enter new grade");
            Grade grade = new Grade(reader.readLine(),
                    Double.parseDouble(reader.readLine()),
                    Integer.parseInt(reader.readLine()));
            teacher.addGrade(facNumber, grade);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
