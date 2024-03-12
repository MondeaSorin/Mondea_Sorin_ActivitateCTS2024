package classes;

import interfaces.PersonalSpital;

public class Medic implements PersonalSpital {
    @Override
    public void executeTask() {
        System.out.println("Medicul a executat o sarcina");
    }
}
