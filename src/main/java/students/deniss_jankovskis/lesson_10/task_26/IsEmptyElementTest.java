package students.deniss_jankovskis.lesson_10.task_26;

class IsEmptyElementTest {

    public static void main(String[] args) {

        IsEmptyElementTest test = new IsEmptyElementTest();
        test.isEmptyElementTest1();
        test.isEmptyElementTest2();
    }

    public void isEmptyElementTest1() {
        Object object1 = new Object("Milk");
        Object object2 = new Object("Cheese");
        Object object3 = new Object("Eggs");
        Array array = new Array();
        array.add(object1);
        boolean realResult = array.isEmpty(object1);
        checkTestResult(realResult, true, "Is Empty Element Test 1");
    }

    public void isEmptyElementTest2() {
        Object object1 = new Object("Milk");
        Object object2 = new Object("Cheese");
        Object object3 = new Object("Eggs");
        Array array = new Array();
        array.add(object1);
        array.add(object3);
        boolean realResult = array.isEmpty(object2);
        checkTestResult(realResult, false, "Is Empty Element Test 2");
    }

    public void checkTestResult(boolean realResult, boolean expectedResult, String testName) {
        if (realResult == expectedResult) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FALSE");
        }
    }
}
