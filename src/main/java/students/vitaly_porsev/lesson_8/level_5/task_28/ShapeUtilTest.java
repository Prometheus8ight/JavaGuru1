package students.vitaly_porsev.lesson_8.level_5.task_28;

public class ShapeUtilTest {

    public static void main(String[] args) {
        ShapeUtilTest shapeUtilTest = new ShapeUtilTest();
        shapeUtilTest.testFigures();
    }

    void testFigures(){
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape[] shape = {shapeUtil.createRandomShape(), shapeUtil.createRandomShape(),
                shapeUtil.createRandomShape(),shapeUtil.createRandomShape()};
        checkResult(shape, "testFigures");
    }

    boolean nullOrNot(Shape[] shapes){
        for(Shape shape : shapes){
            if(shape == null){
                return false;
            }
        }return true;
    }

    void checkResult(Shape[] shapes, String testName){
        if(nullOrNot(shapes)){
            System.out.println(testName + " - OK");
        }else {
            System.out.println(testName + " - FALSE");
        }
    }
}