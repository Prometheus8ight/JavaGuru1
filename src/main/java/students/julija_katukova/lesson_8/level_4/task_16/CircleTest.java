package students.julija_katukova.lesson_8.level_4.task_16;

class CircleTest {
    public static void main(String[] args) {
        CircleTest circleTest = new CircleTest();
        circleTest.areaTest1();
        circleTest.perimeterTest1();
    }

    public void areaTest1() {
        Shape circle = new Circle("circle",2.5);
        double realResult = circle.calculateArea();
        checkForDouble(realResult, 19.634954084936208, "Area Test 1");
    }

    public void perimeterTest1() {
        Shape circle = new Circle("circle", 2.5);
        double realResult = circle.calculatePerimeter();
        checkForDouble(realResult, 15.707963267948966, "Perimeter Test 1");
    }

    public void checkForDouble(double realResult, double expectedResult, String testName) {
        if (realResult == expectedResult) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }


}
