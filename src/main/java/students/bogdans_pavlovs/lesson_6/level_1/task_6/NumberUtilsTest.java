package students.bogdans_pavlovs.lesson_6.level_1.task_6;

class NumberUtilsTest {

    public static void main(String[] args) {

        NumberUtilsTest numberUtilsTest = new NumberUtilsTest();
        numberUtilsTest.isEvenTest();

    }

    public void isEvenTest (){

        NumberUtils numberUtils = new NumberUtils();
        if (numberUtils.isEven(80)){
            System.out.println("isEvenTest = OK");
        } else {
            System.out.println("isEvenTest = FAIL");
        }

    }


}
