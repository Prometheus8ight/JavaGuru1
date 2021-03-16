package students.vitaly_porsev.lesson_8.level_4.task_19;

class TriangleTest {

    public static void main(String[] args) {
        TriangleTest triangleTest = new TriangleTest();
        triangleTest.trianglePerimeterTest();
        triangleTest.triangleAreaTest();
    }

    void trianglePerimeterTest(){
        Triangle triangle = new Triangle("Triangle", 5, 7, 9);
        checkMethods(21.0, triangle.calculatePerimeter(), "trianglePerimeterTest");
    }

    void triangleAreaTest(){
        Triangle triangle = new Triangle("Triangle", 5, 7, 9);
        checkMethods(17.41228014936585, triangle.calculateArea(), "triangleAreaTest");
    }

    void checkMethods(double expectedResult, double realResult, String testName){
        if(expectedResult == realResult){
            System.out.println(testName + " - OK");
        }else{
            System.out.println(testName + " - FALSE");
        }
    }
}