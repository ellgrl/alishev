package day13;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MessageDatabase {
    private static List<Message> messages = new ArrayList<>();

    public static void addMessage(User sender, User receiver, String text) {
        Date date;
        messages.add(new Message(sender, receiver, text));
    }
    public static void showDialog(User u1, User u2) {
        for (Message message : messages) {
            if (message.getSender().equals(u1) && message.getReceiver().equals(u2)
            || message.getSender().equals(u2) && message.getReceiver().equals(u1)) {
                System.out.println(message.getSender() + " to " + message.getReceiver() + ": " + message.getText());
            }
        }
    }

}
