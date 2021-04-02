package students.deniss_jankovskis.lesson_10.task_26;

import java.util.Arrays;

class AddElementTest {

    public static void main(String[] args) {

        AddElementTest test = new AddElementTest();
        test.addElementTest1();
        test.addElementTest2();
    }

    public void addElementTest1() {
        Object object1 = new Object("Milk");
        Object object2 = new Object("Cheese");
        Object object3 = new Object("Eggs");
        Array array = new Array();
        array.add(object3);
        Object[] realResult = array.getObjects();
        checkTestResult(realResult, new Object[]{object3}, "Add Element Test 1");
    }

    public void addElementTest2() {
        Object object1 = new Object("Milk");
        Object object2 = new Object("Cheese");
        Object object3 = new Object("Eggs");
        Array array = new Array();
        array.add(object1);
        array.add(object2);
        array.add(object3);
        Object[] realResult = array.getObjects();
        checkTestResult(realResult, new Object[]{object1, object2, object3}, "Add Element Test 2");
    }

    public void checkTestResult(Object[] realResult, Object[] expectedResult, String testName) {
        if (Arrays.equals(realResult, expectedResult)) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FALSE");
        }
    }
}
