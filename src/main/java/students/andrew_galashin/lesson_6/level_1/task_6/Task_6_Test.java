package students.andrew_galashin.lesson_6.level_1.task_6;

class NumberUtilsTest {
    public static void main(String[] args) {


        NumberUtilsTest test = new NumberUtilsTest();
        test.evenNumber(8);
        test.oddNumber(7);
}

    public void evenNumber(int x){
        x = 8;
        boolean expected = true;
        NumberUtils numberUtils = new NumberUtils();
        boolean result = numberUtils.isEven(8);
            if (expected == result){
                System.out.println("1.Complete");
            } else {
                System.out.println("1.Fail");
            }
    }

    public void oddNumber(int x){
        x = 7;
        boolean excetced = false;
        NumberUtils numberUtils = new NumberUtils();;
        boolean result = numberUtils.isEven(7);
            if(excetced == result){
                System.out.println("2.Complete");
            } else {
                System.out.println("2.Fail");
            }
    }
}
