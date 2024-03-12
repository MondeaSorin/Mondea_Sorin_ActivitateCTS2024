package classes;

import interfaces.PersonalSpital;

public class Brancandier implements PersonalSpital {
    @Override
    public void executeTask() {
        System.out.println("Brancardier: Transporta pacientul.");
    }
}
