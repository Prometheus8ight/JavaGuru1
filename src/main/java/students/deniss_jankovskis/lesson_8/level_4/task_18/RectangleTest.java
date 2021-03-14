package students.deniss_jankovskis.lesson_8.level_4.task_18;

class RectangleTest {

    public static void main(String[] args) {

        RectangleTest test = new RectangleTest();
        test.areaTest();
        test.perimeterTest();
    }

    public void areaTest() {
        Shape rectangle = new Rectangle("Rectangle", 10, 5);
        double expectedResult = 50;
        checkTestResult(expectedResult, rectangle.calculateArea(), "areaTest");
    }

    public void perimeterTest() {
        Shape rectangle = new Rectangle("Rectangle", 10, 5);
        double expectedResult = 30;
        checkTestResult(expectedResult, rectangle.calculatePerimeter(), "perimeterTest");
    }

    public void checkTestResult(double expectedResult, double realResult, String testName) {
        if (expectedResult == realResult) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - FALSE");
        }
    }
}

