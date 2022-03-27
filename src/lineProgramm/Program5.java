package lineProgramm;

public class Program5 {
    public static void main(String[] args) {
new Program5().func(3600);
    }

    public void func(int t) {
        int h =t/3600;
        t=t-3600*h;
        int m=t/60;
        t=t-m*60;
        int s=t;
        System.out.printf("%dч %dмин %dс",h,m,s);
    }
}
