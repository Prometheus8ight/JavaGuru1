package students.vitaly_porsev.lesson_10.level_7.task_27;

public class TestFindObjectInArray {
    public static void main(String[] args) {
        TestFindObjectInArray method = new TestFindObjectInArray();
        method.FindObjectInArrayTestTrue();
        method.FindObjectInArrayTestFalse();
    }

    void FindObjectInArrayTestTrue() {
        ArrayUtilImpl arrayUtil = new ArrayUtilImpl();
        arrayUtil.addComponent(new Component("Car", 10));
        arrayUtil.addComponent(new Component("Airplane", 1));
        arrayUtil.addComponent(new Component("Train", 100));
        checkFindObjectTrue(true, arrayUtil.findObjectInArray(new Component("Train", 100)),
                "FindObjectInArrayTestTrue");
    }

    void FindObjectInArrayTestFalse() {
        ArrayUtilImpl arrayUtil = new ArrayUtilImpl();
        arrayUtil.addComponent(new Component("Car", 10));
        arrayUtil.addComponent(new Component("Airplane", 1));
        arrayUtil.addComponent(new Component("Train", 100));
        checkFindObjectFalse(false, arrayUtil.findObjectInArray(new Component("Airship", 1000)),
                "FindObjectInArrayTestFalse");
    }

    private void checkFindObjectTrue(boolean expectedResult, boolean realResult, String testName) {
        if (expectedResult == realResult) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - FALSE");
        }
    }

    private void checkFindObjectFalse(boolean expectedResult, boolean realResult, String testName) {
        if (!expectedResult == !realResult) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - FALSE");
        }
    }
}

