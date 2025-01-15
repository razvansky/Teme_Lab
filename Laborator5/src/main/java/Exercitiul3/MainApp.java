package Exercitiul3;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainApp {


    public static final int LATIME_COLA_PAL = 2800;
    public static final int INALTIME_COLA_PAL = 2070;
    public static final int ARIA_COLA_PAL = LATIME_COLA_PAL * INALTIME_COLA_PAL;

    public static void scriere(List<Mobilier>lista) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        File fiser = new File("src/main/resources/mobilier.json");
        mapper.writeValue(fiser, lista);
    }
    public static List<Mobilier>citire() throws IOException {
        File fisier = new File("src/main/resources/mobilier.json");
        ObjectMapper mapper = new ObjectMapper();
        List<Mobilier> mobiliere = mapper.
                readValue(fisier, new TypeReference<List<Mobilier>>(){});
        return mobiliere;
    }

    public static void main(String[] args) throws IOException
    {

         List<Mobilier> mobilierList = citire();
        List<Placa> placi = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean[] canturi = {true, false, true, true};
        Placa usa = new Placa("usa", 120, 90, Orientare.LUNGIME, canturi, 1);
        Placa raftMobil = new Placa("raft mobil", 120, 70, Orientare.LATIME, canturi, 3);
        placi.add(raftMobil);
        placi.add(usa);
        Placa capac = new Placa("capac", 2800, 2070, Orientare.ORICARE, canturi, 2);
        placi.add(capac);
//        Mobilier m1 = new Mobilier("Sufragerie", placi);
//        mobilierList.add(m1);
//        scriere(mobilierList);
        String piesa_mobilier;
        for (Mobilier m : mobilierList)
        {
            System.out.println(m.getDenumire());
        }
        System.out.print("Dati o piesa de mobilier din cele de mai sus: ");
        piesa_mobilier = scanner.next();

        boolean found = false;
        for (Mobilier m : mobilierList) {
            if (piesa_mobilier.equalsIgnoreCase(m.getDenumire())) {
                System.out.println("Componente: " + m.getPlaci());
                found = true;
            }
        }

        if (!found) {
            System.out.println("Piesa de mobilier nu a fost gasita");
        }

        System.out.println("Dati lungimea placii: ");
        int lungime = scanner.nextInt();
        System.out.println("Dati latimea placii: ");
        int latime = scanner.nextInt();
        System.out.println("Dati numarul de bucati: ");
        int numarBucati = scanner.nextInt();

        int ariaTotalaNecesara = lungime * latime * numarBucati;
        System.out.println("Aria totala necesara este: " + ariaTotalaNecesara + " mm^2");

        // Calculează numărul de coli de PAL necesare
        int numarColiNecesare = (int) Math.ceil((double) ariaTotalaNecesara / ARIA_COLA_PAL);
        System.out.println("Numarul estimat de coli de PAL necesare: " + numarColiNecesare);

    }

}

