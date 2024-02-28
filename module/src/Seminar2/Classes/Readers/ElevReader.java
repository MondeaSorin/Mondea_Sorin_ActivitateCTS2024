package Seminar2.Classes.Readers;

import Seminar2.Classes.Aplicanti.Elev;
import Seminar2.Classes.Aplicanti.Interfaces.Aplicant;
import Seminar2.Classes.Readers.Interfaces.AplicantReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ElevReader extends AplicantReader {
    public ElevReader(String file) {
        super(file);
    }

    @Override
    public List<Aplicant> read() throws FileNotFoundException {
        Scanner input = new Scanner(new File(file));
        input.useDelimiter(",|\n");
        List<Aplicant> elevi = new ArrayList<>();

        while (input.hasNext()) {
            Elev elev = new Elev();
            readAplicant(input, elev);

            int clasa = input.nextInt();
            String tutore = input.next();

            elev.setClasa(clasa);
            elev.setTutore(tutore);

            elevi.add(elev);
        }
        input.close();
        return elevi;
    }
}
