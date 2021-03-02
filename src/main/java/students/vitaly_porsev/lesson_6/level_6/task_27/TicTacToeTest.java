package students.vitaly_porsev.lesson_6.level_6.task_27;

class TicTacToeTest {

    public static void main(String[] args) {
        TicTacToeTest method = new TicTacToeTest();
        method.checkFieldTest();
        method.checkFalseFieldTest();
    }

    void checkFieldTest() {
        TicTacToe method = new TicTacToe();
        int[][] field = method.createField();
        checkResult(testField(field), "checkFieldTest");
    }

    void checkFalseFieldTest() {
        int[][] field = {{-1, -1, -1}, {0, -1, -1}, {-1, -1 - 1}};
        checkFalseResult(testField(field), "checkFalseFieldTest");
    }

    boolean testField(int[][] field) {
        for (int[] ints : field) {
            for (int anInt : ints) {
                if (anInt != -1) {
                    return false;
                }
            }
        }
        return true;
    }


    void checkResult(boolean isTrue, String testName) {
        if (isTrue) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - FALSE");
        }
    }

    void checkFalseResult(boolean isTrue, String testName) {
        if (!isTrue) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - FALSE");
        }
    }
}
