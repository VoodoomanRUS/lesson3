package ru.digitalleague.factory.ok.notification.factory;

import ru.digitalleague.factory.ok.User;
import ru.digitalleague.factory.ok.notification.Notification;
import ru.digitalleague.factory.ok.notification.PhoneNotification;
import ru.digitalleague.factory.ok.notification.decorator.PhoneNotificationDecorator;

public class PhoneNotificationFactory implements NotificationFactory {
    public Notification makeNotification(String body, User user) {
        return new PhoneNotificationDecorator(new PhoneNotification(body, user));
    }
}
