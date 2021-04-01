package students.julija_katukova.lesson_11.level_3;

class YearOfIssueSearchCriteriaTest {

    public static void main(String[] args) {
        YearOfIssueSearchCriteriaTest titleSearchCriteriaTest = new YearOfIssueSearchCriteriaTest();
        titleSearchCriteriaTest.test1();
        titleSearchCriteriaTest.test2();
        titleSearchCriteriaTest.test3();
    }

    private void test1() {
        Book book1 = new Book("Marcel Proust", "In Search of Lost Time");
        book1.setYearOfIssue("1913");
        YearOfIssueSearchCriteria yearOfIssueSearchCriteria = new YearOfIssueSearchCriteria("1913");
        boolean realResult = yearOfIssueSearchCriteria.match(book1);
        check(realResult, true, "Test1");
    }

    private void test2() {
        Book book1 = new Book("Marcel Proust", "In Search of Lost Time");
        Book book2 = new Book("Fyodor Dostoyevsky", "Crime and Punishment");
        book1.setYearOfIssue("1913");
        book2.setYearOfIssue("1866");
        YearOfIssueSearchCriteria yearOfIssueSearchCriteria = new YearOfIssueSearchCriteria("1866");
        boolean realResult = yearOfIssueSearchCriteria.match(book2);
        check(realResult, true, "Test2");
    }

    private void test3() {
        Book book1 = new Book("Marcel Proust", "In Search of Lost Time");
        Book book2 = new Book("Fyodor Dostoyevsky", "Crime and Punishment");
        book1.setYearOfIssue("1913");
        book2.setYearOfIssue("1866");
        YearOfIssueSearchCriteria yearOfIssueSearchCriteria = new YearOfIssueSearchCriteria("1866");
        boolean realResult = yearOfIssueSearchCriteria.match(book1);
        check(realResult, false, "Test3");
    }

    private void check(boolean realResult, boolean expectedResult, String testName) {
        if (realResult == expectedResult) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
}
