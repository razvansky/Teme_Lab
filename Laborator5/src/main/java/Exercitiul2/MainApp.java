package Exercitiul2;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void scriere(List<PerecheNumere>lista) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        File fisier = new File("src/main/resources/numere.json");
        mapper.writeValue(fisier, lista);
    }

    public static List<PerecheNumere> citire() throws IOException {
        File fisier = new File("src/main/resources/numere.json");
        ObjectMapper mapper = new ObjectMapper();
        List<PerecheNumere> numere = mapper.
                readValue(fisier, new TypeReference<List<PerecheNumere>>() {});
        return numere;
    }

    public static void main(String[] args) throws IOException {
        List<PerecheNumere> numere = citire();
        numere.add(new PerecheNumere(5,5));
        //scriere(numere);
        System.out.println(numere);
        for (PerecheNumere p : numere)
        {
            p.cmmMc();
            p.calculeazaSuma();
            p.nrPare();
        }

    }
}
