package Seminar2.Classes.Aplicanti;

import Seminar2.Classes.Aplicanti.Interfaces.Aplicant;

import java.util.Arrays;
import java.util.List;

public class Student extends Aplicant {
	protected String facultate;
	protected int anStudii;
	
	
	public String getFacultate() {
		return facultate;
	}
	public void setFacultate(String facultate) {
		this.facultate = facultate;
	}
	public int getAnStudii() {
		return anStudii;
	}
	public void setAnStudii(int anStudii) {
		this.anStudii = anStudii;
	}


	public Student() {
		super();
	}
	
	public Student(String nume, String prenume, int varsta, int punctaj, int nr_proiecte, List<String> denumiriProiecte, String facultate, int anStudii) {
		super(nume,prenume,varsta,punctaj,nr_proiecte,denumiriProiecte);
		this.facultate = facultate;
		this.anStudii = anStudii;
	}
	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		for (String proiect : denumiriProiecte) {
			stringBuilder.append(proiect).append(" ");
		}
		return "Student: Nume=" + nume + ", Prenume=" + prenume + ", Varsta=" + varsta + ", Punctaj=" + punctaj + ", Nr_proiecte=" + nrProiecte +
				", DenumireProiect=" + stringBuilder.toString() + "Facultate=" + facultate + ", An_studii=" + anStudii;
	}


	@Override
	public void afisareBugetPeZi(int buget) {
		System.out.println("Studentul " + getNume() + " " + getPrenume() + " primeste" + buget + " Euro/zi in proiect.");
	}
}
