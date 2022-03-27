package branching;

public class Program4 {
    public static void main(String[] args) {
        Brick b1 = new Brick(1, 2, 3);
        Brick b2 = new Brick(5, 8, 10);
        Otv otv = new Otv(6, 7);
        func(b1, otv);
        func(b2, otv);
    }

    public static void func(Brick brick, Otv otv) {
        if ((brick.x < otv.a && brick.y < otv.b) || (brick.x < otv.b && brick.y < otv.a)) {
            System.out.println("проходит");
        } else if ((brick.x < otv.a && brick.z < otv.b) || (brick.x < otv.b && brick.z < otv.a)) {
            System.out.println("проходит");
        } else if ((brick.y < otv.a && brick.z < otv.b) || (brick.y < otv.b && brick.z < otv.a)) {
            System.out.println("проходит");
        } else
            System.out.println(" не проходит");
    }
}

class Brick {
    int x;
    int y;
    int z;

    public Brick(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
}

class Otv {
    int a;
    int b;

    public Otv(int a, int b) {
        this.a = a;
        this.b = b;
    }
}