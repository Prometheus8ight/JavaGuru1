package students.vitaly_porsev.lesson_10.level_7.task_26;

import java.util.Arrays;

public class TestDeleteAllComponents {
    public static void main(String[] args) {
        TestDeleteAllComponents testDeleteAllComponents = new TestDeleteAllComponents();
        testDeleteAllComponents.DeleteAllComponentsTest();
    }

    void DeleteAllComponentsTest() {
        ArrayUtilImpl arrayUtil = new ArrayUtilImpl();
        arrayUtil.addComponent(new Component("Hello", 10));
        arrayUtil.addComponent(new Component("Shy", 1));
        arrayUtil.addComponent(new Component("Beware", 5));
        arrayUtil.deleteAllComponents();
        Component[] expectedResult = {};
        checkDeleteAllComponent(expectedResult, arrayUtil.getObj(), "DeleteAllComponentsTest");
    }

    private void checkDeleteAllComponent(Component[] expectedResult, Component[] realResult, String testName) {
        if (Arrays.equals(expectedResult, realResult)) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - FALSE");
        }
    }
}
