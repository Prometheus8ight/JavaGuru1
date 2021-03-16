package students.vitaly_porsev.lesson_8.level_4.task_17;

public class SquareTests {

    public static void main(String[] args) {
        SquareTests squareTests = new SquareTests();
        squareTests.checkSquareArea();
        squareTests.checkSquarePerimeter();
    }

    void checkSquareArea(){
        double expectedResult = 25.0;
        Square square = new Square("Square", 5);
        checkMethods(expectedResult, square.calculateArea(), "checkSquareArea");
    }


    void checkSquarePerimeter(){
        double expectedResult = 20.0;
        Square square = new Square("Square", 5);
        checkMethods(expectedResult, square.calculatePerimeter(), "checkSquarePerimeter");
    }

    void checkMethods(double expectedResult, double realResult, String testName){
        if(expectedResult == realResult){
            System.out.println(testName + " - OK");
        }else{
            System.out.println(testName + " - FALSE");
        }
    }
}