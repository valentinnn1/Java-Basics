package lectures.test_example_2;

import lectures.test_example_2.entities.ClientType;

import java.io.*;
import java.net.Socket;

public class ClientResolver implements Runnable{
    private Socket client;

    public ClientResolver(Socket client) {
        this.client = client;
    }

    @Override
    public void run() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(client.getInputStream()));
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()))){
            ClientType client = ClientType.valueOf(reader.readLine());
            if(client == ClientType.STUDENT){
                openStudentCommunication(reader, writer);
            }else if(client == ClientType.CLERK){
                //openClerkCommunication(reader, writer);
            }
        }catch (IOException e){
            System.err.println(e.getMessage());
        }
    }

    private void openStudentCommunication(BufferedReader reader, BufferedWriter writer) {
        try {
            int option = Integer.parseInt(reader.readLine());
            switch (option){
                case 1 -> {
                    // normal scholarship ...
                }
                case 2 -> {
                    // special scholarship ...
                }
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
