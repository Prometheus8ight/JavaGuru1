package students.vitaly_porsev.lesson_11.level_3.allTasks;

public class TestAuthorSearch {
    public static void main(String[] args) {
        TestAuthorSearch method = new TestAuthorSearch();
        method.AuthorSearchTest();
        method.AuthorSearchTestFalse();
    }

    void AuthorSearchTest() {
        SearchCriteria author = new AuthorSearchCriteria("Stephen King");
        Book book = new Book("Stephen King", "Doctor Sleep", "2013");
        check(true, author.match(book), "AuthorSearchTest");
    }

    void AuthorSearchTestFalse() {
        SearchCriteria author = new AuthorSearchCriteria("Julius King");
        Book book = new Book("Stephen King", "Doctor Sleep", "2013");
        check(false, author.match(book), "AuthorSearchTestFalse");
    }

   private void check(boolean expectedResult, boolean realResult, String testName) {
        if (expectedResult == realResult) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - FALSE");
        }
    }
}
