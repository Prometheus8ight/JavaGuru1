package students.bogdans_pavlovs.lesson_8.level_5;

class ShapeUtilTest {

    public static void main(String[] args) {

        ShapeUtilTest test = new ShapeUtilTest();

        test.totalAreaTest();
        test.totalPerimeterTest();

    }

    void totalAreaTest(){

        ShapeUtil shapeUtil = new ShapeUtil();
        Shape[] shapes = new Shape[4];
        shapes[0] = shapeUtil.createRandomCircle();
        shapes[1] = shapeUtil.createRandomSquare();
        shapes[2] = shapeUtil.createRandomRectangle();
        shapes[3] = shapeUtil.createRandomTriangle();

        double realResult = shapeUtil.calculateTotalArea(shapes);
        double expectedResult = 0; //Результат всегда разный, не уверен как тестить. Как плейсхолдер пока оставлю != 0
        resultCheck(realResult, expectedResult, "Weird Test 1");


    }

    void totalPerimeterTest(){

        ShapeUtil shapeUtil = new ShapeUtil();
        Shape[] shapes = new Shape[4];
        shapes[0] = shapeUtil.createRandomCircle();
        shapes[1] = shapeUtil.createRandomSquare();
        shapes[2] = shapeUtil.createRandomRectangle();
        shapes[3] = shapeUtil.createRandomTriangle();

        double realResult = shapeUtil.calculateTotalPerimeter(shapes);
        double expectedResult = 0; //Результат всегда разный, не уверен как тестить. Как плейсхолдер пока оставлю != 0
        resultCheck(realResult, expectedResult, "Weird Test 2");

    }

    void resultCheck(double realResult, double expectedResult, String testName){

        if (realResult == expectedResult){
            System.out.println(testName + " = FAIL!");
        } else {
            System.out.println(testName + " = NOT FAIL?");
        }




    }

}
