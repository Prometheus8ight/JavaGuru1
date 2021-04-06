package students.deniss_jankovskis.lesson_11.level_3;

class OrSearchCriteriaTest {

    public static void main(String[] args) {

        OrSearchCriteriaTest test = new OrSearchCriteriaTest();
        test.orSearchCriteriaTest1();
        test.orSearchCriteriaTest2();
        test.orSearchCriteriaTest3();
    }

    public void orSearchCriteriaTest1() {
        Book book1 = new Book("F. Scott Fitzgerald", "The Great Gatsby");
        Book book2 = new Book("Leo Tolstoy", "War and Peace");
        Book book3 = new Book("Gustave Flaubert", "Madame Bovary");
        book1.setYearOfIssue("1925");
        book2.setYearOfIssue("1867");
        book3.setYearOfIssue("1856");
        OrSearchCriteria criteria = new OrSearchCriteria(new AuthorSearchCriteria("F. Scott Fitzgerald"), new TitleSearchCriteria("The Great Gatsby"));
        boolean realResult = criteria.match(book1);
        checkTestResult(realResult, true, "Or Search Criteria Test 1");
    }

    public void orSearchCriteriaTest2() {
        Book book1 = new Book("F. Scott Fitzgerald", "The Great Gatsby");
        Book book2 = new Book("Leo Tolstoy", "War and Peace");
        Book book3 = new Book("Gustave Flaubert", "Madame Bovary");
        book1.setYearOfIssue("1925");
        book2.setYearOfIssue("1867");
        book3.setYearOfIssue("1856");
        OrSearchCriteria criteria = new OrSearchCriteria(new AuthorSearchCriteria("Leo Tolstoy"), new TitleSearchCriteria("War and Peace"));
        boolean realResult = criteria.match(book2);
        checkTestResult(realResult, true, "Or Search Criteria Test 2");
    }

    public void orSearchCriteriaTest3() {
        Book book1 = new Book("F. Scott Fitzgerald", "The Great Gatsby");
        Book book2 = new Book("Leo Tolstoy", "War and Peace");
        Book book3 = new Book("Gustave Flaubert", "Madame Bovary");
        book1.setYearOfIssue("1925");
        book2.setYearOfIssue("1867");
        book3.setYearOfIssue("1856");
        OrSearchCriteria criteria = new OrSearchCriteria(new AuthorSearchCriteria("Gustave Flaubert"), new TitleSearchCriteria("Madame Bovary"));
        boolean realResult = criteria.match(book1);
        checkTestResult(realResult, false, "Or Search Criteria Test 3");
    }

    public void checkTestResult(boolean realResult, boolean expectedResult, String testName) {
        if (realResult == expectedResult) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FALSE");
        }
    }
}
