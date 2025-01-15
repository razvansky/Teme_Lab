package Laborator1_practic;

import java.io.*;
import java.util.Scanner;

public class MainApp {
    public MainApp() throws FileNotFoundException {
    }

    public static void main(String[] args) throws IOException {
        System.out.println("Hello world!");
        Scanner scanner = new Scanner(System.in); //tastatura
        System.out.print("a=");
        int a = scanner.nextInt();
        System.out.println("Ati introdus valoarea: " + a);
        scanner.close();

        String nume_fis = "in.txt";
        //Citire din fisier direct
        Scanner scaner = new Scanner(new File(nume_fis));
        while (scaner.hasNextLine()) {
            System.out.println(scaner.nextLine());
        }
        scaner.close();
        //Scriere in fisier
        String fiser = "out.txt";
        PrintStream flux_out = new PrintStream(fiser);
        flux_out.println();
    }

}


