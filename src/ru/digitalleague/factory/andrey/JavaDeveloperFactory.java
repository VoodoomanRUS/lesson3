package ru.digitalleague.factory.andrey;

import ru.digitalleague.factory.andrey.Developer;
import ru.digitalleague.factory.andrey.DeveloperFactory;
import ru.digitalleague.factory.andrey.JavaDeveloper;

public class JavaDeveloperFactory implements DeveloperFactory {

    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}
