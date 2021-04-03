package students.deniss_jankovskis.lesson_10.task_26;

import java.util.Arrays;

class DeleteElementTest {

    public static void main(String[] args) {

        DeleteElementTest test = new DeleteElementTest();
        test.deleteElementTest1();
        test.deleteElementTest2();
    }

    public void deleteElementTest1() {
        Object object1 = new Object("Milk");
        Object object2 = new Object("Cheese");
        Object object3 = new Object("Eggs");
        Array array = new Array();
        array.add(object1);
        array.delete(object1);
        Object[] realResult = array.getObjects();
        checkTestResult(realResult, new Object[]{}, "Delete Element Test 1");
    }

    public void deleteElementTest2() {
        Object object1 = new Object("Milk");
        Object object2 = new Object("Cheese");
        Object object3 = new Object("Eggs");
        Array array = new Array();
        array.add(object1);
        array.add(object2);
        array.add(object3);
        array.delete(object1);
        array.delete(object2);
        array.delete(object3);
        Object[] realResult = array.getObjects();
        checkTestResult(realResult, new Object[]{}, "Delete Element Test 2");
    }

    public void checkTestResult(Object[] realResult, Object[] expectedResult, String testName) {
        if (Arrays.equals(realResult, expectedResult)) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FALSE");
        }
    }
}
