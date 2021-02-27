package students.arkadij.lesson_6.level_1;

class NumberUtilsTest { // TASK #6.

    public void isEvenTest(){
        NumberUtils numberUtils = new NumberUtils();
        boolean realResult = numberUtils.isEven(6);
        if (realResult){
            System.out.println("Even test - OK!");
        } else {
            System.out.println("Even test - FAIL!");
        }
    }

}
