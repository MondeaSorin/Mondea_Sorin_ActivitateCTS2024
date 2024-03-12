package factories;

import classes.Brancandier;
import interfaces.PersonalFactory;
import interfaces.PersonalSpital;

public class BrancandierFactory implements PersonalFactory {
    @Override
    public PersonalSpital createPersonal() {
        return new Brancandier();
    }
}
