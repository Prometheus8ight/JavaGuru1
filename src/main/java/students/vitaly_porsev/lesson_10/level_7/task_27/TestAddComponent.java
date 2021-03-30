package students.vitaly_porsev.lesson_10.level_7.task_27;

import java.util.Arrays;

class TestAddComponent {
    public static void main(String[] args) {
        TestAddComponent method = new TestAddComponent();
        method.testAddComponentTest();
    }

    void testAddComponentTest() {
        ArrayUtilImpl arrayUtil = new ArrayUtilImpl();
        arrayUtil.addComponent(new Component("Car", 10));
        arrayUtil.addComponent(new Component("Airplane", 1));
        arrayUtil.addComponent(new Component("Train", 100));
        Component[] expectedResult = {new Component("Car", 10), new Component("Airplane", 1),
                new Component("Train", 100)};
        checkAddComponent(expectedResult, arrayUtil.getObj().toArray(new Component[0]), "testAddComponent");
    }

    private void checkAddComponent(Component[] expectedResult, Component[] realResult, String testName) {
        if (Arrays.equals(expectedResult, realResult)) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - FALSE");
        }
    }
}
