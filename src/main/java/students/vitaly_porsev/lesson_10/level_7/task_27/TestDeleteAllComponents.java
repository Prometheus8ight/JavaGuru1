package students.vitaly_porsev.lesson_10.level_7.task_27;

import java.util.Arrays;

public class TestDeleteAllComponents {
    public static void main(String[] args) {
        TestDeleteAllComponents method = new TestDeleteAllComponents();
        method.deleteAllComponentsTest();
    }

    void deleteAllComponentsTest() {
        ArrayUtilImpl arrayUtil = new ArrayUtilImpl();
        arrayUtil.addComponent(new Component("Car", 10));
        arrayUtil.addComponent(new Component("Airplane", 1));
        arrayUtil.addComponent(new Component("Train", 100));
        Component[] expectedResult = {};
        arrayUtil.deleteAllComponents();
        checkDeleteAllComponents(expectedResult, arrayUtil.getObj().toArray(new Component[0]), "deleteAllComponentsTest");

    }

    private void checkDeleteAllComponents(Component[] expectedResult, Component[] realResult, String testName) {
        if (Arrays.equals(expectedResult, realResult)) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - FALSE");
        }
    }
}
