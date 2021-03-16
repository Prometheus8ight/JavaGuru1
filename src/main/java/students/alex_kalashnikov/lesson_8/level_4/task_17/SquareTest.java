package students.alex_kalashnikov.lesson_8.level_4.task_17;

class SquareTest {

    public static void main(String[] args) {

        SquareTest newObject = new SquareTest();
        newObject.testCalculateArea();
        newObject.testCalculatePerimeter();

    }

    void test(double expectedResult, double realResult) {
        if (expectedResult == realResult) {
            System.out.println("Test is OK!");
        } else {
            System.out.println("Test is FAILED!");
        }
    }

    void testCalculateArea() {
        Square square1 = new Square("Square 1", 5.0);
        double expectedResult = 25.0;
        double realResult = square1.calculateArea();
        test(expectedResult, realResult);
    }

    void testCalculatePerimeter() {
        Square square2 = new Square("Square 2", 4.0);
        double expectedResult = 16.0;
        double realResult = square2.calculatePerimeter();
        test(expectedResult, realResult);
    }

}