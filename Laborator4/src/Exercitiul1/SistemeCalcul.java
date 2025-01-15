package Exercitiul1;

public final class SistemeCalcul extends Echipament{
    /**
     * Clasa derivata din Echipament
     * contine o metoda suprascrisa toString() pentru afisare
     * contine un setter pentru Sistemul de operare
     */
        String tip_mon;
        String viteza;
        int c_hdd; //capacitate hdd
        Sistem_operare S;

        public SistemeCalcul(String denumire, int nr_inv, float pret, zona_mag z, String tip_mon, String viteza, int c_hdd, Sistem_operare S) {
            super(denumire, nr_inv, pret, z);
            this.tip_mon = tip_mon;
            this.viteza = viteza;
            this.c_hdd = c_hdd;
            this.S = S;
        }

    @Override
    public String toString() {
        return super.toString() +
                ", Tip monitor: " + tip_mon +
                ", Viteza: " + viteza +
                ", Capacitatea HDD-ului: " + c_hdd +
                ", Sistem operare: " + S;
    }

    public void setS(Sistem_operare s) {
        S = s;
    }
}
