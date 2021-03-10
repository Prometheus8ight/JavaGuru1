package students.deniss_jankovskis.lesson_7.task_2_3;

import java.util.Arrays;

public class WordServiceTest {

    public static void main(String[] args) {

        WordServiceTest test = new WordServiceTest();
        test.findMostFrequentWordTest();
        test.stringArrayWordTest();
    }

    public void findMostFrequentWordTest() {
        WordService service = new WordService();
        checkFrequentWord("The word that occurs most times in the text is: - a",
                service.findMostFrequentWord("A - Every, A - EVERY, A"), "FindMostFrequentWordTest");
    }

    public void stringArrayWordTest() {
        WordService service = new WordService();
        String[] arr = {"A", "Star", "A", "STAR", "a"};
        String text = "A - Star, A - STAR, a";
        checkStringArrayWord(arr, service.stringArrayWord(text), "StringArrayWordTest");
    }

    private void checkFrequentWord(String expectedResult, String realResult, String testName) {
        if (expectedResult.equals(realResult)) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " has failed");
        }
    }

    private void checkStringArrayWord(String[] expectedResult, String[] realResult, String testName) {
        if (Arrays.equals(expectedResult, expectedResult)) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " has failed");
        }
    }


}


