package students.vitaly_porsev.lesson_10.level_7.task_26;

import java.util.Arrays;

class TestAddComponent {
    public static void main(String[] args) {
        TestAddComponent testAddObject = new TestAddComponent();
        testAddObject.AddComponentTest();

    }

    void AddComponentTest(){
        ArrayUtilImpl arrayUtil = new ArrayUtilImpl();
        arrayUtil.addComponent(new Component("Hello", 10));
        arrayUtil.addComponent(new Component("Shy", 1));
        arrayUtil.addComponent(new Component("Beware", 5));
        Component[] expectedResult = {new Component("Hello", 10), new Component("Shy", 1),
                new Component("Beware", 5)};
        checkAddComponent(expectedResult, arrayUtil.getObj(), "AddComponentTest");
    }

   private void checkAddComponent(Component[] expectedResult, Component[] realResult, String testName) {
        if (Arrays.equals(expectedResult, realResult)) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - FALSE");
        }
    }
}
