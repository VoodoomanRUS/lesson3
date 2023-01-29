package ru.digitalleague.factory.ok.notification;

public enum LocalizedMailMessages {
    RUSSIAN_MAIL_MESSAGE("Адрес: %s\nУважаемый %s,\n%s%s\nС уважением, команда поддержки!", "\n\nПокупайте наши товары!\n"),

    ENGLISH_MAIL_MESSAGE("Address: %s\nDear %s,\n%s%s\nSincerely, Support Team!", "\n\nBuy our products!\n"),

    CHINESE_MAIL_MESSAGE("地址: %s\n亲爱的 %s,\n%s%s\n最好的问候，支持团队!", "\n\n买我们的货！\n");


    private final String headerTranslation;
    private final String advTranslation;

    LocalizedMailMessages(String headerTranslation, String advTranslation) {
        this.headerTranslation = headerTranslation;
        this.advTranslation = advTranslation;
    }

    public String getHeaderTranslation() {
        return headerTranslation;
    }

    public String getAdvTranslation() {
        return advTranslation;
    }
}
