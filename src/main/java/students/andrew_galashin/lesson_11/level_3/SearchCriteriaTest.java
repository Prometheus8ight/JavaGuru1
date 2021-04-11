package students.andrew_galashin.lesson_11.level_3;

class SearchCriteriaTest {
    public static void main(String[] args) {

        SearchCriteriaTest start = new SearchCriteriaTest();
        start.test1();
        start.test2();
        start.test3();
        start.testFalse();
    }

    void test1() {
        SearchCriteria start = new OrSearchCriteria(new TitleSearchCriteria("1"), new YearOfIssueSearchCriteria("2000"));
        Book book = new Book("Author", "1", "2000");
        check(true, start.match(book), "Test1");
    }

    void test2() {
        SearchCriteria start = new OrSearchCriteria(new TitleSearchCriteria("2"), new AuthorSearchCriteria("Author2"));
        Book book = new Book("Author2", "2", "2001");
        check(true, start.match(book), "Test2");
    }

    void test3() {
        SearchCriteria start = new OrSearchCriteria(new AuthorSearchCriteria("Author3"), new YearOfIssueSearchCriteria("2002"));
        Book book = new Book("Author3", "3", "2002");
        check(true, start.match(book), "Test3");
    }

    void testFalse() {
        SearchCriteria start = new AndSearchCriteria(new TitleSearchCriteria("4"), new YearOfIssueSearchCriteria("2003"));
        Book book = new Book("Author4", "5", "2004");
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
