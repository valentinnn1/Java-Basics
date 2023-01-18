package lectures.test_example_2.db;

import lectures.test_example_2.entities.Form;

import java.io.*;
import java.util.concurrent.ConcurrentLinkedQueue;

public class FormDB {
    public static ConcurrentLinkedQueue<Form> correctForms = new ConcurrentLinkedQueue<>();
    public static ConcurrentLinkedQueue<Form> incorrectForms = new ConcurrentLinkedQueue<>();

    public static void saveCorrectForms(){
        try(ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("forms.ser"))){
            output.writeObject(correctForms);
        }catch (IOException e){
            System.err.println(e.getMessage());
        }
    }

    public static void updateCorrectForms(){
        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream("forms.ser"))){
            Object obj = input.readObject();
            if (obj instanceof ConcurrentLinkedQueue<?>){
                correctForms = (ConcurrentLinkedQueue<Form>) obj;
            }
        }catch (IOException e){
            System.err.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void saveIncorrectForms(){
        try(ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("forms.ser"))){
            output.writeObject(incorrectForms);
        }catch (IOException e){
            System.err.println(e.getMessage());
        }
    }

    public static void updateIncorrectForms(){
        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream("forms.ser"))){
            Object obj = input.readObject();
            if (obj instanceof ConcurrentLinkedQueue<?>){
                incorrectForms = (ConcurrentLinkedQueue<Form>) obj;
            }
        }catch (IOException e){
            System.err.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
