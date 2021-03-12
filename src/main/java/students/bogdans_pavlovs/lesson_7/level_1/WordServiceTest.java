package students.bogdans_pavlovs.lesson_7.level_1;

import java.util.Arrays;

class WordServiceTest {

    public static void main(String[] args) {

        WordServiceTest test = new WordServiceTest();

        test.wordServiceTest();

    }

    public void wordServiceTest(){

        WordService wordService = new WordService();
        String expectedResult = "Your word is: [ now ]";
        String realResult = wordService.findMostFrequentWord("NoW nOw Now??! Who wHo whO do wE HavE HeRe#$?");
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
