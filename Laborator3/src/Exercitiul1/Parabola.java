package Exercitiul1;

class Parabola
{
    private int a;
    private int b;
    private int c;
    public Parabola(int a, int b, int c)
    {
        this.a = a;
        this.b = b;
        this.c = c;

    }
    @Override
    public String toString()
    {
        return "Ec: " + a + "x^2" + " + " + b + "x" + " + " + c;
    }
    public int[] calculeazaVarf()
    {
        int x = (-b / 2*a);
        int y = ((-b) * (-b) + 4 * a* c)/(4 * a);
        return new int []{x,y} ;
    }
    public String mijloc(Parabola p)
    {
        int[] v1 = calculeazaVarf();
        int[] v2 = p.calculeazaVarf();
        int x = (v1[0] + v2[0])/2;
        int y = (v1[1] + v2[1])/2;
        return "Mijlocul: (" + x +  ", " + y + ")";
    }
    public  static String mijloc(Parabola a, Parabola b)
    {
        int [] v1 = a.calculeazaVarf();
        int [] v2 = b.calculeazaVarf();
        int x = (v1[0] + v2[0])/2;
        int y = (v1[1] + v2[1])/2;
        return "Mijlocul celor doua parabole: (" + x +  ", " + y + ")";
    }

    public String segment(Parabola par)
    {
        int [] v1 = calculeazaVarf();
        int [] v2 = par.calculeazaVarf();
        double distance = Math.hypot(v2[0] - v1[0],v2[1] - v1[1]);
        return "Lungimea segmentului de dreapta: " + distance;
    }
    public static String segment(Parabola a, Parabola b)
    {
        int [] v1 = a.calculeazaVarf();
        int [] v2 = b.calculeazaVarf();
        double distance = Math.hypot(v2[0] - v1[0], v2[1] - v1[1]);
        return "Lungimea segmentului de dreapta: " + distance;

    }
}
