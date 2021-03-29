package students.bogdans_pavlovs.lesson_8.level_4.task_18;

public class RectangleTest {

    public static void main(String[] args) {

        RectangleTest test = new RectangleTest();

        test.rectangleAreaTest();
        test.rectanglePerimeterTest();


    }

    public void rectangleAreaTest(){

        Rectangle a = new Rectangle("a", 7.5, 4);

        double realResult = a.calculateArea();
        double expectedResult = 30;
        checkResult(expectedResult, realResult, "Rectangle Area Test");

    }

    public void rectanglePerimeterTest(){

        Rectangle a = new Rectangle("a", 7.5, 4);

        double realResult = a.calculatePerimiter();
        double expectedResult = 23;
        checkResult(expectedResult, realResult, "Rectangle Perimeter Test");

    }

    public void checkResult (double expectedResult, double realResult, String testName){

        if(expectedResult == realResult){

            System.out.println(testName + " = OK!");

        } else {

            System.out.println(testName + " = FAIL!");

        }

    }


}

