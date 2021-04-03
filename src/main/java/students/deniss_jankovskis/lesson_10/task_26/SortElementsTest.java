package students.deniss_jankovskis.lesson_10.task_26;

import java.util.Arrays;

public class SortElementsTest {

    public static void main(String[] args) {

        SortElementsTest test = new SortElementsTest();
        test.sortElementsTest1();
        test.sortElementsTest2();
    }

    public void sortElementsTest1() {
        Object object1 = new Object("Milk");
        Object object2 = new Object("Cheese");
        Object object3 = new Object("Eggs");
        Array array = new Array();
        array.add(object1);
        array.add(object2);
        array.add(object3);
        array.sort();
        Object[] realResult = array.getObjects();
        checkTestResult(realResult, new Object[]{object1, object3, object2}, "Sort Elements Test 1");
    }

    public void sortElementsTest2() {
        Object object1 = new Object("Milk");
        Object object2 = new Object("Cheese");
        Object object3 = new Object("Eggs");
        Array array = new Array();
        array.add(object1);
        array.add(object2);
        array.add(object3);
        array.sort();
        Object[] realResult = array.getObjects();
        checkTestResult(realResult, new Object[]{object2, object1, object3}, "Sort Elements Test 2");
    }

    public void checkTestResult(Object[] realResult, Object[] expectedResult, String testName) {
        if (Arrays.equals(realResult, expectedResult)) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FALSE");
        }
    }
}
