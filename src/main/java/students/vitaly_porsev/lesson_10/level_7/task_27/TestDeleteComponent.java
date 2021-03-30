package students.vitaly_porsev.lesson_10.level_7.task_27;

import java.util.Arrays;

class TestDeleteComponent {
    public static void main(String[] args) {
        TestDeleteComponent method = new TestDeleteComponent();
        method.checkDeleteComponentTest();
    }

    void checkDeleteComponentTest() {
        ArrayUtilImpl arrayUtil = new ArrayUtilImpl();
        arrayUtil.addComponent(new Component("Car", 10));
        arrayUtil.addComponent(new Component("Airplane", 1));
        arrayUtil.addComponent(new Component("Train", 100));
        arrayUtil.deleteComponentByIndex(1);
        Component[] expectedResult = {new Component("Car", 10), new Component("Train", 100)};
        checkDeleteComponent(expectedResult, arrayUtil.getObj().toArray(new Component[0]), "checkDeleteComponent");
    }

    private void checkDeleteComponent(Component[] expectedResult, Component[] realResult, String testName) {
        if (Arrays.equals(expectedResult, realResult)) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - FALSE");
        }
    }
}
