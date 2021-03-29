package students.rodion_afanasjev.lesson_8.level_4.task_17;

class SquareTest {

    public static void main(String[] args) {

        SquareTest squareTest = new SquareTest();
        squareTest.areaTest();
        squareTest.perimeterTest();

    }

    public void areaTest(){
        Square square = new Square("Square",2);
        double expectedResult = 4;
        double realResult = square.calculateArea();
        equalCheck(realResult,expectedResult,"areaTest");
    }

    public void perimeterTest(){
        Square square = new Square("Circle",2);
        double expectedResult = 8;
        double realResult = square.calculatePerimeter();
        equalCheck(realResult,expectedResult,"perimeterTest");
    }

    public void equalCheck(double realResult, double expectedResult, String testName){
        if (realResult == expectedResult){
            System.out.println(testName + " : OK");
        } else {
            System.out.println(testName + " : FAIL");
        }
    }

}
