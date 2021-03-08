package students.julija_katukova.lesson_7.level_1.task_1;

class WordServiceTest {
    public static void main(String[] args) {
        WordServiceTest wordServiceTest = new WordServiceTest();
        wordServiceTest.text1("Apple, banana! grape@ Apple- carrot potato apple");
        wordServiceTest.text2("banana apple grape apple carrot potato");
        wordServiceTest.text3("banana grape apple grape carrot potato kiwi");
        wordServiceTest.text4("banana grape apple grape carrot potato banana kiwi");
        wordServiceTest.text5("banana grape banana apple grape carrot potato kiwi");
        wordServiceTest.text6("James, while John had had \"had\", had had \"had had\"; \"had had\" had had a better effect on the teacher.");
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
        check(realResult, "banana", "Text Test4");
    }

    public void text5(String text) {
        WordService wordService = new WordService();
        String realResult = wordService.findMostFrequentWord(text);
        check(realResult, "banana", "Text Test5");
    }

    public void text6(String text) {
        WordService wordService = new WordService();
        String realResult = wordService.findMostFrequentWord(text);
        check(realResult, "had", "Text Test6");
    }

    public void check(String realResult, String expectedResult, String testName) {
        if (realResult.equals(expectedResult)) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
}
