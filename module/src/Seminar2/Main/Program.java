package Seminar2.Main;

import Seminar2.Classes.Aplicanti.Angajat;
import Seminar2.Classes.Aplicanti.Interfaces.Aplicant;
import Seminar2.Classes.Readers.AngajatReader;
import Seminar2.Classes.Readers.Interfaces.AplicantReader;

import java.io.FileNotFoundException;
import java.util.List;


public class Program {

	public static void main(String[] args) {
		List<Aplicant> listaAngajati;
		AplicantReader angajatReader = new AngajatReader("angajati.txt");

		try {
			listaAngajati = angajatReader.read();
			for(Aplicant angajat:listaAngajati)
				System.out.println(angajat.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
