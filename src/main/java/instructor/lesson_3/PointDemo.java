package instructor.lesson_3;

public class PointDemo {

    public static void main(String[] args) {

        Point a = new Point(1, 2);
//        a.x = 1;
//        a.y = 1;

        Point b = new Point(4, 2);
        b.x = 4;
        b.y = 2;

        a.printInfo("A");
        b.printInfo("asdlkjasdlkj");

        System.out.println("a.x = " + a.x);
        System.out.println("a.y = " + a.y);

        System.out.println("b.x = " + b.x);
        System.out.println("b.y = " + b.y);

        Point c = new Point();
        c.x = 42;

        System.out.println("c.x = " + c.x);
        System.out.println("c.y = " + c.y);

        c.printInfo("The C");

    }
}
