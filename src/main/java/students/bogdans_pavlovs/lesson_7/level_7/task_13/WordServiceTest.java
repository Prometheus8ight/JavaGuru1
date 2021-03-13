package students.bogdans_pavlovs.lesson_7.level_7.task_13;

class WordServiceTest {

    public static void main(String[] args) {

        WordServiceTest wordServiceTest = new WordServiceTest();
        wordServiceTest.findMostFrequentWordTest();


    }

    void findMostFrequentWordTest(){

        WordService wordService = new WordService();
        String expectedResult = "Omg";
        String realResult = wordService.findMostFrequentWord("omg oMg Omg Omg stop");
        checkResult(realResult, expectedResult, "Find Most Frequent Word Test");


    }

    void checkResult (String realResult, String expectedResult, String testName){
        if(realResult.equals(expectedResult)){
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }


}
