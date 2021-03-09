package students.rodion_afanasjev.lesson_7.level_1.task_1;

class WordServiceTest {

    public static void main(String[] args) {

        WordServiceTest wordServiceTest = new WordServiceTest();
        wordServiceTest.findMostFrequentWordTest();
        wordServiceTest.findMostFrequentWordTest2();
        wordServiceTest.findMostFrequentWordTest3();
        wordServiceTest.findMostFrequentWordTest4();
        wordServiceTest.findMostFrequentWordTest5();
    }

    void findMostFrequentWordTest() {
        WordService wordService = new WordService();
        String text = "Black black black dog dog dog";
        String expectedResult = "Most frequent word is: black";
        String realResult = wordService.mostFrequentWord(text);
        equalCheck(realResult, expectedResult, "findMostFrequentWordTest");
    }

    void findMostFrequentWordTest2() {
        WordService wordService = new WordService();
        String text = "Black black black dog dog dog dog";
        String expectedResult = "Most frequent word is: dog";
        String realResult = wordService.mostFrequentWord(text);
        equalCheck(realResult, expectedResult, "findMostFrequentWordTest2");
    }

    void findMostFrequentWordTest3() {
        WordService wordService = new WordService();
        String text = "Black dog, white dog, black cat";
        String expectedResult = "Most frequent word is: black";
        String realResult = wordService.mostFrequentWord(text);
        equalCheck(realResult, expectedResult, "findMostFrequentWordTest3");
    }

    void findMostFrequentWordTest4() {
        WordService wordService = new WordService();
        String text = "Black";
        String expectedResult = "Most frequent word is: black";
        String realResult = wordService.mostFrequentWord(text);
        equalCheck(realResult, expectedResult, "findMostFrequentWordTest4");
    }

    void findMostFrequentWordTest5() {
        WordService wordService = new WordService();
        String text = "";
        String expectedResult = "Most frequent word is: ";
        String realResult = wordService.mostFrequentWord(text);
        equalCheck(realResult, expectedResult, "findMostFrequentWordTest5");
    }

    void equalCheck(String realResult, String expectedResult, String testName) {
        if (realResult.equals(expectedResult)) {
            System.out.println(testName + " : OK");
        } else {
            System.out.println(testName + " : FAIL");
        }
    }

}
