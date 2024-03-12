package factories;

import classes.Asistent;
import interfaces.PersonalFactory;
import interfaces.PersonalSpital;

public class AsistentFactory implements PersonalFactory {
    @Override
    public PersonalSpital createPersonal() {
        return new Asistent();
    }
}
