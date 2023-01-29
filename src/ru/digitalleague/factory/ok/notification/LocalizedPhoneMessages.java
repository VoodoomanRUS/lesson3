package ru.digitalleague.factory.ok.notification;

public enum LocalizedPhoneMessages {
    RUSSIAN_PHONE_MESSAGE("Абонент #%s\n%s"),
    ENGLISH_PHONE_MESSAGE("Subscriber #%s\n%s"),
    CHINESE_PHONE_MESSAGE("订户 #%s\n%s");

    private final String headerTranslation;

    LocalizedPhoneMessages(String headerTranslation) {
        this.headerTranslation = headerTranslation;
    }

    public String getHeaderTranslation() {
        return headerTranslation;
    }
}
