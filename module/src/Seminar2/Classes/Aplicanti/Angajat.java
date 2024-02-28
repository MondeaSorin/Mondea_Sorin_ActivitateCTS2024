package Seminar2.Classes.Aplicanti;

import Seminar2.Classes.Aplicanti.Interfaces.Aplicant;

import java.util.Arrays;
import java.util.List;

public class Angajat extends Aplicant {
	private String ocupatie;
	private int salariu;
	
	public String getOcupatie() {
		return ocupatie;
	}
	public void setOcupatie(String ocupatie) {
		this.ocupatie = ocupatie;
	}
	public int getSalariu() {
		return salariu;
	}
	public void setSalariu(int salariu) {
		this.salariu = salariu;
	}
	public Angajat(String nume, String prenume, int varsta, int punctaj, int nrProiecte, List<String> denumiriProiecte, int salariu, String ocupatie) {
		super(nume,prenume,varsta,punctaj,nrProiecte,denumiriProiecte);
		this.salariu = salariu;
		this.ocupatie = ocupatie;
	}
	public Angajat() {
		super();
	}
	
	
	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		for (String proiect : denumiriProiecte) {
			stringBuilder.append(proiect).append(" ");
		}
		return "Angajat: Nume=" + nume + ", Prenume=" + prenume
				+ ", Varsta=" + varsta + ", Punctaj=" + punctaj + ", Nr_proiecte=" + nrProiecte + ", DenumiriProiecte=[ "
				+ stringBuilder.toString() + "Ocupatie=" + ocupatie + ", salariu=" + salariu;
	}


	@Override
	public void afisareBugetPeZi(int buget) {
		System.out.println("Angajatul " + getNume() + " " + getPrenume() + " primeste" + buget + " Euro/zi in proiect.");
	}
}
