package classes;

import interfaces.MedicamentFarmacie;

public class MedicamentAdapter implements MedicamentFarmacie {
    private MedicamentSpital medicamentSpital;

    public MedicamentAdapter(MedicamentSpital medicamentSpital) {
        this.medicamentSpital = medicamentSpital;
    }

    @Override
    public void cumparaMedicament() {
        medicamentSpital.achizitioneazaMedicament();
    }
}
