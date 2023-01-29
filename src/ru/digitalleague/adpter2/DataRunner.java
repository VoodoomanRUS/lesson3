package ru.digitalleague.adpter2;

public class DataRunner {
    public static void main(String[] args) {
        DataBase base = new AdapterJavaApplication();

        base.insert();
        base.select();
        base.update();
        base.delete();
    }
}
