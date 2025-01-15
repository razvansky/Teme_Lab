package exercitiul4;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Persoana {
    private static  String nume, cnp;

    public static String getNume() {
        return nume;
    }

    public static String getCnp() {
        return cnp;
    }

    public static void getVarsta(String cnp)
    {
        String sex = cnp.substring(0,1);
        int anul_nasterii = Integer.parseInt(cnp.substring(1,3));
        int anul = 0;
        int luna = Integer.parseInt(cnp.substring(3,5));
        int ziua = Integer.parseInt(cnp.substring(5,7));
        LocalDateTime dt1 = LocalDateTime.now();
        if(sex.equals("1"))
        {
            System.out.println("masculin");
            anul += 1900;
            anul += anul_nasterii;
            System.out.println("nascut in anul: " + anul);
            System.out.println("Luna: " + luna);
            System.out.println("Ziua: " + ziua);
        }
        else if(sex.equals("5")){
            System.out.println("masculin");
            anul += 2000;
            anul += anul_nasterii;
            System.out.println("nascut in anul: " + anul);
            System.out.println("Luna: " + luna);
            System.out.println("Ziua: " + ziua);
        }
        else if(sex.equals("2"))
        {
            System.out.println("feminin");
            anul += 1900;
            anul += anul_nasterii;
            System.out.println("nascuta in anul: " + anul);
            System.out.println("Luna: " + luna);
            System.out.println("Ziua: " + ziua);
        }
        else if(sex.equals("6"))
        {
            System.out.println("feminin");
            anul += 2000;
            anul += anul_nasterii;
            System.out.println("nascuta in anul: " + anul);
            System.out.println("Luna: " + luna);
            System.out.println("Ziua: " + ziua);
        }
        String data = String.format("%02d.%02d.%d", ziua, luna, anul);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate d2 = LocalDate.parse(data, formatter);
        System.out.println(d2.format(DateTimeFormatter.ofPattern("dd.MM.yyyy")));
        long nr_ani = ChronoUnit.YEARS.between(d2,dt1);
        System.out.println("Varsta: " + nr_ani);
    }

    public Persoana(String nume, String CNP)
    {
        this.nume= nume;
        this.cnp = CNP;
    }
}
