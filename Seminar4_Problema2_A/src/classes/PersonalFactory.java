package classes;

import interfaces.PersonalSpital;

public class PersonalFactory {
    public static PersonalSpital createPersonal(TipPersonal tip) {
        switch (tip) {
            case BRANCARDIER:
                return new Brancardier();
            case ASISTENT:
                return new Asistent();
            case MEDIC:
                return new Medic();
            default:
                throw new IllegalArgumentException("Tipul de personal nu este valid.");

        }
    }
}