package exercitiul4;
import java.util.Scanner;

public class mainApp {
    public static void main(String[] args) {
        String CNP;
        String nume;
        Scanner scanner = new Scanner(System.in);
        int option;
        boolean flag = true;


        Persoana[] persoane = new Persoana[5]; // Vector pentru 5 persoane
        int index = 0;

        while (flag) {
            System.out.println("1. Adaugati persoane");
            System.out.println("2. Afiseaza persoanele");
            System.out.println("3. Iesire");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    if (index >= persoane.length) {
                        System.out.println("Vectorul de persoane este plin!");
                        break;
                    }

                    System.out.println("Dati numele: ");
                    nume = scanner.next();
                    System.out.println("Dati cnp-ul: ");
                    CNP = scanner.next();

                    // Validare CNP
                    if (CNP.length() == 13 && CNP.matches("\\d+")) {
                        System.out.println("Cnp valid.");
                        persoane[index] = new Persoana(nume, CNP);
                        index++;
                    } else {
                        System.out.println("CNP invalid");
                    }
                    break;

                case 2:
                    System.out.println("Persoanele introduse sunt:");
                    for (int i = 0; i < index; i++) {
                        System.out.println("Nume: " + persoane[i].getNume() + ", CNP: " + persoane[i].getCnp());
                        persoane[i].getVarsta(persoane[i].getCnp());
                    }
                    break;

                case 3:
                    flag = false;
                    break;

                default:
                    System.out.println("Optiune invalida! Incercati din nou.");
                    break;
            }
        }
    }
}
