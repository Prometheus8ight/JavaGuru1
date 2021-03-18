package students.alex_kalashnikov.lesson_7.level_7.task_13;

class WordServiceTest {

    public static void main(String[] args) {

        WordServiceTest newObject = new WordServiceTest();
        newObject.testFindMostFrequentWord();
        newObject.testFindMostFrequentWord1();
        newObject.testFindMostFrequentWord2();
        newObject.testFindMostFrequentWord3();

    }

    void test(String expectedResult, String text) {
        WordService newTest = new WordService();
        String realResult = newTest.findMostFrequentWord(text);
        if (realResult.equals(expectedResult)) {
            System.out.println("Test is OK!");
        } else {
            System.out.println("Test is FAILED");
        }
    }

    void testFindMostFrequentWord() {
        String text = "EUR USD JPY RUB TRY EUR USD USD BRL EUR MXN CAD AUD CAD EUR";
        String expectedResult = "EUR";
        test(expectedResult, text);
    }

    void testFindMostFrequentWord1() {
        String text = "USD USD EUR TRY RUB BRL MXN CAD AUD";
        String expectedResult = "USD";
        test(expectedResult, text);
    }

    void testFindMostFrequentWord2() {
        String text = "JPY USD EUR TRY RUB BRL MXN CAD AUD GBP GBP";
        String expectedResult = "GBP";
        test(expectedResult, text);
    }

    void testFindMostFrequentWord3() {
        String text = "GBP JPY USD EUR TRY RUB BRL MXN CAD AUD GBP";
        String expectedResult = "GBP";
        test(expectedResult, text);
    }

}


