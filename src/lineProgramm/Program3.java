package lineProgramm;

public class Program3 {
    public static void main(String[] args) {
        System.out.println(new Program3().fc(1,0.3));
    }
    public double fc(double x, double y){
        return (Math.sin(x)+Math.cos(y))/(Math.sin(x)-Math.cos(y)) * Math.tan(x*y);
    }
}
