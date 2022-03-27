package branching;

public class Program1 {
    public static void main(String[] args) {
new Program1().triangle(35,55);
    }
    public  void triangle (int a, int b){
        int c=180-(a+b);
    if(c>0){
        System.out.println("существует");
        if (a==90 || b==90 || c==90){
            System.out.println("треугольник прямоугольный");
        }
    }
    else
        System.out.println("не существует");
    }
}
