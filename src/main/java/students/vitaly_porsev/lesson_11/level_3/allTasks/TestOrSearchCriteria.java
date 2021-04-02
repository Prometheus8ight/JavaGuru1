package students.vitaly_porsev.lesson_11.level_3.allTasks;

public class TestOrSearchCriteria {
    public static void main(String[] args) {
        TestOrSearchCriteria method = new TestOrSearchCriteria();
        method.TwoCriteriaSearchTest1();
        method.TwoCriteriaSearchTest2();
        method.TwoCriteriaSearchTest3();
        method.TwoCriteriaSearchTestFalse();
    }

    void TwoCriteriaSearchTest1() {
        SearchCriteria titleAndYear = new OrSearchCriteria(new TitleSearchCriteria("Doctor Sleep"),
                new YearOfIssueSearchCriteria("2015"));
        Book book = new Book("Doctor Sleep", "Stephen King", "2013");
        check(true, titleAndYear.match(book), "TwoCriteriaSearchTest1");
    }

    void TwoCriteriaSearchTest2() {
        SearchCriteria titleAndAuthor = new OrSearchCriteria(new TitleSearchCriteria("Crime and Punishment"),
                new AuthorSearchCriteria("Fyodor Dostoyevsky"));
        Book book = new Book("Crimes", "Fyodor Dostoyevsky", "1866");
        check(true, titleAndAuthor.match(book), "TwoCriteriaSearchTest2");
    }

    void TwoCriteriaSearchTest3() {
        SearchCriteria AuthorAndYear = new OrSearchCriteria(new AuthorSearchCriteria("J. D. Salinger"),
                new YearOfIssueSearchCriteria("2000"));
        Book book = new Book("The Catcher in the Rye", "J. D. Salinger", "1945");
        check(true, AuthorAndYear.match(book), "TwoCriteriaSearchTest3");
    }

    void TwoCriteriaSearchTestFalse() {
        SearchCriteria titleAndYear = new AndSearchCriteria(new TitleSearchCriteria("Doctor Sleep"),
                new YearOfIssueSearchCriteria("2013"));
        Book book = new Book("The Grapes of Wrath", "John Steinbeck", "1939");
        check(false, titleAndYear.match(book), "TwoCriteriaSearchTestFalse");
    }

    private void check(boolean expectedResult, boolean realResult, String testName) {
        if (expectedResult == realResult) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - FALSE");
        }
    }
}
