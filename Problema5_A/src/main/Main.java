package main;

import classes.MedicamentAdapter;
import classes.MedicamentSpital;

public class Main {
    public static void main(String[] args) {
        MedicamentSpital medicamentSpital = new MedicamentSpital();
        MedicamentAdapter medicamentAdapter = new MedicamentAdapter(medicamentSpital);

        medicamentAdapter.cumparaMedicament();
    }
}