package students.vitaly_porsev.lesson_10.level_7.task_26;

public class TestCheckIsArrayEmpty {
    public static void main(String[] args) {
        TestCheckIsArrayEmpty testCheckIsArrayEmpty = new TestCheckIsArrayEmpty();
        testCheckIsArrayEmpty.isArrayEmptyTest();
    }


    void isArrayEmptyTest() {
        ArrayUtilImpl arrayUtil = new ArrayUtilImpl();
        arrayUtil.addComponent(new Component("Hello", 10));
        arrayUtil.addComponent(new Component("Shy", 1));
        arrayUtil.addComponent(new Component("Beware", 5));
        arrayUtil.deleteAllComponents();
        checkIsArrayEmpty(true, arrayUtil.checkIsArrayEmpty(), "isArrayEmptyTest");
    }

    private void checkIsArrayEmpty(boolean expectedResult, boolean realResult, String testName) {
        if (expectedResult == realResult) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - FALSE");
        }
    }
}
