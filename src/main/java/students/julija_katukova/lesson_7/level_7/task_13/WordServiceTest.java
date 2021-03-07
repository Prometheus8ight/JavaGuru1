package students.julija_katukova.lesson_7.level_7.task_13;

class WordServiceTest {
    public static void main(String[] args) {
        WordServiceTest wordServiceTest = new WordServiceTest();
        wordServiceTest.text1("apple banana grape apple carrot potato apple");
        wordServiceTest.text2("banana apple grape apple carrot potato");
        wordServiceTest.text3("banana grape apple grape carrot potato kiwi");
        wordServiceTest.text4("banana grape banana apple grape carrot potato kiwi");
    }

    public void text1(String text) {
        WordService wordService = new WordService();
        String realResult = wordService.findMostFrequentWord(text);
        check(realResult, "apple", "Text Test1");
    }

    public void text2(String text) {
        WordService wordService = new WordService();
        String realResult = wordService.findMostFrequentWord(text);
        check(realResult, "apple", "Text Test2");
    }

    public void text3(String text) {
        WordService wordService = new WordService();
        String realResult = wordService.findMostFrequentWord(text);
        check(realResult, "grape", "Text Test3");
    }

    public void text4(String text) {
        WordService wordService = new WordService();
        String realResult = wordService.findMostFrequentWord(text);
        check(realResult, "banana", "Text Test5");
    }

    public void check(String realResult, String expectedResult, String testName) {
        if (realResult.equals(expectedResult)) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }




}
