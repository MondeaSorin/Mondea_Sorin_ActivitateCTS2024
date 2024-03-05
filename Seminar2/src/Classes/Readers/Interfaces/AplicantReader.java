package Classes.Readers.Interfaces;

import Classes.Aplicanti.Interfaces.Aplicant;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class AplicantReader {

    public String file;

    public AplicantReader(String file) {
        this.file = file;
    }
    public abstract List<Aplicant> read() throws FileNotFoundException;

    public void readAplicant(Scanner input, Aplicant aplicant) {
        String nume = input.next();
        String prenume = input.next();
        int varsta = input.nextInt();
        int punctaj = input.nextInt();
        int nr = input.nextInt();
        List<String> vect = new ArrayList<>(5);
        for (int i = 0; i < nr; i++)
            vect.add(input.next());

        aplicant.setNume(nume);
        aplicant.setPrenume(prenume);
        aplicant.setVarsta(varsta);
        aplicant.setPunctaj(punctaj);
        aplicant.setProiecte(nr, vect);
    }
}
