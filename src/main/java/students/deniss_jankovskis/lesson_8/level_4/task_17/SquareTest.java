package students.deniss_jankovskis.lesson_8.level_4.task_17;

class SquareTest {

    public static void main(String[] args) {

        SquareTest test = new SquareTest();
        test.areaTest();
        test.perimeterTest();
    }

    public void areaTest() {
        Shape square = new Square("Square", 10);
        double expectedResult = 100;
        checkTestResult(expectedResult, square.calculateArea(), "areaTest");
    }

    public void perimeterTest() {
        Shape square = new Square("Circle", 10);
        double expectedResult = 40;
        checkTestResult(expectedResult, square.calculatePerimeter(), "perimeterTest");
    }

    public void checkTestResult(double expectedResult, double realResult, String testName) {
        if (expectedResult == realResult) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - FALSE");
        }
    }
}
