package students.julija_katukova.lesson_10.level_7.task_27;

import java.util.LinkedList;

class ClearElementsTest {
    public static void main(String[] args) {
        ClearElementsTest clearElementsTest = new ClearElementsTest();
        clearElementsTest.test1();
        clearElementsTest.test2();
        clearElementsTest.test3();
    }

    private void test1() {
        Object object1 = new Object("Apple");
        MyListImplUsingLinkedList myListImplUsingLinkedList = new MyListImplUsingLinkedList();
        myListImplUsingLinkedList.addNewElement(object1);
        myListImplUsingLinkedList.clear();
        LinkedList<Object> realResult = myListImplUsingLinkedList.getObjects();
        LinkedList<Object> expectedResult = new LinkedList<>();
        check(realResult, expectedResult, "Test1");
    }

    private void test2() {
        Object object1 = new Object("Apple");
        Object object2 = new Object("Watermelon");
        Object object3 = new Object("Pineapple");
        MyListImplUsingLinkedList myListImplUsingLinkedList = new MyListImplUsingLinkedList();
        myListImplUsingLinkedList.addNewElement(object1);
        myListImplUsingLinkedList.addNewElement(object2);
        myListImplUsingLinkedList.addNewElement(object3);
        myListImplUsingLinkedList.clear();
        LinkedList<Object> realResult = myListImplUsingLinkedList.getObjects();
        LinkedList<Object> expectedResult = new LinkedList<>();
        check(realResult, expectedResult, "Test2");
    }

    private void test3() {
        Object object1 = new Object("Apple");
        Object object2 = new Object("Watermelon");
        Object object3 = new Object("Orange");
        Object object4 = new Object("Pear");
        Object object5 = new Object("Cherry");
        MyListImplUsingLinkedList myListImplUsingLinkedList = new MyListImplUsingLinkedList();
        myListImplUsingLinkedList.addNewElement(object1);
        myListImplUsingLinkedList.addNewElement(object2);
        myListImplUsingLinkedList.addNewElement(object3);
        myListImplUsingLinkedList.addNewElement(object4);
        myListImplUsingLinkedList.addNewElement(object5);
        myListImplUsingLinkedList.clear();
        LinkedList<Object> realResult = myListImplUsingLinkedList.getObjects();
        LinkedList<Object> expectedResult = new LinkedList<>();
        check(realResult, expectedResult, "Test3");
    }

    private void check(LinkedList<Object> realResult, LinkedList<Object> expectedResult, String testName) {
        if (realResult.equals(expectedResult)) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
}
