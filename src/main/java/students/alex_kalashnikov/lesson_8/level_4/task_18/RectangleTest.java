package students.alex_kalashnikov.lesson_8.level_4.task_18;

class RectangleTest {

    public static void main(String[] args) {

        RectangleTest newObject = new RectangleTest();
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
        Rectangle rectangle1 = new Rectangle("Rectangle 1", 2.0, 3.0);
        double expectedResult = 6;
        double realResult = rectangle1.calculateArea();
        test(expectedResult, realResult);
    }

    void testCalculatePerimeter() {
        Rectangle rectangle2 = new Rectangle("Rectangle 2", 4.0, 3.0);
        double expectedResult = 14.0;
        double realResult = rectangle2.calculatePerimeter();
        test(expectedResult, realResult);
    }

}