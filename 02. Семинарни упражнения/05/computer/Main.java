package sem_exercises.ex_5.computer;

import constants.Constants;

import java.io.*;

public class Main {
    private static final String PC_FILE = Constants.SRC_DIR + "\\sem_exercises\\ex_5\\files\\pc.txt";
    public static void main(String[] args) {
        Computer computer = new Computer(18.9, new String[]{"mouse", "keyboard", "monitor"}, "Asus", true);
        writeComputerToFile(computer, PC_FILE);

        computer = readComputerToFile(PC_FILE);
        System.out.println(computer);
    }

    public static void writeComputerToFile(Computer computer, String fileName){
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(fileName))){
            objectOutputStream.writeObject(computer);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static Computer readComputerToFile(String fileName){
        Computer computer;
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(fileName))){
            computer = (Computer) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return computer;
    }
}
