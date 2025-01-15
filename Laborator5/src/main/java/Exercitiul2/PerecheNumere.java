package Exercitiul2;

public class PerecheNumere {
    private int a;
    private int b;

    // No-argument constructor (needed for deserialization)
    public PerecheNumere() {}

    // Constructor with parameters
    public PerecheNumere(int a, int b) {
        this.a = a;
        this.b = b;
    }

    // Getters and setters
    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "a: " + a + ", b: " + b;
    }

    public boolean calculeazaSuma()
    {
        int s = 0;
        int s1 = 0;
        for(int i = 0; i <= a; i++)
        {
            s += i;
        }
        for(int i = 0; i <= b; i++)
        {
            s1 += i;
        }
        if(s == s1)
        {
            System.out.println(s);
            return true;
        }
        return false;
    }

    public boolean nrPare()
    {
        int count = 0;
        int count1 = 0;

        int number1 = this.a;
        int number2 = this.b;
        while(number1 > 0)
        {
            int digit = number1 % 10;
            number1 = number1 / 10;

            if(digit % 2 == 0)
                count ++;
        }
        while(number2 > 0)
        {
            int digit = number2 % 10;
            number2 = number2 / 10;
            if(digit % 2 == 0)
                count1 ++;
        }
        if(count == count1)
        {
            System.out.println("Acelasi numar de cifre pare" + count1);
            return true;
        }
        return false;
    }

    public void cmmMc() {
        int nr1 = a;
        int nr2 = b;
        while (nr1 != nr2) {
            if (nr1 > nr2) {
                nr1 = nr1 - nr2;
            } else {
                nr2 = nr2 - nr1;
            }
        }
        System.out.println("Multiplul comun: " + Math.abs(a * b) / nr2);
    }
}
