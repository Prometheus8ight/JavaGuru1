package students.deniss_jankovskis.lesson_11.level_3;

class TitleSearchCriteriaTest {

    public static void main(String[] args) {

        TitleSearchCriteriaTest test = new TitleSearchCriteriaTest();
        test.titleSearchCriteriaTest1();
        test.titleSearchCriteriaTest2();
        test.titleSearchCriteriaTest3();
    }

    public void titleSearchCriteriaTest1() {
        Book book1 = new Book("F. Scott Fitzgerald", "The Great Gatsby");
        Book book2 = new Book("Leo Tolstoy", "War and Peace");
        Book book3 = new Book("Gustave Flaubert", "Madame Bovary");
        TitleSearchCriteria titleSearchCriteria = new TitleSearchCriteria("The Great Gatsby");
        boolean realResult = titleSearchCriteria.match(book1);
        checkTestResult(realResult, true, "Title Search Criteria Test 1");
    }

    public void titleSearchCriteriaTest2() {
        Book book1 = new Book("F. Scott Fitzgerald", "The Great Gatsby");
        Book book2 = new Book("Leo Tolstoy", "War and Peace");
        Book book3 = new Book("Gustave Flaubert", "Madame Bovary");
        TitleSearchCriteria titleSearchCriteria = new TitleSearchCriteria("War and Peace");
        boolean realResult = titleSearchCriteria.match(book2);
        checkTestResult(realResult, true, "Title Search Criteria Test 2");
    }

    public void titleSearchCriteriaTest3() {
        Book book1 = new Book("F. Scott Fitzgerald", "The Great Gatsby");
        Book book2 = new Book("Leo Tolstoy", "War and Peace");
        Book book3 = new Book("Gustave Flaubert", "Madame Bovary");
        TitleSearchCriteria titleSearchCriteria = new TitleSearchCriteria("Madame Bovary");
        boolean realResult = titleSearchCriteria.match(book1);
        checkTestResult(realResult, false, "Title Search Criteria Test 3");
    }

    public void checkTestResult(boolean realResult, boolean expectedResult, String testName) {
        if (realResult == expectedResult) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FALSE");
        }
    }
}
