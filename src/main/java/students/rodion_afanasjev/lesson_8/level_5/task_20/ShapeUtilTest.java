package students.rodion_afanasjev.lesson_8.level_5.task_20;

class ShapeUtilTest {

    public static void main(String[] args) {

        ShapeUtilTest shapeUtilTest = new ShapeUtilTest();
        shapeUtilTest.calculateAreaArrayTest();
        shapeUtilTest.calculatePerimeterArrayTest();

    }

    public void calculateAreaArrayTest(){
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape[] shape = new Shape[4];
        shape[0] = shapeUtil.createRandomCircle();
        shape[1] = shapeUtil.createRandomSquare();
        shape[2] = shapeUtil.createRandomRectangle();
        shape[3] = shapeUtil.createRandomTriangle();
        double realResult = shapeUtil.calculateArea(shape);
        equalCheck(realResult,"calculateAreaArrayTest");
    }

    public void calculatePerimeterArrayTest(){
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape[] shape = new Shape[4];
        shape[0] = shapeUtil.createRandomCircle();
        shape[1] = shapeUtil.createRandomSquare();
        shape[2] = shapeUtil.createRandomRectangle();
        shape[3] = shapeUtil.createRandomTriangle();
        double realResult = shapeUtil.calculatePerimeter(shape);
        equalCheck(realResult,"calculatePerimeterArrayTest");
    }

    public void equalCheck(double realResult, String testName){
        if (realResult != 0){
            System.out.println(testName + " : OK");
        } else {
            System.out.println(testName + " : FAIL");
        }
    }

}
