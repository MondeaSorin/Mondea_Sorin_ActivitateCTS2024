package classes;

import interfaces.PersonalSpital;

public class Medic implements PersonalSpital {
    @Override
    public void executeTask() {
        System.out.println("Medic: Diagnosticheaza pacientul.");
    }
}
