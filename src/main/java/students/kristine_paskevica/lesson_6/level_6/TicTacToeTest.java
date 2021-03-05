package students.kristine_paskevica.lesson_6.level_6;

class TicTacToeTest {

    public static void main(String[] args) {
        TicTacToeTest testi = new TicTacToeTest();
        testi.checkFieldTest();
        testi.checkFalseFieldTest();
    }

    void checkFieldTest() {
        TicTacToe testi = new TicTacToe();
        int[][] field = testi.createField();
        checkResult(testField(field), "Lauku pārabudes tests");
    }

    void checkFalseFieldTest() {
        int[][] field = {{-1, -1, -1}, {0, -1, -1}, {-1, -1 - 1}};
        checkFalseResult(testField(field), "Tukša lauku tests");
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
            System.out.println(testName + " - ir patiess");
        } else {
            System.out.println(testName + " - nav patiess");
        }
    }

    void checkFalseResult(boolean isTrue, String testName) {
        if (!isTrue) {
            System.out.println(testName + " - ir patiess");
        } else {
            System.out.println(testName + " - nav patiess");
        }
    }
}
