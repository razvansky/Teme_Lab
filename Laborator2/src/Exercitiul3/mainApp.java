package Exercitiul3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class mainApp {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("exercitiul3.txt"));
        Scanner scanner1 = new Scanner(System.in);
        String s = scanner.nextLine();;
        String subsir;
        int poz;
        int end;
        StringBuilder sb = new StringBuilder(s);
        boolean Flag = true;

        System.out.println("Sir initial: " + s);
        while(Flag) {
            System.out.println("________MENIU________");
            System.out.println("1.Subsir intr-o pozitie");
            System.out.println("2.Sterge subsir de la o pozitie pana la alta pozitie");
            System.out.println("3.Iesire");
            int option = scanner1.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Introduceti un subsir");
                    subsir = scanner1.next();
                    System.out.println("Dati pozitia la care vreti sa-l introduceti: ");
                    poz = scanner1.nextInt();
                    sb.insert(poz,subsir);
                    System.out.println(" " + sb + " ");
                    break;
                case 2:
                    System.out.println("Dati pozitia de la care vreti sa stergeti");
                    poz = scanner1.nextInt();
                    System.out.println("Dati pozitia pana unde vreti sa stergeti");
                    end = scanner1.nextInt();
                    sb.delete(poz,end);
                    System.out.println(sb);
                    break;
                case 3:
                    Flag = false;
                    break;

            }
        }
    }
}
