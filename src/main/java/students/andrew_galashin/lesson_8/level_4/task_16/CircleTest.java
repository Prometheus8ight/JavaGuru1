package students.andrew_galashin.lesson_8.level_4.task_16;

class CircleTest {

    public static void main(String[] args) {
        CircleTest start = new CircleTest();
        start.test1();
        start.test2();
    }


    void test1() {
        Circle start = new Circle(2);
        double result = start.calculateArea();
        check(result, 12.566370614359172, "areaTest");
    }

    void test2() {
        Circle start = new Circle(2);
        double result = start.calculatePerimeter();
        check(result, 12.566370614359172, "perimeterTest");
    }

    void check(double result, double expected, String testName) {
        if (result == expected) {
            System.out.println(testName + ": Complete");
        } else {
            System.out.println(testName + ": Fail");
        }
    }
}
