package factories;

import classes.Medic;
import interfaces.PersonalFactory;
import interfaces.PersonalSpital;

public class MedicFactory implements PersonalFactory {
    @Override
    public PersonalSpital createPersonal() {
        return new Medic();
    }
}
