package students.deniss_jankovskis.lesson_8.level_4.task_16;

class CircleTest {

    public static void main(String[] args) {

        CircleTest test = new CircleTest();
        test.areaTest();
        test.perimeterTest();
    }

    public void areaTest() {
        Shape circle = new Circle("Circle", 10);
        double expectedResult = 314.15926535898;
        checkTestResult(expectedResult, circle.calculateArea(), "areaTest");
    }

    public void perimeterTest() {
        Shape circle = new Circle("Circle", 10);
        double expectedResult = 62.831853071796;
        checkTestResult(expectedResult, circle.calculatePerimeter(), "perimeterTest");
    }

    public void checkTestResult(double expectedResult, double realResult, String testName) {
        if (expectedResult == realResult) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - FALSE");
        }
    }
}
