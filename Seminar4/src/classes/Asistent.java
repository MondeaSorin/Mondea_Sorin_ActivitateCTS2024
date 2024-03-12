package classes;

import interfaces.PersonalSpital;

public class Asistent implements PersonalSpital {
    @Override
    public void executeTask() {
        System.out.println("Asistentul a executat o sarcina");
    }
}
