package sem_exercises.ex_5.write_to_file;

import constants.Constants;

import java.io.*;

public class Main {
    private static final String dummyTxtFile = Constants.SRC_DIR + "\\sem_exercises\\ex_5\\files\\dummyText.txt";
    private static final String studentTxtFile = Constants.SRC_DIR + "\\sem_exercises\\ex_5\\files\\student.txt";

    public static void main(String[] args) {
        writeToFile(dummyTxtFile);
        System.out.println(readStringFile(dummyTxtFile));

        Student student = new Student("1231234", "Pesho");
        writeObjToFile(student);
        System.out.println(readObjFromFile());
    }

    private static void writeObjToFile(Student student) {
        try (FileOutputStream fileOutputStream = new FileOutputStream(studentTxtFile);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)){
            objectOutputStream.writeObject(student);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static Student readObjFromFile() {
        Student student;
        try (FileInputStream fileInputStream = new FileInputStream("myFile.txt");
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)){
            student = (Student) objectInputStream.readObject();

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return student;

    }

    public static void writeToFile(String fileName){
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName))){
            bufferedWriter.write("Some data");
            bufferedWriter.write("More data");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static String readStringFile(String fileName){
        String line;
        StringBuilder result = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))){
            line = reader.readLine();
            while (line != null){
                result.append(line);
                line = reader.readLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return result.toString();
    }
}
