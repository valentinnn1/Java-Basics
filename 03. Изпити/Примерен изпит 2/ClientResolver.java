package lab_exercises.lab_10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientResolver implements Runnable {
    private final Socket client;

    public ClientResolver(Socket client) {
        this.client = client;
    }

    @Override
    public void run() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(client.getInputStream()));
             PrintWriter writer = new PrintWriter(client.getOutputStream())) {
            writer.println("Enter user type:");
            UserType userType = UserType.valueOf(reader.readLine());
            switch (userType) {
                case CLIENT -> {
                    UserClient client = new UserClient(reader.readLine());
                    openClientCommunication(client, reader);
                }
                case SUPPORT -> {
                    UserSupport support = new UserSupport(reader.readLine());
                    openSupportCommunication(support, reader, writer);
                }
                default -> {
                    writer.println("Incorrect user type");
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void openClientCommunication(UserClient client, BufferedReader reader) {
        try {
            String message = reader.readLine();
            Ticket newTicket = new Ticket(message);
            client.writeNewTicket(newTicket);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private void openSupportCommunication(UserSupport support, BufferedReader reader, PrintWriter writer) {
        try {
            writer.println("Inbox:");
            for (int i = 0; i < MailBox.inbox.size(); i++) {
                System.out.println("Index - " + (i + 1) + " " + MailBox.inbox.get(i));
            }
            int index = Integer.parseInt(reader.readLine());
            support.supportResolver(index);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
