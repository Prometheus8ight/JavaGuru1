package students.julija_katukova.lesson_7.level_1.task_2;

import java.util.Arrays;

class WordServiceTest {
    public static void main(String[] args) {
        WordServiceTest wordServiceTest = new WordServiceTest();
        wordServiceTest.convertTextToStringArray1("Snow White and the Seven Dwarfs and the Cat.");
        wordServiceTest.mostFrequentWord1(new String[]{"snow", "white", "and", "the", "seven", "dwarfs", "and", "the", "cat"});
    }

    public void convertTextToStringArray1(String text) {
        WordService wordService = new WordService();
        String[] realResult = wordService.convertTextToStringArray(text);
        check1(realResult, new String[]{"snow", "white", "and", "the", "seven", "dwarfs", "and", "the", "cat"}, "Convert Text To String Array Test1");
    }

    public void mostFrequentWord1(String[] arrayText) {
        WordService wordService = new WordService();
        String realResult = wordService.mostFrequentWord(arrayText);
        check2(realResult, "and", "Most Frequent Word Test1");
    }

    public void check1(String[] realResult, String[] expectedResult, String testName) {
        if (Arrays.equals(realResult, expectedResult)) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }

    public void check2(String realResult, String expectedResult, String testName) {
        if (realResult.equals(expectedResult)) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
}
