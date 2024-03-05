package Classes.Aplicanti;

import Classes.Aplicanti.Interfaces.Aplicant;

import java.util.List;

public class Elev extends Aplicant {
	private int clasa;
	private String tutore;
	
	public int getClasa() {
		return clasa;
	}
	public void setClasa(int i) {
		this.clasa = i;
	}
	public String getTutore() {
		return tutore;
	}
	public void setTutore(String tutore) {
		this.tutore = tutore;
	}
	
	
	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		for (String proiect : denumiriProiecte) {
			stringBuilder.append(proiect).append(" ");
		}
		return "Elev: Nume=" + nume + ", Prenume=" + prenume + ", Varsta="
				+ varsta + ", Punctaj=" + punctaj + ", Nr_proiecte=" + nrProiecte + ", DenumireProiect="
				+ stringBuilder.toString() + "Clasa=" + clasa + ", Tutore=" + tutore;
	}
	
	public Elev() {
		super();
	}
	
	public Elev(String nume, String prenume, int varsta, int punctaj,
				int nrProiecte, List<String> denumiriProiecte, int clasa, String tutore) {
		super(nume,prenume,varsta,punctaj,nrProiecte,denumiriProiecte);
		this.clasa = clasa;
		this.tutore = tutore;
	}

	@Override
	public void afisareBugetPeZi(int buget) {
		System.out.println("Angajatul " + getNume() + " " + getPrenume() + " primeste" + buget + " Euro/zi in proiect.");
	}
}
