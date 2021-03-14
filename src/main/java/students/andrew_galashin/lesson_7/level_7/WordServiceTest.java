package students.andrew_galashin.lesson_7.level_7;

class WordServiceTest {
    public static void main(String[] args) {
        WordServiceTest start = new WordServiceTest();
        start.test1("one two one one two");
        start.test2("one two two two");
    }

    public void test1(String text) {
        WordService start = new WordService();
        String result = start.findMostFrequentWord(text);
        check(result, "one", "test1");
    }

    public void test2(String text) {
        WordService start = new WordService();
        String result = start.findMostFrequentWord(text);
        check(result, "two", "test2");
    }


    public void check(String result, String expected, String testName) {
        if (result.equals(expected)) {
            System.out.println(testName + ": Complete");
        } else {
            System.out.println(testName + ": Fail");
        }

    }
}
