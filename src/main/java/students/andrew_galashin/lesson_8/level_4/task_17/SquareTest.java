package students.andrew_galashin.lesson_8.level_4.task_17;

class SquareTest {

    public static void main(String[] args) {
        SquareTest start = new SquareTest();
        start.test1();
        start.test2();
    }

    void test1() {
        Square start = new Square(2);
        double result = start.calculateArea();
        check(result, 4, "squareAreaTest");
    }

    void test2() {
        Square start = new Square(2);
        double result = start.calculatePerimeter();
        check(result, 8, "squarePerimeterTest");
    }

    void check(double result, double expected, String testName) {
        if (result == expected) {
            System.out.println(testName + ": Complete");
        } else {
            System.out.println(testName + ": Fail");
        }
    }
}
