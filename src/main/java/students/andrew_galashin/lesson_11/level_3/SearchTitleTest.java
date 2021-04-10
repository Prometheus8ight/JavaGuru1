package students.andrew_galashin.lesson_11.level_3;

class SearchTitleTest {

    public static void main(String[] args) {
        SearchTitleTest start = new SearchTitleTest();
        start.test1();
        start.test2();
    }

    void test1() {
        SearchCriteria start = new TitleSearchCriteria("1");
        Book book = new Book("Author", "1", "2001");
        check(true, start.match(book), "TestTrue");
    }

    void test2() {
        SearchCriteria start = new TitleSearchCriteria("2");
        Book book = new Book("Author", "1", "2001");
        check(false, start.match(book), "TestFalse");
    }

    void check(boolean result, boolean expected, String testName) {
        if (result == expected) {
            System.out.println(testName + ": Complete");
        } else {
            System.out.println(testName + ": Fail");
        }
    }

}
