package lectures.test_example.db;

import lectures.test_example.users.User;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UserDB {
    public static List<User> users = Collections.synchronizedList(new ArrayList<>());

    public static void SafeUsers(List<User> users){
        synchronized (users) {
            try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("user.bin"))) {
                objectOutputStream.writeObject(users);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static List<User> LoadUsers(){
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("user.bin"))){
            Object obj = objectInputStream.readObject();
            if (obj instanceof List<?>){
                return (List<User>) obj;
            }
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
