package lectures.test_example_2;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try (ServerSocket socket = new ServerSocket(8080)){
            while (true){
                Socket client = socket.accept();
                ClientResolver resolver = new ClientResolver(client);
                new Thread(resolver).start();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
