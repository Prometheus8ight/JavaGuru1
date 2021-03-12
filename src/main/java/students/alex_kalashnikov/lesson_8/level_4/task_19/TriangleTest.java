package students.alex_kalashnikov.lesson_8.level_4.task_19;

class TriangleTest {

    public static void main(String[] args) {

        TriangleTest newObject = new TriangleTest();
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
        Triangle triangle1 = new Triangle("Triangle 1", 5.0);
        double expectedResult = 6.25 * Math.sqrt(3);
        double realResult = triangle1.calculateArea();
        test(expectedResult, realResult);
    }

    void testCalculatePerimeter() {
        Triangle triangle2 = new Triangle("Triangle 2", 4.0);
        double expectedResult = 12.0;
        double realResult = triangle2.calculatePerimeter();
        test(expectedResult, realResult);
    }

}