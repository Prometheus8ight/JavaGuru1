package students.julija_katukova.lesson_10.level_7.task_27;

class ContainsTest {
    public static void main(String[] args) {
        ContainsTest containsTest = new ContainsTest();
        containsTest.test1();
        containsTest.test2();
        containsTest.test3();
    }

    private void test1() {
        Object object1 = new Object("Apple");
        MyListImplUsingLinkedList myListImplUsingLinkedList = new MyListImplUsingLinkedList();
        myListImplUsingLinkedList.addNewElement(object1);
        boolean realResult = myListImplUsingLinkedList.contains(object1);
        check(realResult, true, "Test1");
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
        boolean realResult = myListImplUsingLinkedList.contains(object4);
        check(realResult, true, "Test2");
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
        myListImplUsingLinkedList.addNewElement(object4);
        myListImplUsingLinkedList.addNewElement(object5);
        boolean realResult = myListImplUsingLinkedList.contains(object3);
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
