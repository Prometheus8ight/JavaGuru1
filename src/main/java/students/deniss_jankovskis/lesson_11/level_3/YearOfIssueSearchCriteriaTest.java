package students.deniss_jankovskis.lesson_11.level_3;

class YearOfIssueSearchCriteriaTest {

    public static void main(String[] args) {

        YearOfIssueSearchCriteriaTest test = new YearOfIssueSearchCriteriaTest();
        test.yearOfIssueSearchCriteriaTest1();
        test.yearOfIssueSearchCriteriaTest2();
        test.yearOfIssueSearchCriteriaTest3();
    }

    public void yearOfIssueSearchCriteriaTest1() {
        Book book1 = new Book("F. Scott Fitzgerald", "The Great Gatsby");
        Book book2 = new Book("Leo Tolstoy", "War and Peace");
        Book book3 = new Book("Gustave Flaubert", "Madame Bovary");
        book1.setYearOfIssue("1925");
        book2.setYearOfIssue("1867");
        book3.setYearOfIssue("1856");
        YearOfIssueSearchCriteria yearOfIssueSearchCriteria = new YearOfIssueSearchCriteria("1925");
        boolean realResult = yearOfIssueSearchCriteria.match(book1);
        checkTestResult(realResult, true, "Year Of Issue Test 1");
    }

    public void yearOfIssueSearchCriteriaTest2() {
        Book book1 = new Book("F. Scott Fitzgerald", "The Great Gatsby");
        Book book2 = new Book("Leo Tolstoy", "War and Peace");
        Book book3 = new Book("Gustave Flaubert", "Madame Bovary");
        book1.setYearOfIssue("1925");
        book2.setYearOfIssue("1867");
        book3.setYearOfIssue("1856");
        YearOfIssueSearchCriteria yearOfIssueSearchCriteria = new YearOfIssueSearchCriteria("1867");
        boolean realResult = yearOfIssueSearchCriteria.match(book2);
        checkTestResult(realResult, true, "Year Of Issue Test 2");
    }

    public void yearOfIssueSearchCriteriaTest3() {
        Book book1 = new Book("F. Scott Fitzgerald", "The Great Gatsby");
        Book book2 = new Book("Leo Tolstoy", "War and Peace");
        Book book3 = new Book("Gustave Flaubert", "Madame Bovary");
        book1.setYearOfIssue("1925");
        book2.setYearOfIssue("1867");
        book3.setYearOfIssue("1856");
        YearOfIssueSearchCriteria yearOfIssueSearchCriteria = new YearOfIssueSearchCriteria("1856");
        boolean realResult = yearOfIssueSearchCriteria.match(book1);
        checkTestResult(realResult, false, "Year Of Issue Test 3");
    }

    public void checkTestResult(boolean realResult, boolean expectedResult, String testName) {
        if (realResult == expectedResult) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FALSE");
        }
    }
}
