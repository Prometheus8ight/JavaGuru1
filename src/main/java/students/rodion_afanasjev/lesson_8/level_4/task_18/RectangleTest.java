package students.rodion_afanasjev.lesson_8.level_4.task_18;

class RectangleTest {

    public static void main(String[] args) {

        RectangleTest rectangleTest = new RectangleTest();
        rectangleTest.areaTest();
        rectangleTest.perimeterTest();
    }

    public void areaTest(){
        Rectangle rectangle = new Rectangle("Rectangle", 4,2);
        double expectedResult = 8;
        double realResult = rectangle.calculateArea();
        equalCheck(realResult,expectedResult,"areaTest");
    }

    public void perimeterTest(){
        Rectangle rectangle = new Rectangle("Rectangle",4,2);
        double expectedResult = 12;
        double realResult = rectangle.calculatePerimeter();
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
