package ru.digitalleague.singleton;

import ru.digitalleague.singleton.notification.RegisterNotification;
import ru.digitalleague.singleton.notification.sender.NotificationGateway;

public class Main {

    public static void main(String[] args) {
        System.out.println(NotificationGateway.getInstance().toString());
        System.out.println(NotificationGateway.getInstance().toString());
        System.out.println(NotificationGateway.getInstance().toString());
        System.out.println(NotificationGateway.getInstance().toString());


        NotificationGateway.getInstance().sendNotification(new RegisterNotification("Новый пользователь"));
    }
}
