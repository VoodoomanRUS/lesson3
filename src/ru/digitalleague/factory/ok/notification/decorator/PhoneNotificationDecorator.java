package ru.digitalleague.factory.ok.notification.decorator;

import ru.digitalleague.factory.ok.notification.LocalizedMailMessages;
import ru.digitalleague.factory.ok.notification.LocalizedPhoneMessages;
import ru.digitalleague.factory.ok.notification.Notification;
import ru.digitalleague.factory.ok.notification.PhoneNotification;

public class PhoneNotificationDecorator  implements Notification {

    PhoneNotification phoneNotification;

    public PhoneNotificationDecorator(PhoneNotification phoneNotification) {
        this.phoneNotification = phoneNotification;
    }

    @Override
    public String getText() {
        if (phoneNotification.getUser().getPhone().contains("+7")) {
            return String.format(
                    LocalizedPhoneMessages.RUSSIAN_PHONE_MESSAGE.getHeaderTranslation(),
                    phoneNotification.getUser().getPhone(),
                    phoneNotification.getBody()
            );
        }

        if (phoneNotification.getUser().getPhone().contains("+1")) {
            return String.format(
                    LocalizedPhoneMessages.ENGLISH_PHONE_MESSAGE.getHeaderTranslation(),
                    phoneNotification.getUser().getPhone(),
                    phoneNotification.getBody()
            );
        }
        if (phoneNotification.getUser().getPhone().contains("+86")) {
            return String.format(
                    LocalizedPhoneMessages.CHINESE_PHONE_MESSAGE.getHeaderTranslation(),
                    phoneNotification.getUser().getPhone(),
                    phoneNotification.getBody()
            );
        }
        return String.format(
                LocalizedPhoneMessages.ENGLISH_PHONE_MESSAGE.getHeaderTranslation(),
                phoneNotification.getUser().getPhone(),
                phoneNotification.getBody()
        );
    }
}
