package students.bogdans_pavlovs.lesson_7.level_1;

import java.util.Arrays;

class WordServiceTest {

    public static void main(String[] args) {

        WordServiceTest test = new WordServiceTest();

        test.formatTextTest();
        test.splitTextTest();
        test.findMostFrequentWordTest();
        test.wordServiceTest();

    }

    public void formatTextTest(){

        WordService wordService = new WordService();
        String realResult = wordService.formatText("NoW nOw Now??! Who wHo whO do wE HavE HeRe#$?");
        String expectedResult = "now now now who who who do we have here";
        check(realResult, expectedResult, "Format Text Test");
    }

    public void splitTextTest(){

        WordService wordService = new WordService();
        String realResult = Arrays.toString(wordService.splitText("NoW nOw Now??! Who wHo whO do wE HavE HeRe#$?"));
        String expectedResult = "[NoW, nOw, Now??!, Who, wHo, whO, do, wE, HavE, HeRe#$?]";
        check(realResult, expectedResult, "Split Text Test");
    }

    public void findMostFrequentWordTest(){

       WordService wordService = new WordService();
       String[] testArray = {"now", "now", "now", "who", "who", "who", "do", "we", "have", "here"};
       String realResult = wordService.findMostFrequentWord(testArray);
       String expectedResult = "Your word is: [ now ]";
       check(realResult,expectedResult,"Find Word Test");

    }

    public void wordServiceTest(){

        WordService wordService = new WordService();

        String expectedResult = "Your word is: [ now ]";

        String formattedText = wordService.formatText("NoW nOw Now??! Who wHo whO do wE HavE HeRe#$?");
        String[] splitText = wordService.splitText(formattedText);
        String realResult = wordService.findMostFrequentWord(splitText);

        check(realResult, expectedResult, "Word Service Test");

    }

    public void check(String realResult, String expectedResult, String testName){

        if (realResult.equals(expectedResult)){
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }

    }


}
