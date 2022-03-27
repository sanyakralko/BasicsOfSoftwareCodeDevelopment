package lineProgramm;

public class Program6 {
    public static void main(String[] args) {
        System.out.println( new Program6().func(-3,-3));
    }

    public boolean func(int x, int y) {
        if ((y <= 4 && y>=0) && (x >= -2 && x <= 2))
            return true;
        else if((y<=0 && y>=-3) && (x >= -4 && x <= 4))
            return true;
        else
            return false;

    }
}
