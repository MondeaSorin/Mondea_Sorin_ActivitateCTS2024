package main;

import factories.AsistentFactory;
import factories.BrancandierFactory;
import factories.MedicFactory;
import interfaces.PersonalFactory;
import interfaces.PersonalSpital;

public class Main {
    public static void main(String[] args) {
        PersonalFactory brancardierFactory = new BrancandierFactory();
        PersonalSpital brancardier = brancardierFactory.createPersonal();
        brancardier.executeTask();

        PersonalFactory asistentFactory = new AsistentFactory();
        PersonalSpital asistent = asistentFactory.createPersonal();
        asistent.executeTask();

        PersonalFactory medicFactory = new MedicFactory();
        PersonalSpital medic = medicFactory.createPersonal();
        medic.executeTask();
    }
}