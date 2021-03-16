package students.julija_katukova.lesson_8.level_4.task_17;

class SquareTest {
    public static void main(String[] args) {
        SquareTest squareTest = new SquareTest();
        squareTest.areaTest1();
        squareTest.perimeterTest1();
    }

    public void areaTest1() {
        Shape square = new Square("square",5);
        double realResult = square.calculateArea();
        checkForDouble(realResult, 25, "Area Test 1");
    }

    public void perimeterTest1() {
        Shape square = new Square("square", 5);
        double realResult = square.calculatePerimeter();
        checkForDouble(realResult, 20, "Perimeter Test 1");
    }

    public void checkForDouble(double realResult, double expectedResult, String testName) {
        if (realResult == expectedResult) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
}
