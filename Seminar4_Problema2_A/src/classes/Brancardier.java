package classes;

import interfaces.PersonalSpital;

public class Brancardier implements PersonalSpital {
    @Override
    public void executeTask() {
        System.out.println("Brancardierul a executat o sarcina");
    }
}
