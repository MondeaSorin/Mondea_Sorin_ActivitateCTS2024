package main;

import classes.PersonalFactory;
import classes.TipPersonal;
import interfaces.PersonalSpital;

public class Main {
    public static void main(String[] args) {
        PersonalSpital brancardier = PersonalFactory.createPersonal(TipPersonal.BRANCARDIER);
        brancardier.executeTask();

        PersonalSpital asistent = PersonalFactory.createPersonal(TipPersonal.ASISTENT);
        asistent.executeTask();

        PersonalSpital medic = PersonalFactory.createPersonal(TipPersonal.MEDIC);
        medic.executeTask();
    }
}