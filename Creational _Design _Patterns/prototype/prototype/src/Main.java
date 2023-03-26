import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;



public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {


        Rectangle r = new Rectangle(10,13);

        System.out.println(r.GetAll());

        Circle c = new Circle(5,5,2);

        System.out.println(c.GetAll());

        square s = new square(1,1,1);
        System.out.println(s.GetAll());

        Rectangle r1= (Rectangle) r.clone();
        System.out.println("new-->"+r1.GetAll());
        Circle c1= (Circle) c.clone();
        System.out.println("new-->"+c1.GetAll());
        c1.setX(10);
        c1.setY(22);
        c1.setRadius(4);
        System.out.println("newEdit-->"+c1.GetAll());




    }
}