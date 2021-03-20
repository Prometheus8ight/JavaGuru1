package students.andrew_galashin.lesson_8.level_4.task_18;

class RectangleTest {
    public static void main(String[] args) {
        RectangleTest start = new RectangleTest();
        start.test1();
        start.test2();
    }

    void test1() {
        Rectangle start = new Rectangle(2, 4);
        double result = start.calculateArea();
        check(result, 8, "rectangleAreaTest");
    }

    void test2() {
        Rectangle start = new Rectangle(2, 4);
        double result = start.calculatePerimeter();
        check(result, 12, "rectanglePerimeterTest");
    }

    void check(double result, double expected, String testName) {
        if (result == expected) {
            System.out.println(testName + ": Complete");
        } else {
            System.out.println(testName + ": Fail");
        }
    }
}
