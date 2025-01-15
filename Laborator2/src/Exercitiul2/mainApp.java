package Exercitiul2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class mainApp {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream printStream = new PrintStream(new File("out.txt"));
        String s = " ";
        Vers vers = new Vers();
        Scanner scanner = new Scanner(new File("cantec_in.txt"));
        while(scanner.hasNextLine())
        {
            s = scanner.nextLine();
            vers.randomGen();
            if(vers.randomGen() <= 0.1F) {
                printStream.println(s.toUpperCase() + vers.VerificareFinal(s) + " (Numar cuv: " + vers.nrCuvinte(s)
                        + "). " + " (Vocale: " + vers.Vowels() + ").");
            }
            else
            {
                printStream.println(s + vers.VerificareFinal(s) + " (Numar cuv: " + vers.nrCuvinte(s) + "). " +
                        " (Vocale: " + vers.Vowels() + ").");
            }

        }

    }
}
