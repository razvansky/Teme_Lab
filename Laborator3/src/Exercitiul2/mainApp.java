package Exercitiul2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDate;
import java.util.*;

import static java.lang.Math.min;

public class mainApp {
    public static void main(String[] args) throws FileNotFoundException {
        //PrintStream wr = new PrintStream("produse.csv");
        List<Produs> produse = new ArrayList<Produs>();
        int bucati;
        String denumire;
        double pret;
        int cantitate;
        LocalDate data_expirarii;
        Scanner scanner = new Scanner(new File("produse.csv"));
        Scanner scanner1 = new Scanner(System.in);
        boolean quit = false;
        int optiune;

        while (scanner.hasNextLine())
        {
            String line = scanner.nextLine();
            String [] values = line.split(", ");
            denumire = values[0];
            pret = Double.parseDouble(values[1]);
            cantitate = Integer.parseInt(values[2]);
            data_expirarii = LocalDate.parse(values[3]);
            produse.add(new Produs(denumire,pret,cantitate,data_expirarii));
        }
        scanner.close();
                while(!quit)
                {
                    System.out.println("1.Afisarea tuturor produselor.");
                    System.out.println("2.Afisarea produselor expirate.");
                    System.out.println("3.Vanzarea unui produs.");
                    System.out.println("4.Afisarea produselor cu pret minim.");
                    System.out.println("5.Salvarea in fisier");
                    System.out.println("Default: Iesire.");
                    try {
                    optiune = scanner1.nextInt();

                        switch (optiune) {
                            case 1:
                                System.out.println(produse.toString());
                                break;
                            case 2:
                                LocalDate azi = LocalDate.now();
                                for(Produs p : produse)
                                {
                                    if(p.getData_expirarii().isBefore(azi)) {
                                        System.out.println(p.getDenumire());
                                    }

                                }
                                break;
                            case 3:
                                System.out.println("Ce produs doriti sa vindeti?");
                                String produs_cautat = scanner1.next();
                                System.out.println("Cate bucati?");
                                bucati = scanner1.nextInt();
                                Iterator<Produs> iterator = produse.iterator();
                                while(iterator.hasNext())
                                {
                                    Produs p = iterator.next();

                                    if(p.getDenumire().equals(produs_cautat)) {
                                        int cantitate_ramasa = p.getCantitate();
                                        if (cantitate_ramasa == 0) {
                                            iterator.remove();
                                        } else {
                                            cantitate_ramasa -= bucati;
                                            p.setCantitate(cantitate_ramasa);
                                            p.setIncasari(p.getPret() * bucati);
                                            System.out.println("Cantitate ramasa: " + cantitate_ramasa);
                                            System.out.println("Incasat: " + p.getIncasari());
                                        }
                                        if (cantitate_ramasa == 0) {
                                            System.out.println("Produsul " + p.getDenumire() + " a fost epuizat si a fost eliminat din lista.");
                                            iterator.remove();
                                        }

                                    }else System.out.println("Produsul nu mai este in lista");
                                }




                                break;
                            case 4: if (!produse.isEmpty()) {
                                Produs minPretProdus = produse.get(0);
                                for (Produs p : produse) {
                                    if (p.getPret() < minPretProdus.getPret()) {
                                        minPretProdus = p;
                                    }
                                }
                                System.out.println("Produs cu pret minim: " + minPretProdus.getDenumire());
                            } else {
                                System.out.println("Nu exista produse.");
                            }
                                break;
                            case 5: PrintStream wr = new PrintStream("out.txt");
                                System.out.println("Dati un numar random: ");
                                bucati = scanner1.nextInt();
                                for(Produs p : produse)
                                {
                                    if(p.getCantitate() < bucati)
                                    {
                                        wr.println(p.toString());
                                    }
                                }
                                break;
                            default:
                                System.out.println("Pe data viitoare!");
                                quit = true;
                                break;
                        }
                    }
                    catch (InputMismatchException e)
                    {
                        System.out.println("Nu ati introdus nicio optiune valida.");
                        break;
                    }

                }
    }
}
