package Exercitiul2;

import java.time.LocalDate;
import java.util.Date;

public class Produs {
    String denumire;
    double pret;
    int cantitate;
    LocalDate data_expirarii;

    public static double incasari = 0;

    public Produs(String denumire, double pret, int cantitate, LocalDate data_expirarii) {
        this.denumire = denumire;
        this.pret = pret;
        this.cantitate = cantitate;
        this.data_expirarii = data_expirarii;
    }

    @Override
    public String toString() {
        return
                "Denumire: " + denumire +
                ", Pret: " + pret +
                ", Cantitate: " + cantitate +
                ", Data expirarii: " + data_expirarii;
    }

    public String getDenumire() {
        return denumire;
    }

    public double getPret() {
        return pret;
    }

    public void setCantitate(int cantitate) {
        this.cantitate = cantitate;
    }

    public int getCantitate() {
        return cantitate;
    }

    public LocalDate getData_expirarii() {
        return data_expirarii;
    }

    public static void setIncasari(double incasari) {
        Produs.incasari = incasari;
    }

    public double getIncasari()
    {
        return Produs.incasari;
    }
}
