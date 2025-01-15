package Exercitiul3;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Clasa Mobilier
 * Metode getter si setter pentru citirea si scrierea cu
 * ajutorul bibliotecilor de pe internet
 */

import java.util.List;


public class Mobilier {
    private String denumire;
    private List<Placa>placi;

    public Mobilier() {
    }

    public Mobilier(String denumire, List<Placa> placi) {
        this.denumire = denumire;
        this.placi = placi;
    }

    public String getDenumire() {
        return denumire;
    }

    public List<Placa> getPlaci() {
        return placi;
    }

    @Override
    public String toString() {
        return "Denumire: " + denumire + '\'' +
                ", Componente: " + placi;
    }
}
