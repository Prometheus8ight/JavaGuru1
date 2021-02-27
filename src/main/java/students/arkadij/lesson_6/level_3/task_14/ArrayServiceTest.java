package students.arkadij.lesson_6.level_3.task_14;

class ArrayServiceTest {

    public void allTests(){
        replaceFirstTestOk();
        replaceFirstTestFail();
    }

    private void replaceCheck(boolean checkedMaybe, String nameTest){
        if (checkedMaybe){
            System.out.println(nameTest + " - OK!");
        } else {
            System.out.println(nameTest + " - FAIL!");
        }
    }

    public void replaceFirstTestOk(){
        System.out.println("NUMBER FOUND:");
        ArrayService arrayService = new ArrayService();
        int[] arr = {1,2,3,4,5};
        boolean realResult = arrayService.replaceFirst(arr,5,7);
        replaceCheck(realResult,"Number is replaced");
    }

    public void replaceFirstTestFail(){
        System.out.println("\nNUMBER NOT FOUND:");
        ArrayService arrayService = new ArrayService();
        int[] arr = {1,2,3,4,5};
        boolean realResult = arrayService.replaceFirst(arr,7,10);
        replaceCheck(realResult,"Number is replaced");
    }


}
