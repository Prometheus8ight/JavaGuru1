package students.nikita_bunevich.lesson_7.level_1;

class WordServiceTest {
    public static void main(String[] args) {
        WordServiceTest serviceTest = new WordServiceTest();
        serviceTest.test1("бобер утка утка");
        serviceTest.test2("утка бобер бобер");
    }

    public void test1(String text) {
        WordService start = new WordService();
        String result = start.findMostFrequentWord(text);
        check(result, "утка", "test1");
    }

    public void test2(String text) {
        WordService start = new WordService();
        String result = start.findMostFrequentWord(text);
        check(result, "бобер", "test2");
    }


    public void check(String result, String expected, String testName) {
        if (result.equals(expected)) {
            System.out.println(testName + ": Complete");
        } else {
            System.out.println(testName + ": Fail");
        }

    }
}

