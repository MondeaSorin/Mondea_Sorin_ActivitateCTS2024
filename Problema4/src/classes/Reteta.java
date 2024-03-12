package classes;

import java.util.ArrayList;
import java.util.List;

public class Reteta implements RetetaClonable{
    private int cantitateSolutie;
    private List<String> medicamente;

    public Reteta(int cantitateSolutie, List<String> medicamente) {
        this.cantitateSolutie = cantitateSolutie;
        this.medicamente = new ArrayList<>(medicamente);
    }

    public int getCantitateSolutie() {
        return cantitateSolutie;
    }

    public void setCantitateSolutie(int cantitateSolutie) {
        this.cantitateSolutie = cantitateSolutie;
    }

    public List<String> getMedicamente() {
        return new ArrayList<>(medicamente);
    }

    public void setMedicamente(List<String> medicamente) {
        this.medicamente = new ArrayList<>(medicamente);
    }

    @Override
    public Reteta clone() {
        try {
            Reteta cloned = (Reteta) super.clone();
            cloned.medicamente = new ArrayList<>(this.medicamente);
            return cloned;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Nu putem clona clasa reteta", e);
        }
    }
}
