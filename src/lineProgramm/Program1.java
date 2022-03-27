package lineProgramm;

public class Program1 {
    public static void main(String[] args) {
        double z = new Program1().func(6,2,5);
        System.out.println(z);
    }


public  double func(int a, int b, int c){
    return ((a-3)*b/2.0+c);
}
}
