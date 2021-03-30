package students.vitaly_porsev.lesson_10.level_7.task_26;

import java.util.Arrays;

class TestSortComponentsByNumber {
    public static void main(String[] args) {
        TestSortComponentsByNumber testSortComponentsByNumber = new TestSortComponentsByNumber();
        testSortComponentsByNumber.sortComponentTest();
    }

    void sortComponentTest() {
        ArrayUtilImpl arrayUtil = new ArrayUtilImpl();
        arrayUtil.addComponent(new Component("Hello", 10));
        arrayUtil.addComponent(new Component("Shy", 1));
        arrayUtil.addComponent(new Component("Beware", 5));
        arrayUtil.sortComponentsByNumber();
        Component[] expectedResult = {new Component("Shy", 1), new Component("Beware", 5),
                new Component("Hello", 10)};
        checkSortComponent(expectedResult, arrayUtil.getObj(), "SortComponentTest");
    }

    private void checkSortComponent(Component[] expectedResult, Component[] realResult, String testName) {
        if (Arrays.equals(expectedResult, realResult)) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - FALSE");
        }
    }
}
