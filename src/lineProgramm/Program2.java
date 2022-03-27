package lineProgramm;

public class Program2 {
    public static void main(String[] args) {

        System.out.println(new Program2().func(2.0, 3.0, 5.7));
    }
    public  double func(double a, double b, double c)
    {
        double z =(b+Math.sqrt((b*b+4*a*c)))/2*a - Math.pow(a,3.0) + Math.pow(b,-2.0);
        return z;
    }
}
