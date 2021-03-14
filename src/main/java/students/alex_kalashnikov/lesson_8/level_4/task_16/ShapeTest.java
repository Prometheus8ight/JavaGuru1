package students.alex_kalashnikov.lesson_8.level_4.task_16;

class ShapeTest {

    public static void main(String[] args) {

        ShapeTest newObject = new ShapeTest();
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
        Circle circle1 = new Circle("Circle 1", 4.5);
        double expectedResult = Math.PI * 4.5 * 4.5;
        double realResult = circle1.calculateArea();
        test(expectedResult, realResult);
    }

    void testCalculatePerimeter() {
        Circle circle2 = new Circle("Circle 2", 4.0);
        double expectedResult = Math.PI * 4.0 * 2;
        double realResult = circle2.calculatePerimeter();
        test(expectedResult, realResult);
    }

}


