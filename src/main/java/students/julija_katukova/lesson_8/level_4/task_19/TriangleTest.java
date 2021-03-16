package students.julija_katukova.lesson_8.level_4.task_19;

class TriangleTest {
    public static void main(String[] args) {
        TriangleTest triangleTest = new TriangleTest();
        triangleTest.areaTest1();
        triangleTest.perimeterTest1();
    }

    public void areaTest1() {
        Shape triangle = new Triangle("triangle", 3, 4, 5);
        double realResult = triangle.calculateArea();
        checkForDouble(realResult, 6, "Area Test 1");
    }

    public void perimeterTest1() {
        Shape triangle = new Triangle("triangle", 3, 4, 5);
        double realResult = triangle.calculatePerimeter();
        checkForDouble(realResult, 12, "Perimeter Test 1");
    }

    public void checkForDouble(double realResult, double expectedResult, String testName) {
        if (realResult == expectedResult) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
}
