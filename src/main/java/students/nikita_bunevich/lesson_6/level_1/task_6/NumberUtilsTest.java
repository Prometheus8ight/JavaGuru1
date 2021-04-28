package students.nikita_bunevich.lesson_6.level_1.task_6;

class NumberUtilsTest {
    public static void main(String[] args) {
        NumberUtilsTest numberUtilsTest = new NumberUtilsTest();
        numberUtilsTest.evenTest(2);
        numberUtilsTest.oddTest(1);
        numberUtilsTest.zeroTest(0);
    }

    public void evenTest(int number) {
        NumberUtils numberUtils = new NumberUtils();
        boolean realResult = numberUtils.isEven(number);
        check(realResult, true, "Even Test");
    }

    public void oddTest(int number) {
        NumberUtils numberUtils = new NumberUtils();
        boolean realResult = numberUtils.isEven(number);
        check(realResult, false, "Odd Test");
    }

    public void zeroTest(int number) {
        NumberUtils numberUtils = new NumberUtils();
        boolean realResult = numberUtils.isEven(number);
        check(realResult, true, "Zero Test");
    }


    public void check (boolean realResult, boolean expectedResult, String testName) {
        if(realResult == expectedResult) {
            System.out.println(testName + " = OK");
        }
        else {
            System.out.println(testName + " = FAIL");
        }
    }

}

