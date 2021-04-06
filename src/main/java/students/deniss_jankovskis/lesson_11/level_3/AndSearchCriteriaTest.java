package students.deniss_jankovskis.lesson_11.level_3;

class AndSearchCriteriaTest {

    public static void main(String[] args) {

        AndSearchCriteriaTest test = new AndSearchCriteriaTest();
        test.andSearchCriteriaTest1();
        test.andSearchCriteriaTest2();
        test.andSearchCriteriaTest3();
    }

    public void andSearchCriteriaTest1() {
        Book book1 = new Book("F. Scott Fitzgerald", "The Great Gatsby");
        Book book2 = new Book("Leo Tolstoy", "War and Peace");
        Book book3 = new Book("Gustave Flaubert", "Madame Bovary");
        book1.setYearOfIssue("1925");
        book2.setYearOfIssue("1867");
        book3.setYearOfIssue("1856");
        AndSearchCriteria criteria = new AndSearchCriteria(new AuthorSearchCriteria("F. Scott Fitzgerald"), new TitleSearchCriteria("The Great Gatsby"));
        boolean realResult = criteria.match(book1);
        checkTestResult(realResult, true, "And Search Criteria Test 1");
    }

    public void andSearchCriteriaTest2() {
        Book book1 = new Book("F. Scott Fitzgerald", "The Great Gatsby");
        Book book2 = new Book("Leo Tolstoy", "War and Peace");
        Book book3 = new Book("Gustave Flaubert", "Madame Bovary");
        book1.setYearOfIssue("1925");
        book2.setYearOfIssue("1867");
        book3.setYearOfIssue("1856");
        AndSearchCriteria criteria = new AndSearchCriteria(new AuthorSearchCriteria("Leo Tolstoy"), new TitleSearchCriteria("War and Peace"));
        boolean realResult = criteria.match(book2);
        checkTestResult(realResult, true, "And Search Criteria Test 2");
    }

    public void andSearchCriteriaTest3() {
        Book book1 = new Book("F. Scott Fitzgerald", "The Great Gatsby");
        Book book2 = new Book("Leo Tolstoy", "War and Peace");
        Book book3 = new Book("Gustave Flaubert", "Madame Bovary");
        book1.setYearOfIssue("1925");
        book2.setYearOfIssue("1867");
        book3.setYearOfIssue("1856");
        AndSearchCriteria criteria = new AndSearchCriteria(new AuthorSearchCriteria("Gustave Flaubert"), new TitleSearchCriteria("Madame Bovary"));
        boolean realResult = criteria.match(book1);
        checkTestResult(realResult, false, "And Search Criteria Test 3");
    }

    public void checkTestResult(boolean realResult, boolean expectedResult, String testName) {
        if (realResult == expectedResult) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FALSE");
        }
    }
}
