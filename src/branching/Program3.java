package branching;

public class Program3 {
    public static void main(String[] args) {
        Point p1= new Point(-4,-3);
        Point p2= new Point(-2,-1);
        Point p3= new Point(-1,0);
        new Program3().line(p1,p2,p3);
        }


    public void line(Point p1, Point p2, Point p3){
        double s=1/2.0*((p1.x- p3.x)*(p2.y- p3.y)-(p2.x- p3.x)*(p1.y-p3.y));
        if(s==0){
            System.out.println(" точки лежат в одной прямой");
        }
        else
            System.out.println(" лежат не в одной прямой");
    }
}
class Point{
    int x;
    int y;
    public Point(int x,int y){
        this.x=x;
        this.y=y;
    }
}
