package students.julija_katukova.lesson_10.level_7.task_26;

import java.util.Arrays;

class ContainsTest {
    public static void main(String[] args) {
        ContainsTest containsTest = new ContainsTest();
        containsTest.test1();
        containsTest.test2();
        containsTest.test3();
    }

    private void test1() {
        Object object1 = new Object("Watermelon");
        Object object2 = new Object("Apple");
        Array array = new Array();
        array.addNewElement(object1);
        array.addNewElement(object2);
        boolean realResult = array.contains(object1);
        check(realResult, true, "Test1");
    }

    private void test2() {
        Object object1 = new Object("Apple");
        Object object2 = new Object("Orange");
        Object object3 = new Object("Pear");
        Array array = new Array();
        array.addNewElement(object1);
        array.addNewElement(object2);
        array.addNewElement(object3);
        boolean realResult = array.contains(object2);
        check(realResult, true, "Test2");
    }

    private void test3() {
        Object object1 = new Object("Plum");
        Object object2 = new Object("Peach");
        Object object3 = new Object("Pineapple");
        Array array = new Array();
        array.addNewElement(object1);
        array.addNewElement(object2);
        boolean realResult = array.contains(object3);
        check(realResult, false, "Test3");
    }

    private void check(boolean realResult, boolean expectedResult, String testName) {
        if (realResult == expectedResult) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
}
