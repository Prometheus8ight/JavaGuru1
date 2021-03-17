package students.andrew_galashin.lesson_8.level_4.task_19;

class TriangleTest {

    public static void main(String[] args) {
        TriangleTest start = new TriangleTest();
        start.test1();
        start.test2();

    }

    void test1() {
        Triangle start = new Triangle(2, 3);
        double result = start.calculateArea();
        check(result, 3, "triangleAreaTest");
    }

    void test2() {
        Triangle start = new Triangle(2, 0);
        double result = start.calculatePerimeter();
        check(result, 6, "trianglePerimeterTest");
    }

    void check(double result, double expected, String testName) {
        if (result == expected) {
            System.out.println(testName + ": Complete");
        } else {
            System.out.println(testName + ": Fail");
        }
    }
}
