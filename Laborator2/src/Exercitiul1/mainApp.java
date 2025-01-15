package Exercitiul1;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class mainApp {
    public static void main(String[] args) throws FileNotFoundException {
        String [] s = new String[7];
        int i = 0;
        boolean gasit = false;
        String judet_cautat;
        Scanner scanner = new Scanner(new File("judete_in.txt"));
        while (scanner.hasNextLine())
        {

             String judet = scanner.nextLine();
             s[i] = judet;
             i++;
        }

        System.out.println(Arrays.toString(s));
        Arrays.sort(s);
        System.out.println(Arrays.toString(s));

        Scanner sc = new Scanner(System.in);
        System.out.println("Cautati judetul in vectorul dat: ");
        judet_cautat = sc.nextLine();
        int poz = Arrays.binarySearch(s, judet_cautat);
        System.out.println("Judetul cautat se afla pe pozitia: " + poz);



    }
}
