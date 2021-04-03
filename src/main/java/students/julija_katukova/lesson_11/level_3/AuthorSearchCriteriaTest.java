package students.julija_katukova.lesson_11.level_3;

class AuthorSearchCriteriaTest {

    public static void main(String[] args) {
        AuthorSearchCriteriaTest authorSearchCriteriaTest = new AuthorSearchCriteriaTest();
        authorSearchCriteriaTest.test1();
        authorSearchCriteriaTest.test2();
        authorSearchCriteriaTest.test3();
    }

    private void test1() {
        Book book1 = new Book("Marcel Proust", "In Search of Lost Time");
        AuthorSearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Marcel Proust");
        boolean realResult = authorSearchCriteria.match(book1);
        check(realResult, true, "Test1");
    }

    private void test2() {
        Book book1 = new Book("Marcel Proust", "In Search of Lost Time");
        Book book2 = new Book("Fyodor Dostoyevsky", "Crime and Punishment");
        AuthorSearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Fyodor Dostoyevsky");
        boolean realResult = authorSearchCriteria.match(book2);
        check(realResult, true, "Test2");
    }

    private void test3() {
        Book book1 = new Book("Marcel Proust", "In Search of Lost Time");
        Book book2 = new Book("Fyodor Dostoyevsky", "Crime and Punishment");
        AuthorSearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Fyodor Dostoyevsky");
        boolean realResult = authorSearchCriteria.match(book1);
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
