package students.bogdans_pavlovs.lesson_8.level_4.task_19;

public class TriangleTest {

    public static void main(String[] args) {

        TriangleTest test = new TriangleTest();

        test.triangleAreaTest();
        test.trianglePerimeterTest();


    }

    public void triangleAreaTest(){

        Triangle a = new Triangle("a", 7.5, 4, 8, 5);

        double realResult = a.calculateArea();
        double expectedResult = 20;
        checkResult(expectedResult, realResult, "Triangle Area Test");

    }

    public void trianglePerimeterTest(){

        Triangle a = new Triangle("a", 7.5, 4, 8, 5);

        double realResult = a.calculatePerimiter();
        double expectedResult = 19.5;
        checkResult(expectedResult, realResult, "Triangle Perimeter Test");

    }

    public void checkResult (double expectedResult, double realResult, String testName){

        if(expectedResult == realResult){

            System.out.println(testName + " = OK!");

        } else {

            System.out.println(testName + " = FAIL!");

        }

    }


}

