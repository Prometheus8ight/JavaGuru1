package students.deniss_jankovskis.lesson_8.level_5.task_28;

class ShapeUtilTest {

    public static void main(String[] args) {

        ShapeUtilTest test = new ShapeUtilTest();
        test.areaTest();
        test.perimeterTest();
    }

    public void areaTest() {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape[] shape = new Shape[4];
        shape[0] = shapeUtil.createRandomCircle();
        shape[1] = shapeUtil.createRandomSquare();
        shape[2] = shapeUtil.createRandomRectangle();
        shape[3] = shapeUtil.createRandomTriangle();
        double realResult = shapeUtil.calculateArea(shape);
        checkTestResult(realResult, 0, "Area Test");
    }

    public void perimeterTest() {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape[] shape = new Shape[4];
        shape[0] = shapeUtil.createRandomCircle();
        shape[1] = shapeUtil.createRandomSquare();
        shape[2] = shapeUtil.createRandomRectangle();
        shape[3] = shapeUtil.createRandomTriangle();
        double realResult = shapeUtil.calculatePerimeter(shape);
        checkTestResult(realResult, 0, "Perimeter Test");
    }

    public void checkTestResult(double realResult, double expectedResult, String testName) {
        if (realResult != expectedResult) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }

}

