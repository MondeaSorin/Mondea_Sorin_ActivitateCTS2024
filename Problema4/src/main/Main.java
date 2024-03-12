package main;

import classes.Reteta;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> medicamente = new ArrayList<>();
        medicamente.add("Paracetamol");
        medicamente.add("Ibuprofen");
        medicamente.add("Nurofen");

        Reteta prototip = new Reteta(100, medicamente);

        Reteta reteta1 = prototip.clone();
        Reteta reteta2 = prototip.clone();

        System.out.println("Cantitatea de solutie pentru reteta1: " + reteta1.getCantitateSolutie());
        System.out.println("Cantitatea de solutie pentru reteta2: " + reteta2.getCantitateSolutie());
    }
}