package lab_exercises.lab_10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MailBox {
    public static List<Ticket> inbox = Collections.synchronizedList(new ArrayList<>());
    public static List<Ticket> archive = Collections.synchronizedList(new ArrayList<>());

}
