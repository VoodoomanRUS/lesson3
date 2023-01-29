package ru.digitalleague.factory.andrey;

public class Program {
    public static void main(String[] args) {
        DeveloperFactory factory = type("dsa");

        Developer developer = factory.createDeveloper();

        developer.writeCode();
    }

    private static DeveloperFactory type(String type) {
        if (type.equalsIgnoreCase("java")) {
            return new JavaDeveloperFactory();
        } else if (type.equalsIgnoreCase("c++")) {
            return new CppDeveloperFactory();
        } else {
            throw new RuntimeException(type + " apsent");
        }
    }

}
