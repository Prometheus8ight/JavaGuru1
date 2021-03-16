package students.rodion_afanasjev.lesson_8.level_4.task_19;

public class TriangleTest {

    public static void main(String[] args) {

        TriangleTest triangleTest = new TriangleTest();
        triangleTest.areaTest();
        triangleTest.perimeterTest();

    }

    public void areaTest(){
        Triangle triangle = new Triangle("Triangle",2);
        double expectedResult = 1.7320508075688772935274463415059;
        double realResult = triangle.calculateArea();
        equalCheck(realResult,expectedResult,"areaTest");
    }

    public void perimeterTest(){
        Triangle triangle = new Triangle("Triangle",2);
        double expectedResult = 6;
        double realResult = triangle.calculatePerimeter();
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
