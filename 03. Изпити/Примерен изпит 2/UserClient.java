package lab_exercises.lab_10;

import java.io.BufferedReader;
import java.io.PrintWriter;

public class UserClient extends User{
    private String clientNumber;

    public UserClient(String clientNumber) {
        this.clientNumber = clientNumber;
    }

    public UserType getUserType() {
        return UserType.CLIENT;
    }

    public void writeNewTicket(Ticket newTicket) {
        MailBox.inbox.add(newTicket);
    }

    public String getClientNumber() {
        return clientNumber;
    }

    public void setClientNumber(String clientNumber) {
        this.clientNumber = clientNumber;
    }
}
