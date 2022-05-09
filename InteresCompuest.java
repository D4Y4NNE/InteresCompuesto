public class InteresCompuest
{
    public void calculate(int p, int t, double r, int n)
    {
        double A = p * Math.pow(1 + (r / n), n * t);
        double interescom = A - p;
        System.out.println("Interes compuesto despues: " + t + " anios: " + interescom);
        System.out.println("Importe despues de: " + t + " anios: " + A);
    }
    public static  void main(String[]args)
    {
        InteresCompuest obj = new InteresCompuest();
        obj.calculate(40, 5, .06, 10);
    }
}