package Exercitiul2;
import java.lang.String;
import java.util.Random;

public class Vers
{
        private static String [] linie;;

    public static int nrCuvinte(String s)
    {
        linie = s.split(" ");
     int nr_cuv = linie.length;
        return nr_cuv;
    }

    public static int Vowels()
    {
        int vocale = 0;
        char v = ' ';
        for (int i = 0; i < linie.length; i++)
        {
            for (int j = 0; j<linie[i].length(); j++)
            {
                v = linie[i].charAt(j);
                if(v == 'a' || v == 'e' || v == 'i' || v == 'o' || v == 'u'
                || v == 'A' || v == 'E' || v == 'I' || v == 'O' || v == 'U')
                {
                    vocale++;
                }
            }
        }
        return vocale;
    }

    public static String  VerificareFinal(String s)
    {
            if (s.endsWith("ng") || s.endsWith("nd")) {
                return  " * ";

            }
            return " ";
    }

    public static float randomGen()
    {
        Random rand = new Random();
        int n = rand.nextInt(11);
        float randomNmb = n / 10.0f;
        return randomNmb;
    }


}
