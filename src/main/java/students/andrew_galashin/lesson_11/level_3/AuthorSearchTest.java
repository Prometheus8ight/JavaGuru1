package students.andrew_galashin.lesson_11.level_3;

class AuthorSearchTest {

    public static void main(String[] args) {
        AuthorSearchTest start = new AuthorSearchTest();
        start.Test1();
        start.Test2();

    }

    void Test1() {
        SearchCriteria start = new AuthorSearchCriteria("Author");
        Book book = new Book("Author", "1", "2000");
        check(true, start.match(book), "Test1");
    }

    void Test2() {
        SearchCriteria start = new AuthorSearchCriteria("Author2");
        Book book = new Book("Author", "1", "2000");
        ;
        check(false, start.match(book), "Test2");
    }

    void check(boolean result, boolean expected, String testName) {
        if (result == expected) {
            System.out.println(testName + ": Complete");
        } else {
            System.out.println(testName + ": Fail");
        }
    }
}
