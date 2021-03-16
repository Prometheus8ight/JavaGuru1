package students.vitaly_porsev.lesson_8.level_4.task_18;

public class RectangleTests {

    public static void main(String[] args) {
        RectangleTests rectangleTests = new RectangleTests();
        rectangleTests.rectanglePerimeterTest();
        rectangleTests.rectangleAreaTest();
    }


    void rectanglePerimeterTest() {
        Rectangle rectangle = new Rectangle("Rectangle", 5, 4);
        checkMethods(18, rectangle.calculatePerimeter(), "rectanglePerimeterTest");
    }

    void rectangleAreaTest() {
        Rectangle rectangle = new Rectangle("Rectangle", 5, 4);
        checkMethods(20, rectangle.calculateArea(), "rectangleAreaTest");
    }

    void checkMethods(double expectedResult, double realResult, String testName){
        if(expectedResult == realResult){
            System.out.println(testName + " - OK");
        }else{
            System.out.println(testName + " - FALSE");
        }
    }
}