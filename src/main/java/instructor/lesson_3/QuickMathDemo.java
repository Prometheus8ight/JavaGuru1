package instructor.lesson_3;

public class QuickMathDemo {

    public static void main(String[] args) {

        QuickMath math = new QuickMath();
        int a = math.sqr(2);
        int b = math.sqr(5);

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        int c = math.cube(4);
        System.out.println("c = " + c);

    }
}
