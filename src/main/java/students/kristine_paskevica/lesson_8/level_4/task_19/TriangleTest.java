package students.kristine_paskevica.lesson_8.level_4.task_19;

class TriangleTest {
    public static void main(String[] args) {

        TriangleTest test = new TriangleTest();
        test.areaTest();
        test.perimeterTest();

    }

    public void areaTest() {

        Shape triangle = new Triangle("Triangle", 2, 2, 2);
        double realResult = triangle.calculateArea();
        checkTestResult(realResult, 6, "Laukuma tests");
    }

    public void perimeterTest() {

        Shape triangle = new Triangle("Triangle", 2, 2, 2);
        double realResult = triangle.calculatePerimeter();
        checkTestResult(realResult, 6, "Perimetra tests");
    }

    private void checkTestResult(double realResult, double expectedResult, String testName) {

        if (realResult == expectedResult) {
            System.out.println(testName + ": tests ir OK");
        } else {
            System.out.println(testName + ": tests nav OK");
        }
    }

}
