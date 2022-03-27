package branching;

public class Program2 {
    public static void main(String[] args) {
        System.out.println(new Program2().max(1,2,3,4));
    }
    public int max (int a,int b,int c,int d){
        return Math.max(Math.min(a,b),Math.min(c,d));
    }
}
