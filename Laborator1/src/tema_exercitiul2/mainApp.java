package tema_exercitiul2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;
public class mainApp
{
    public static void main(String[] args) throws FileNotFoundException {
        String nume_fisier = "numere.txt";
        float sum = 0;
        float Am = 0;
        int i = 0;
        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;
        Scanner scanner = new Scanner(new File(nume_fisier));
        while (scanner.hasNextLine())
        {
            i++;
            int linie = Integer.parseInt(scanner.nextLine());
            sum += linie;
            Am = sum / i;

            if (linie < minValue)
            {
                minValue = linie;
            }

            if (linie > maxValue)
            {
                maxValue = linie;
            }
        }

        PrintStream flux_out = new PrintStream("out.txt");
        flux_out.println("Suma numerelor din fisier: " + sum);
        System.out.println(sum);
        flux_out.println("Media aritmetica a numerelor din fisier: " + Am);
        System.out.println(Am);
        flux_out.println("Valoarea maxima a numerelor din fisier: " + maxValue);
        System.out.println(maxValue);
        flux_out.println("Valoarea minima a numerelor din fisier: " + minValue);
        System.out.println(minValue);

    }
}
