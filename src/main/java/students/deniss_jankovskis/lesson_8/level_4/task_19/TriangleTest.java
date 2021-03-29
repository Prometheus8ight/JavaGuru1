package students.deniss_jankovskis.lesson_8.level_4.task_19;

class TriangleTest {

    public static void main(String[] args) {

        TriangleTest test = new TriangleTest();
        test.areaTest();
        test.perimeterTest();
    }

    public void areaTest() {
        Shape triangle = new Triangle("Triangle", 3, 6, 8);
        double expectedResult = 7.644;
        checkTestResult(expectedResult, triangle.calculateArea(), "areaTest");
    }

    public void perimeterTest() {
        Shape triangle = new Triangle("Triangle", 3, 6, 8);
        double expectedResult = 17.0;
        checkTestResult(expectedResult, triangle.calculatePerimeter(), "perimeterTest");
    }


    public void checkTestResult(double expectedResult, double realResult, String testName) {
        if (expectedResult == realResult) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - FALSE");
        }
    }

}


