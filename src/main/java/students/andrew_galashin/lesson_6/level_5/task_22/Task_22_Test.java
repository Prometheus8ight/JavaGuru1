package students.andrew_galashin.lesson_6.level_5.task_22;

class Task_22_Test {
    public static void main(String[] args) {
        Task_22_Test start = new Task_22_Test();
        start.trueTest();
        start.falseTest();
    }

    void trueTest() {
        Task_22_Test start = new Task_22_Test();
        start.xLine1();
        start.xLine2();
        start.xLine3();
        start.yLine1();
        start.yLine2();
        start.yLine3();
    }

    void falseTest() {
        Task_22_Test start = new Task_22_Test();
        start.falseTest1();
        start.falseTest2();
    }

    void xLine1() {
        Task_22 start = new Task_22();
        int[][] arr = {{0, 0, 0}, {-1, -1, -1}, {-1, -1, -1}};
        checkR(start.horizontal(arr, 0), "xLine1 Test: ");
    }

    void xLine2() {
        Task_22 start = new Task_22();
        int[][] arr = {{-1, -1, -1}, {0, 0, 0}, {-1, -1, -1}};
        checkR(start.horizontal(arr, 0), "xLine2 Test: ");
    }

    void xLine3() {
        Task_22 start = new Task_22();
        int[][] arr = {{-1, -1, -1}, {-1, -1, -1}, {0, 0, 0}};
        checkR(start.horizontal(arr, 0), "xLine3 Test: ");
    }

    void yLine1() {
        Task_22 start = new Task_22();
        int[][] arr = {{1, 1, 1}, {-1, -1, -1}, {-1, -1, -1}};
        checkR(start.horizontal(arr, 1), "yLine1 Test: ");
    }

    void yLine2() {
        Task_22 start = new Task_22();
        int[][] arr = {{-1, -1, -1}, {1, 1, 1}, {-1, -1, -1}};
        checkR(start.horizontal(arr, 1), "yLine2 Test: ");
    }

    void yLine3() {
        Task_22 start = new Task_22();
        int[][] arr = {{-1, -1, -1}, {-1, -1, -1}, {1, 1, 1}};
        checkR(start.horizontal(arr, 1), "yLine3 Test: ");
    }

    void falseTest1() {
        Task_22 start = new Task_22();
        int[][] arr = {{0, 0, -1}, {-1, 0, -1}, {0, 0, -1}};
        checkF(start.horizontal(arr, 0), "false Test: ");
    }

    void falseTest2() {
        Task_22 start = new Task_22();
        int[][] arr = {{-1, 1, 0}, {0, -1, -1}, {1, 0, 1}};
        checkF(start.horizontal(arr, 1), "false Test: ");
    }

    void checkR(boolean isTrue, String testName) {
        if (isTrue) {
            System.out.println(testName + "Complete");
        } else {
            System.out.println(testName + "Fail");
        }
    }

    void checkF(boolean isTrue, String testName) {
        if (!isTrue) {
            System.out.println(testName + "Complete");
        } else {
            System.out.println(testName + "Fail");
        }
    }
}
