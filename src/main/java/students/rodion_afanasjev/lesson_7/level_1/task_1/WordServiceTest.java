package students.rodion_afanasjev.lesson_7.level_1.task_1;

import java.util.Arrays;

class WordServiceTest {

    public static void main(String[] args) {

        WordServiceTest wordServiceTest = new WordServiceTest();
        wordServiceTest.lowerCaseTest();
        wordServiceTest.stringArrayTest();
        wordServiceTest.printTest();
        wordServiceTest.findMostFrequentWordTest();
    }

    void lowerCaseTest() {
        WordService wordService = new WordService();
        String text = "Hello World";
        String expectedResult = "hello world";
        String realResult = wordService.lowerCase(text);
        equalCheck(realResult, expectedResult, "lowerCaseTest");
    }

    void stringArrayTest() {
        WordService wordService = new WordService();
        String text = "Hello World";
        String[] expectedResult = {"Hello", "World"};
        String[] realResult = wordService.stringArray(text);
        equalCheckArray(realResult, expectedResult, "stringArrayTest");
    }

    void printTest() {
        WordService wordService = new WordService();
        String text = "Hello World";
        String expectedResult = "Hello World";
        String realResult = wordService.print(text);
        equalCheck(realResult, expectedResult, "printTest");
    }

    void findMostFrequentWordTest() {
        WordService wordService = new WordService();
        String text = "Black black black dog dog dog";
        String expectedResult = "Most frequent word is: black";
        String realResult = wordService.findMostFrequentWord(text);
        equalCheck(realResult, expectedResult, "findMostFrequentWordTest");
    }

    void equalCheck(String realResult, String expectedResult, String testName) {
        if (realResult.equals(expectedResult)) {
            System.out.println(testName + " : OK");
        } else {
            System.out.println(testName + " FAIL");
        }
    }

    void equalCheckArray(String[] realResult, String[] expectedResult, String testName) {
        if (Arrays.equals(realResult, expectedResult)) {
            System.out.println(testName + " : OK");
        } else {
            System.out.println(testName + " FAIL");
        }
    }

}
