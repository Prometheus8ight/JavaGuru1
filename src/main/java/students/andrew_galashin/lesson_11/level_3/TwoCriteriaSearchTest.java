package students.andrew_galashin.lesson_11.level_3;

class TwoCriteriaSearchTest {

    public static void main(String[] args) {
        TwoCriteriaSearchTest start = new TwoCriteriaSearchTest();
        start.test1();
        start.test2();
        start.test3();
        start.testFalse();
    }

    void test1() {
        SearchCriteria start = new AndSearchCriteria(new TitleSearchCriteria("1"), new YearOfIssueSearchCriteria("2001"));
        Book book = new Book("Author", "1", "2001");
        check(true, start.match(book), "Test1");
    }

    void test2() {
        SearchCriteria start = new AndSearchCriteria(new TitleSearchCriteria("1"), new AuthorSearchCriteria("Author"));
        Book book = new Book("Author", "1", "2001");
        check(true, start.match(book), "Test2");
    }

    void test3() {
        SearchCriteria start = new AndSearchCriteria(new AuthorSearchCriteria("Author"), new YearOfIssueSearchCriteria("2001"));
        Book book = new Book("Author", "1", "2001");
        check(true, start.match(book), "Test3");
    }

    void testFalse() {
        SearchCriteria start = new AndSearchCriteria(new TitleSearchCriteria("2"), new YearOfIssueSearchCriteria("2002"));
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
