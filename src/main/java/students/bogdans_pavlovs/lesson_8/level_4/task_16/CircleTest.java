package students.bogdans_pavlovs.lesson_8.level_4.task_16;

class CircleTest {

    public static void main(String[] args) {

    CircleTest test = new CircleTest();

    test.circleAreaTest();
    test.circlePerimeterTest();


    }

    public void circleAreaTest(){

        Circle a = new Circle("a", 3.56);

        double realResult = a.calculateArea();
        double expectedResult = 39.81528865453561;
        checkResult(expectedResult, realResult, "Circle Area Test");

    }

    public void circlePerimeterTest(){

        Circle a = new Circle("a", 3.56);

        double realResult = a.calculatePerimiter();
        double expectedResult = 22.36813969355933;
        checkResult(expectedResult, realResult, "Circle Perimeter Test");

    }

    public void checkResult (double expectedResult, double realResult, String testName){

        if(expectedResult == realResult){

            System.out.println(testName + " = OK!");

        } else {

            System.out.println(testName + " = FAIL!");

        }

    }


}
