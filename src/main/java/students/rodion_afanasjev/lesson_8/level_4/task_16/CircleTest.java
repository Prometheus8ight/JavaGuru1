package students.rodion_afanasjev.lesson_8.level_4.task_16;

class CircleTest {

    public static void main(String[] args) {

        CircleTest circleTest = new CircleTest();
        circleTest.areaTest();
        circleTest.perimeterTest();

    }

    public void areaTest(){
        Circle circle = new Circle("Circle",1.5);
        double expectedResult = 7.0685834705770345;
        double realResult = circle.calculateArea();
        equalCheck(realResult,expectedResult,"areaTest");
    }

    public void perimeterTest(){
        Circle circle = new Circle("Circle",1.5);
        double expectedResult = 9.42477796076938;
        double realResult = circle.calculatePerimeter();
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
