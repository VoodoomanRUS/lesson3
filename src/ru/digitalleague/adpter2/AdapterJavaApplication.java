package ru.digitalleague.adpter2;

public class AdapterJavaApplication extends JavaApplication implements DataBase {
    @Override
    public void insert() {
        System.out.println(saveObject());
    }

    @Override
    public void update() {
        System.out.println(updateObject());
    }

    @Override
    public void select() {
        System.out.println(loadObject());
    }

    @Override
    public void delete() {
        System.out.println(deleteObject());

    }
}
