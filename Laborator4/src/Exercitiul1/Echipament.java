package Exercitiul1;

import java.io.Serializable;

/**
 * Avem clasa principala din care se vor deriva ulterior celelalte clase
 * @author student
 * metode suprascrise precum toString()
 * gettere si settere
 */

public class Echipament implements Serializable {
    private String denumire;
    private int nr_inv;
    private float pret;
    zona_mag zona;

    public Echipament(String denumire, int nr_inv, float pret, zona_mag z) {
        this.denumire = denumire;
        this.nr_inv = nr_inv;
        this.pret = pret;
        this.zona = z;
    }
    @Override
    public String toString() {
        /**
         Documentatie
        */
        return "Denumire: " + denumire + ", Număr inventar: " + nr_inv + ", Pret: " + pret + ", Stare: " + zona;
    }

    public void setZona(zona_mag zona) {
        this.zona = zona;
    }

    public int getNr_inv() {
        return nr_inv;
    }

    public zona_mag getZona() {
        return zona;
    }
}




