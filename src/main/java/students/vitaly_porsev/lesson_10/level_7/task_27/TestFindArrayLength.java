package students.vitaly_porsev.lesson_10.level_7.task_27;

public class TestFindArrayLength {
    public static void main(String[] args) {
        TestFindArrayLength method = new TestFindArrayLength();
        method.findArrayLengthTest();
    }

    void findArrayLengthTest() {
        ArrayUtilImpl arrayUtil = new ArrayUtilImpl();
        arrayUtil.addComponent(new Component("Car", 10));
        arrayUtil.addComponent(new Component("Airplane", 1));
        arrayUtil.addComponent(new Component("Train", 100));
        checkArrayLength(3, arrayUtil.findArrayLength(), "findArrayLengthTest");
    }

    private void checkArrayLength(int expectedResult, int realResult, String testName) {
        if (expectedResult == realResult) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - FALSE");
        }
    }
}
