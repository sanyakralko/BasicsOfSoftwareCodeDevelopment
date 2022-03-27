package lineProgramm;

public class Program4 {
    public static void main(String[] args) {
        System.out.println(new Program4().func(123.254));
    }

    public double func(double a) {
    double d = (int) a / 1000.0;
        double b = (a - (int)a)  ;
        int s=  (int) (1000* b);
        return s+d;
    }
}
