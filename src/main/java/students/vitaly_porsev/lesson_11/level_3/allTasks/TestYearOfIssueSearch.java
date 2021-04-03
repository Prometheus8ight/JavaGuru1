package students.vitaly_porsev.lesson_11.level_3.allTasks;

public class TestYearOfIssueSearch {
    public static void main(String[] args) {
        TestYearOfIssueSearch method = new TestYearOfIssueSearch();
        method.YearOfIssueSearchTest();
        method.YearOfIssueSearchTestFalse();
    }

    void YearOfIssueSearchTest() {
        SearchCriteria year = new YearOfIssueSearchCriteria("2013");
        Book book = new Book("Stephen King", "Doctor Sleep", "2013");
        check(true, year.match(book), "YearOfIssueSearchTest");
    }

    void YearOfIssueSearchTestFalse() {
        SearchCriteria year = new TitleSearchCriteria("2012");
        Book book = new Book("Stephen King", "Doctor Sleep", "2013");
        check(false, year.match(book), "YearOfIssueSearchTestFalse");
    }

    private void check(boolean expectedResult, boolean realResult, String testName) {
        if (expectedResult == realResult) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - FALSE");
        }
    }
}
