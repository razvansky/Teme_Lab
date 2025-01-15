package Exercitiul1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class mainApp {

    public static void seriazliare(PrintStream wr, Echipament e)
    {
        wr.println(e.toString());
    }

    public static  void deserializare(PrintStream wr, Echipament e) throws FileNotFoundException {
        wr = new PrintStream("echip.bin");
    }


    public static void main(String[] args) throws FileNotFoundException {
        PrintStream wr = new PrintStream(new File("echip.bin"));
        List<Echipament>echipamente = new ArrayList<Echipament>();
        Scanner scanner = new Scanner(new File("electronice.txt"));
        Scanner scanner1 = new Scanner(System.in);
        String denumire;
        int optiune;
        int nr_inv;
        float pret;
        int p_ton;
        int ppm; //pagini scrise pe minut
        String rezolutie;
        int p_car; //pagini pe cartus
        String mod_tiparire;
        String format;
        String tip_mon;
        String viteza;
        int c_hdd;
        String sistem_operare;
        String zona;
        boolean quit = false;
        while(scanner.hasNextLine())
        {
            String line = scanner.nextLine();
            String [] values = line.split(" ");
            String tip = values[0];
            switch(tip)
            {
                case "Imprimanta":
                    denumire = values[1];
                    nr_inv = Integer.parseInt(values[2]);
                    pret = Float.parseFloat(values[3]);
                    ppm = Integer.parseInt(values[4]);
                    rezolutie = values[5];
                    p_car = Integer.parseInt((values[6]));
                    mod_tiparire = values[7];
                    zona = values[8];

                    switch (zona) {
                        case "ACHIZITIONAT":
                            if (mod_tiparire.equals(ModTiparire.Color.toString())) {
                                Imprimante imprimante = new Imprimante(denumire, nr_inv, pret, zona_mag.ACHIZITIONAT,
                                        ppm, rezolutie, p_car, ModTiparire.Color);
                                echipamente.add(imprimante);
                            } else {
                                Imprimante imprimante = new Imprimante(denumire, nr_inv, pret, zona_mag.ACHIZITIONAT,
                                        ppm, rezolutie, p_car, ModTiparire.Alb_Negru);
                                echipamente.add(imprimante);
                            }
                            break;
                        case "VANDUT":
                            if (mod_tiparire.equals(ModTiparire.Color.toString())) {
                                Imprimante imprimante = new Imprimante(denumire, nr_inv, pret, zona_mag.VANDUT,
                                        ppm, rezolutie, p_car, ModTiparire.Color);
                                echipamente.add(imprimante);
                            } else {
                                Imprimante imprimante = new Imprimante(denumire, nr_inv, pret, zona_mag.VANDUT,
                                        ppm, rezolutie, p_car, ModTiparire.Alb_Negru);
                                echipamente.add(imprimante);
                                break;
                            }
                        case "EXPUS":
                            if (mod_tiparire.equals(ModTiparire.Color.toString())) {
                                Imprimante imprimante = new Imprimante(denumire, nr_inv, pret, zona_mag.EXPUS,
                                        ppm, rezolutie, p_car, ModTiparire.Color);
                                echipamente.add(imprimante);
                            } else {
                                Imprimante imprimante = new Imprimante(denumire, nr_inv, pret, zona_mag.EXPUS,
                                        ppm, rezolutie, p_car, ModTiparire.Alb_Negru);
                                echipamente.add(imprimante);
                                break;
                            }
                                break;
                    }


                case "Copiator":
                    denumire = values[1];
                    nr_inv = Integer.parseInt(values[2]);
                    pret = Float.parseFloat(values[3]);
                    p_ton = Integer.parseInt(values[4]);
                    format = values[5];
                    zona = values[6];
                    switch (zona)
                    {
                        case "VANDUT":
                            if(format.equals(Format.A3.toString()))
                        {
                            Copiatoare copiatoare = new Copiatoare(denumire , nr_inv, pret, zona_mag.VANDUT, p_ton,
                                    Format.A3);
                            echipamente.add(copiatoare);

                        }
                        else {
                            Copiatoare copiatoare = new Copiatoare(denumire , nr_inv, pret, zona_mag.VANDUT, p_ton,
                                    Format.A4);
                            echipamente.add(copiatoare);
                        }
                            break;

                        case "ACHIZITIONAT":
                            if(format.equals(Format.A3.toString()))
                            {
                                Copiatoare copiatoare = new Copiatoare(denumire , nr_inv, pret, zona_mag.ACHIZITIONAT,
                                        p_ton, Format.A3);
                                echipamente.add(copiatoare);

                            }
                            else {
                                Copiatoare copiatoare = new Copiatoare(denumire , nr_inv, pret, zona_mag.ACHIZITIONAT,
                                        p_ton, Format.A4);
                                echipamente.add(copiatoare);
                            }
                            break;

                        case "EXPUS":
                            if(format.equals(Format.A3.toString()))
                            {
                                Copiatoare copiatoare = new Copiatoare(denumire , nr_inv, pret, zona_mag.EXPUS, p_ton,
                                        Format.A3);
                                echipamente.add(copiatoare);

                            }
                            else {
                                Copiatoare copiatoare = new Copiatoare(denumire , nr_inv, pret, zona_mag.EXPUS, p_ton,
                                        Format.A4);
                                echipamente.add(copiatoare);
                            }
                            break;
                    }
                    break;

                case "Sistem_de_calcul":
                    denumire = values[1];
                    nr_inv = Integer.parseInt(values[2]);
                    pret = Float.parseFloat(values[3]);
                    tip_mon = values[4];
                    viteza = values[5];
                    c_hdd = Integer.parseInt(values[6]);
                    sistem_operare = values[7];
                    zona = values[8];

                    switch (zona)
                    {
                        case "ACHIZITIONAT":
                            if(sistem_operare.equals(Sistem_operare.Linux.toString()))
                            {
                                SistemeCalcul sistemeCalcul = new SistemeCalcul(denumire, nr_inv, pret,
                                        zona_mag.ACHIZITIONAT, tip_mon, viteza, c_hdd, Sistem_operare.Linux);
                                echipamente.add(sistemeCalcul);
                            }
                            else {
                                SistemeCalcul sistemeCalcul = new SistemeCalcul(denumire, nr_inv, pret,
                                        zona_mag.ACHIZITIONAT, tip_mon, viteza, c_hdd, Sistem_operare.Windows);
                                echipamente.add(sistemeCalcul);
                            }
                            break;

                        case "EXPUS":

                            if(sistem_operare.equals(Sistem_operare.Linux.toString()))
                            {
                                SistemeCalcul sistemeCalcul = new SistemeCalcul(denumire, nr_inv, pret, zona_mag.EXPUS,
                                        tip_mon, viteza, c_hdd, Sistem_operare.Linux);
                                echipamente.add(sistemeCalcul);
                            }
                            else {
                                SistemeCalcul sistemeCalcul = new SistemeCalcul(denumire, nr_inv, pret, zona_mag.EXPUS,
                                        tip_mon, viteza, c_hdd, Sistem_operare.Windows);
                                echipamente.add(sistemeCalcul);
                            }
                            break;

                        case "VANDUT":
                            if(sistem_operare.equals(Sistem_operare.Linux.toString()))
                            {
                                SistemeCalcul sistemeCalcul = new SistemeCalcul(denumire, nr_inv, pret, zona_mag.VANDUT,
                                        tip_mon, viteza, c_hdd, Sistem_operare.Linux);
                                echipamente.add(sistemeCalcul);
                            }
                            else {
                                SistemeCalcul sistemeCalcul = new SistemeCalcul(denumire, nr_inv, pret, zona_mag.VANDUT,
                                        tip_mon, viteza, c_hdd, Sistem_operare.Windows);
                                echipamente.add(sistemeCalcul);
                            }
                            break;
                    }


                    break;
            }

        }
        while(!quit)
        {
            System.out.println("---------------------------------");
            System.out.println("1.Afişarea tuturor echipamentelor");
            System.out.println("2.Afişarea imprimantelor");
            System.out.println("3.Afisarea copiatoarelor");
            System.out.println("4.Afişarea sistemelor de calcul");
            System.out.println("5.Modificarea stării în care se află un echipament");
            System.out.println("6.Setarea unui anumit mod de scriere pentru o imprimantă");
            System.out.println("7.Setarea unui format de copiere pentru copiatoare");
            System.out.println("8.Instalarea unui anumit sistem de operare pe un sistem de calcul");
            System.out.println("9.Afişarea echipamentelor vândute");
            System.out.println("10.Serializare/Deserializare");
            System.out.println("---------------------------------");

            System.out.println("Introduceti una dintre optiunile de mai sus:");
            optiune = scanner1.nextInt();
            switch (optiune)
            {
                case 1:
                    int x = 014;
                    x += 3;
                    System.out.println(x);
                    for(Echipament e : echipamente)
                    {
                        System.out.println(e.toString());
                    }
                    break;
                case 2:
                    for(Echipament e : echipamente)
                    {
                        if(e instanceof Imprimante)
                        {
                            System.out.println(e.toString());
                        }
                    }
                    break;
                case 3:
                    for(Echipament e : echipamente)
                    {
                        if(e instanceof Copiatoare)
                        {
                            System.out.println(e.toString());
                        }
                    }
                    break;
                case 4:
                    for(Echipament e : echipamente) {
                        if (e instanceof SistemeCalcul)
                        {
                            System.out.println(e.toString());
                        }
                    }
                    break;
                case 5:
                    System.out.println("Dati nr. articolului pe care vreti sa-l modificati:");
                    nr_inv = scanner1.nextInt();
                    System.out.println("Dati noua stare a articolului: ");
                    zona = scanner1.next();
                    for(Echipament e: echipamente)
                    {
                        if(nr_inv == e.getNr_inv())
                        {
                            if(zona.equalsIgnoreCase(zona_mag.VANDUT.toString()))
                            {
                                e.setZona(zona_mag.VANDUT);
                            }
                            else if(zona.equalsIgnoreCase(zona_mag.ACHIZITIONAT.toString()))
                            {
                                e.setZona(zona_mag.ACHIZITIONAT);
                            }
                            else if(zona.equalsIgnoreCase(zona_mag.EXPUS.toString()))
                            {
                                e.setZona(zona_mag.EXPUS);
                            }
                            else
                                System.out.println("Nu ati introdus nicio stare corecta");
                        }
                    }
                    break;
                case 6:
                    System.out.println("Atribuiti un nou mod imprimantei:");
                    System.out.println("Variante: color/alb_negru");
                    mod_tiparire = scanner1.next();
                    for(Echipament e : echipamente){
                    if (e instanceof Imprimante)
                    {
                        if(mod_tiparire.equalsIgnoreCase(ModTiparire.Color.toString()))
                            ((Imprimante) e).setMod_tiparire(ModTiparire.Color);
                        else if (mod_tiparire.equalsIgnoreCase(ModTiparire.Alb_Negru.toString())) {
                            ((Imprimante) e).setMod_tiparire(ModTiparire.Alb_Negru);
                        }
                        else
                            System.out.println("Nu ati introdus niciun mod corespunzator");
                    }
                }
                break;

                case 7:
                    System.out.println("Atribuiti un nou format de copiere copiatorului:");
                    System.out.println("Variante: a3/a4");
                    format = scanner1.next();
                    for (Echipament e: echipamente) {
                        if (e instanceof Copiatoare) {
                            if(format.equalsIgnoreCase(Format.A3.toString()))
                            {
                                ((Copiatoare) e).setFormat(Format.A3);
                            } else if (format.equalsIgnoreCase(Format.A4.toString()))
                            {
                                ((Copiatoare) e).setFormat(Format.A4);
                            }
                            else
                                System.out.println("Nu ati introdus nicio varianta corecta");
                        }
                    }
                    break;

                case 8:
                    System.out.println("Instalati un sistem de operare pe un sistem de calcul");
                    System.out.println("Variante: Windows/Linux");
                    sistem_operare = scanner1.next();
                    for(Echipament e: echipamente)
                    {
                        if(e instanceof SistemeCalcul)
                        {
                            if(sistem_operare.equalsIgnoreCase(Sistem_operare.Windows.toString()))
                            {
                                ((SistemeCalcul) e).setS(Sistem_operare.Windows);
                            } else if (sistem_operare.equalsIgnoreCase(Sistem_operare.Linux.toString()))
                            {
                                ((SistemeCalcul) e).setS(Sistem_operare.Linux);
                            }
                            else
                                System.out.println("Nu ati introdus nicio varianta valida");
                        }
                    }
                    break;

                case 9: for(Echipament e : echipamente)
                {

                    if (e.getZona().equals(zona_mag.VANDUT))
                    {
                        System.out.println(e.toString());
                    }
                }
                    break;

                case 10:
                    System.out.println("Aveti urmatoarele optiuni:");
                    System.out.println("1.Serializarea colectiei.");
                    System.out.println("2.Deserializarea colectiei.");
                    System.out.println("Introduceti optiunea dorita: ");
                    optiune = scanner1.nextInt();
                    for(Echipament e: echipamente)
                    {
                        if(optiune == 1)
                        {
                            seriazliare(wr, e);
                        } else if (optiune == 2)
                        {
                            deserializare(wr, e);
                        }
                        else
                            System.out.println("Nu ati introdus nicio optiune corecta.");
                    }
                    break;
            }
        }

    }
}
