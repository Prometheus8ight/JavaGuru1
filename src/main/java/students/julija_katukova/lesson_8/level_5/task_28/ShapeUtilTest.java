package students.julija_katukova.lesson_8.level_5.task_28;

class ShapeUtilTest {
    public static void main(String[] args) {
        ShapeUtilTest shapeUtilTest = new ShapeUtilTest();
        shapeUtilTest.areaTest1();
        shapeUtilTest.perimeterTest1();
    }

    public void areaTest1() {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape[] shape = new Shape[4];
        shape[0] = shapeUtil.createRandomCircle();
        shape[1] = shapeUtil.createRandomSquare();
        shape[2] = shapeUtil.createRandomRectangle();
        shape[3] = shapeUtil.createRandomTriangle();
        double realResult = shapeUtil.calculateArea(shape);
        System.out.println(realResult);
        checkForDouble(realResult, 0, "Area Test 1");
    }

    public void perimeterTest1() {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape[] shape = new Shape[4];
        shape[0] = shapeUtil.createRandomCircle();
        shape[1] = shapeUtil.createRandomSquare();
        shape[2] = shapeUtil.createRandomRectangle();
        shape[3] = shapeUtil.createRandomTriangle();
        double realResult = shapeUtil.calculatePerimeter(shape);
        System.out.println(realResult);
        checkForDouble(realResult, 0, "Area Test 1");
    }

    public void checkForDouble(double realResult, double expectedResult, String testName) {
        if (realResult != expectedResult) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
}
