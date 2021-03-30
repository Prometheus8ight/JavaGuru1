package students.julija_katukova.lesson_10.level_7.task_27;

import java.util.LinkedList;

class SortElementsTest {
    public static void main(String[] args) {
        SortElementsTest sortElementsTest = new SortElementsTest();
        sortElementsTest.test1();
        sortElementsTest.test2();
        sortElementsTest.test3();
    }

    private void test1() {
        Object object1 = new Object("Pear");
        Object object2 = new Object("Apple");
        MyListImplUsingLinkedList myListImplUsingLinkedList = new MyListImplUsingLinkedList();
        myListImplUsingLinkedList.addNewElement(object1);
        myListImplUsingLinkedList.addNewElement(object2);
        myListImplUsingLinkedList.sortElements();
        LinkedList<Object> realResult = myListImplUsingLinkedList.getObjects();
        LinkedList<Object> expectedResult = new LinkedList<>();
        expectedResult.add(object2);
        expectedResult.add(object1);
        check(realResult, expectedResult, "Test1");
    }

    private void test2() {
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
        myListImplUsingLinkedList.sortElements();
        LinkedList<Object> realResult = myListImplUsingLinkedList.getObjects();
        LinkedList<Object> expectedResult = new LinkedList<>();
        expectedResult.add(object1);
        expectedResult.add(object5);
        expectedResult.add(object3);
        expectedResult.add(object4);
        expectedResult.add(object2);
        check(realResult, expectedResult, "Test2");
    }

    private void test3() {
        Object object1 = new Object("Plum");
        Object object2 = new Object("Peach");
        Object object3 = new Object("Pineapple");
        Object object4 = new Object("Pear");
        Object object5 = new Object("Papaya");
        MyListImplUsingLinkedList myListImplUsingLinkedList = new MyListImplUsingLinkedList();
        myListImplUsingLinkedList.addNewElement(object1);
        myListImplUsingLinkedList.addNewElement(object2);
        myListImplUsingLinkedList.addNewElement(object3);
        myListImplUsingLinkedList.addNewElement(object4);
        myListImplUsingLinkedList.addNewElement(object5);
        myListImplUsingLinkedList.sortElements();
        LinkedList<Object> realResult = myListImplUsingLinkedList.getObjects();
        LinkedList<Object> expectedResult = new LinkedList<>();
        expectedResult.add(object5);
        expectedResult.add(object2);
        expectedResult.add(object4);
        expectedResult.add(object3);
        expectedResult.add(object1);
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
