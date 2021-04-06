package students.deniss_jankovskis.lesson_11.level_3;

class AuthorSearchCriteriaTest {

    public static void main(String[] args) {

        AuthorSearchCriteriaTest test = new AuthorSearchCriteriaTest();
        test.authorSearchCriteriaTest1();
        test.authorSearchCriteriaTest2();
        test.authorSearchCriteriaTest3();
    }

    public void authorSearchCriteriaTest1() {
        Book book1 = new Book("F. Scott Fitzgerald", "The Great Gatsby");
        Book book2 = new Book("Leo Tolstoy", "War and Peace");
        Book book3 = new Book("Gustave Flaubert", "Madame Bovary");
        AuthorSearchCriteria authorSearchCriteria = new AuthorSearchCriteria("F. Scott Fitzgerald");
        boolean realResult = authorSearchCriteria.match(book1);
        checkTestResult(realResult, true, "Author Search Criteria Test 1");
    }

    public void authorSearchCriteriaTest2() {
        Book book1 = new Book("F. Scott Fitzgerald", "The Great Gatsby");
        Book book2 = new Book("Leo Tolstoy", "War and Peace");
        Book book3 = new Book("Gustave Flaubert", "Madame Bovary");
        AuthorSearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Leo Tolstoy");
        boolean realResult = authorSearchCriteria.match(book2);
        checkTestResult(realResult, true, "Author Search Criteria Test 2");
    }

    public void authorSearchCriteriaTest3() {
        Book book1 = new Book("F. Scott Fitzgerald", "The Great Gatsby");
        Book book2 = new Book("Leo Tolstoy", "War and Peace");
        Book book3 = new Book("Gustave Flaubert", "Madame Bovary");
        AuthorSearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Gustave Flaubert");
        boolean realResult = authorSearchCriteria.match(book1);
        checkTestResult(realResult, false, "Author Search Criteria Test 3");
    }

    public void checkTestResult(boolean realResult, boolean expectedResult, String testName) {
        if (realResult == expectedResult) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FALSE");
        }
    }
}
