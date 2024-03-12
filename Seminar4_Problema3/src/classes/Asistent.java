package classes;

import interfaces.PersonalSpital;

public class Asistent implements PersonalSpital {
    @Override
    public void executeTask() {
        System.out.println("Asistent: Asista pacientul.");
    }
}
