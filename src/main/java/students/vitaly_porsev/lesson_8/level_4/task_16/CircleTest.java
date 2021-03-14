package students.vitaly_porsev.lesson_8.level_4.task_16;

public class CircleTest {
    public static void main(String[] args) {
        CircleTest circleTest = new CircleTest();
        circleTest.testArea();
        circleTest.testPerimeter();
    }

    void testArea(){
        double expectedResult = 1256.6370614359173;
        Shape circle = new Circle("Circle", 20);
        checkMethods(expectedResult, circle.calculateArea(), "testArea");
    }

    void testPerimeter(){
        double expectedResult = 94.24777960769379;
        Shape circle = new Circle("Circle", 15);
        checkMethods(expectedResult, circle.calculatePerimeter(), "testPerimeter");
    }

    void checkMethods(double expectedResult, double realResult, String testName){
        if(expectedResult == realResult){
            System.out.println(testName + " - OK");
        }else{
            System.out.println(testName + " - FALSE");
        }
    }
}