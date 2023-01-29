package ru.digitalleague.factory.ok;

import ru.digitalleague.factory.ok.notification.Notification;
import ru.digitalleague.factory.ok.notification.factory.NotificationFactory;
import ru.digitalleague.factory.ok.notification.factory.MailNotificationFactory;
import ru.digitalleague.factory.ok.notification.factory.PhoneNotificationFactory;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.Buffer;
import java.time.LocalDate;
import java.util.UUID;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        User user = new User(2L, "Денис", "denis@gmail.com", "+79522668105");

        NotificationFactory factory = true ? new MailNotificationFactory() : new PhoneNotificationFactory();

        sendNotification(factory.makeNotification("текст письма", user));

    }

    private static void sendNotification(Notification notification) {
        System.out.println(notification.getText());
    }
}
