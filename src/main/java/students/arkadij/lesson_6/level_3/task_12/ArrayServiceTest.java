package students.arkadij.lesson_6.level_3.task_12;

class ArrayServiceTest {

    public void allTests(){
        findNumberTestTrue();
        findNumberTestFalse();
    }

    private void finderCheck(boolean condition, String nameTest){
        if (condition){
            System.out.println(nameTest + " - OK!");
        } else {
            System.out.println(nameTest + " - FAIL!");
        }
    }

    public void findNumberTestTrue(){
        ArrayService arrayService = new ArrayService();
        int[] arr = {1,2,3,4,5,6,7,8,9};
        boolean realResult = arrayService.theArrayNumberFinder(arr,7);
        finderCheck(realResult, "Find array number true");
    }

    public void findNumberTestFalse(){
        ArrayService arrayService = new ArrayService();
        int[] arr = {1,2,3,4,5,6,7,8,9};
        boolean realResult = arrayService.theArrayNumberFinder(arr, 0);
        finderCheck(!realResult,"Find array number false");
    }

}
