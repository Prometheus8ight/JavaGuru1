package students.vitaly_porsev.lesson_10.level_7.task_26;

import java.util.Arrays;

class TestDeleteComponent {
    public static void main(String[] args) {
        TestDeleteComponent testDeleteComponent = new TestDeleteComponent();
        testDeleteComponent.DeleteComponentTest();
    }

    void DeleteComponentTest() {
        ArrayUtilImpl arrayUtil = new ArrayUtilImpl();
        arrayUtil.addComponent(new Component("Hello", 10));
        arrayUtil.addComponent(new Component("Shy", 1));
        arrayUtil.addComponent(new Component("Beware", 5));
        arrayUtil.deleteComponentByIndex(1);
        Component[] expectedResult = {new Component("Hello", 10), new Component("Beware", 5)};
        checkDeleteComponent(expectedResult, arrayUtil.getObj(), "DeleteComponentTest");
    }

    private void checkDeleteComponent(Component[] expectedResult, Component[] realResult, String testName) {
        if (Arrays.equals(expectedResult, realResult)) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - FALSE");
        }
    }
}
