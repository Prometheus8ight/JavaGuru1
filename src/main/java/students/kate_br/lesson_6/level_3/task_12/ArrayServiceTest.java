package students.kate_br.lesson_6.level_3.task_12;

public class ArrayServiceTest {

    public static void main(String[] args) {

        ArrayServiceTest test = new ArrayServiceTest();
        test.trueNumTest();
        test.falseNumTest();
    }

    public void trueNumTest(){
        ArrayService arrayService = new ArrayService();
        int[] arr = {10, 69, 84, 2, 15};
        boolean realResult = arrayService.contains(arr, 69);
        checkTestResult(realResult, "TrueNumber");
    }

    public void falseNumTest(){

        ArrayService arrayService = new ArrayService();
        int[] arr = {5, 63, 11, 8, 93};
        boolean realResult = arrayService.contains(arr, 69);
        checkTestResult(!realResult, "FalseNumber");
    }


    private void checkTestResult(boolean condition, String testName){

        if (condition){
            System.out.println("Test OK");
        }else {
            System.out.println("Test FAIL");
        }
    }
}
