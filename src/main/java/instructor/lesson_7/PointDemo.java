package instructor.lesson_7;

class PointDemo {

    public static void main(String[] args) {

        Point a = new Point(3, 8);
        Point b = new Point(2, 4);
        Point c = new Point(1, 1);

        System.out.println("a.getX() = " + a.getX());
        System.out.println("a.getY() = " + a.getY());

        a.setX(4);
        a.setY(9);

        System.out.println("a.getX() = " + a.getX());
        System.out.println("a.getY() = " + a.getY());

//        a.x = 5;
//        a.y = 9;

    }
}
