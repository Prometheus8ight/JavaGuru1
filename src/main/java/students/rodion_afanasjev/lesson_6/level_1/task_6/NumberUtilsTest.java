package students.rodion_afanasjev.lesson_6.level_1.task_6;

class NumberUtilsTest {

    public void isEvenTest() {
        NumberUtils numberUtils = new NumberUtils();
        boolean realResult = numberUtils.isEven(10);
        if (realResult) {
            System.out.println("isEvenTest: OK");
        } else {
            System.out.println("isEvenTest: FAIL");
        }
    }
}
