package students.alex_kalashnikov.lesson_8.level_5.task_28;

class ShapeUtilTest {

    public static void main(String[] args) {

        ShapeUtilTest newObject = new ShapeUtilTest();
        newObject.testCalculateArea();
        newObject.testCalculatePerimeter();

    }

    void test(double expectedResult, double realResult) {
        if (expectedResult == realResult) {
            System.out.println("Test is OK!");
        } else {
            System.out.println("Test is FAILED!");
        }
    }

    void testCalculateArea() {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape[] shapes = new Shape[4];
        shapes[0] = shapeUtil.createRandomCircle();
        shapes[1] = shapeUtil.createRandomSquare();
        shapes[2] = shapeUtil.createRandomRectangle();
        shapes[3] = shapeUtil.createRandomTriangle();
        double expectedResult = shapeUtil.calculateArea(shapes[0]) + shapeUtil.calculateArea(shapes[1])
                + shapeUtil.calculateArea(shapes[2]) + shapeUtil.calculateArea(shapes[3]);
        double realResult = shapeUtil.calculateArea(shapes);
        test(expectedResult, realResult);
    }

    void testCalculatePerimeter() {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape[] shapes = new Shape[4];
        shapes[0] = shapeUtil.createRandomCircle();
        shapes[1] = shapeUtil.createRandomSquare();
        shapes[2] = shapeUtil.createRandomRectangle();
        shapes[3] = shapeUtil.createRandomTriangle();
        double expectedResult = shapeUtil.calculatePerimeter(shapes[0]) + shapeUtil.calculatePerimeter(shapes[1])
                + shapeUtil.calculatePerimeter(shapes[2]) + shapeUtil.calculatePerimeter(shapes[3]);
        double realResult = shapeUtil.calculatePerimeter(shapes);
        test(expectedResult, realResult);
    }

}