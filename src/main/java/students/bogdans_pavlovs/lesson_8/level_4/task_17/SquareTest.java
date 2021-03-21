package students.bogdans_pavlovs.lesson_8.level_4.task_17;

class SquareTest {

    public static void main(String[] args) {

        SquareTest test = new SquareTest();

        test.squareAreaTest();
        test.squarePerimeterTest();


    }

    public void squareAreaTest(){

        Square a = new Square("a", 7.5);

        double realResult = a.calculateArea();
        double expectedResult = 56.25;
        checkResult(expectedResult, realResult, "Square Area Test");

    }

    public void squarePerimeterTest(){

        Square a = new Square("a", 7.5);

        double realResult = a.calculatePerimiter();
        double expectedResult = 30;
        checkResult(expectedResult, realResult, "Square Perimeter Test");

    }

    public void checkResult (double expectedResult, double realResult, String testName){

        if(expectedResult == realResult){

            System.out.println(testName + " = OK!");

        } else {

            System.out.println(testName + " = FAIL!");

        }

    }


}

