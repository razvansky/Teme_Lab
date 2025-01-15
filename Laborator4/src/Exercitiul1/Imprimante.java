package Exercitiul1;

public class Imprimante extends Echipament
{
    /**
     * Clasa derivata din Echipament
     * contine o metoda suprascrisa toString() pentru afisare
     * contine un setter pentru modul de tiparire
     */
    int ppm; //pagini scrise pe minut
    String rezolutie;
    int p_car; //pagini pe cartus
    ModTiparire mod_tiparire;

    public Imprimante(String denumire, int nr_inv, float pret, zona_mag z, int ppm, String rezolutie, int p_car, ModTiparire mod_tiparire) {
        super(denumire, nr_inv, pret, z);
        this.ppm = ppm;
        this.rezolutie = rezolutie;
        this.p_car = p_car;
        this.mod_tiparire = mod_tiparire;
    }
    @Override
    public String toString()
    {
        return super.toString() + ", Pagini pe minut: " + ppm + ", Rezolutie: " + rezolutie + " pixeli" +
                ", Pagini/cartus: " + p_car + ", Mod de tiparire: " + mod_tiparire;
    }

    public void setMod_tiparire(ModTiparire mod_tiparire) {
        this.mod_tiparire = mod_tiparire;
    }
}
