package ru.digitalleague.factory.ok.notification.decorator;

import ru.digitalleague.factory.ok.notification.LocalizedMailMessages;
import ru.digitalleague.factory.ok.notification.MailNotification;
import ru.digitalleague.factory.ok.notification.Notification;

import java.util.Arrays;

public class MailNotificationDecorator implements Notification {

    MailNotification mailNotification;

    public MailNotificationDecorator(MailNotification mailNotification) {
        this.mailNotification = mailNotification;
    }

    public String checkLocalization(String string) {
        String locale;
        if (mailNotification.getUser().getPhone().contains("+7")) {
            locale = "RUSSIAN";
        } else if (mailNotification.getUser().getPhone().contains("+86")) {
            locale = "CHINESE";
        } else {
            locale = "ENGLISH";
        }
        return locale;
    }

    public boolean checkHasAdvertisement() {
        return mailNotification.isHasAdvertisement();
    }


    @Override
    public String getText() {

        String[] split = mailNotification.getText().split(",");

//        if (checkLocalization(split[0]).equals("RUSSIAN")) {
//            split[0] = LocalizedMailMessages.RUSSIAN_MAIL_MESSAGE.getHeaderTranslation();
//            if (checkHasAdvertisement()) {
//                split[split.length - 1] = LocalizedMailMessages.RUSSIAN_MAIL_MESSAGE.getAdvTranslation();
//            }
//            return Arrays.toString(split);
//        } else if (checkLocalization(split[0]).equals("CHINESE")) {
//            split[0] = LocalizedMailMessages.CHINESE_MAIL_MESSAGE.getHeaderTranslation();
//            if (checkHasAdvertisement()) {
//                split[split.length - 1] = LocalizedMailMessages.CHINESE_MAIL_MESSAGE.getAdvTranslation();
//            }
//            return Arrays.toString(split);
//        } else {
//            split[0] = LocalizedMailMessages.ENGLISH_MAIL_MESSAGE.getHeaderTranslation();
//            if (checkHasAdvertisement()) {
//                split[split.length - 1] = LocalizedMailMessages.ENGLISH_MAIL_MESSAGE.getAdvTranslation();
//            }
//            return Arrays.toString(split);
//        }
//        if (mailNotification.getUser().getPhone().contains("+7")) {
//            return String.format(
//                    LocalizedMailMessages.RUSSIAN_MAIL_MESSAGE.getHeaderTranslation(),
//                    mailNotification.getUser().getEmail(),
//                    mailNotification.getUser().getName(),
//                    mailNotification.getBody(),
//                    mailNotification.isHasAdvertisement() ? LocalizedMailMessages.RUSSIAN_MAIL_MESSAGE.getAdvTranslation() : ""
//            );
//        } else if (mailNotification.getUser().getPhone().contains("+1")) {
//            return String.format(
//                    LocalizedMailMessages.ENGLISH_MAIL_MESSAGE.getHeaderTranslation(),
//                    mailNotification.getUser().getEmail(),
//                    mailNotification.getUser().getName(),
//                    mailNotification.getBody(),
//                    mailNotification.isHasAdvertisement() ? LocalizedMailMessages.ENGLISH_MAIL_MESSAGE.getAdvTranslation() : ""
//            );
//        } else if (mailNotification.getUser().getPhone().contains("+86")) {
//            return String.format(
//                    LocalizedMailMessages.CHINESE_MAIL_MESSAGE.getHeaderTranslation(),
//                    mailNotification.getUser().getEmail(),
//                    mailNotification.getUser().getName(),
//                    mailNotification.getBody(),
//                    mailNotification.isHasAdvertisement() ? LocalizedMailMessages.CHINESE_MAIL_MESSAGE.getAdvTranslation() : ""
//            );
//        } else {
//            return String.format(
//                    LocalizedMailMessages.ENGLISH_MAIL_MESSAGE.getHeaderTranslation(),
//                    mailNotification.getUser().getEmail(),
//                    mailNotification.getUser().getName(),
//                    mailNotification.getBody(),
//                    mailNotification.isHasAdvertisement() ? LocalizedMailMessages.ENGLISH_MAIL_MESSAGE.getAdvTranslation() : ""
//            );
//        }
    }
}
