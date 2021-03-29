package students.julija_katukova.lesson_8.level_4.task_18;

class RectangleTest {
    public static void main(String[] args) {
        RectangleTest rectangleTest = new RectangleTest();
        rectangleTest.areaTest1();
        rectangleTest.perimeterTest1();
    }

    public void areaTest1() {
        Shape rectangle = new Rectangle("rectangle", 5, 3);
        double realResult = rectangle.calculateArea();
        checkForDouble(realResult, 15, "Area Test 1");
    }

    public void perimeterTest1() {
        Shape rectangle = new Rectangle("rectangle", 5, 3);
        double realResult = rectangle.calculatePerimeter();
        checkForDouble(realResult, 16, "Perimeter Test 1");
    }

    public void checkForDouble(double realResult, double expectedResult, String testName) {
        if (realResult == expectedResult) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
}
