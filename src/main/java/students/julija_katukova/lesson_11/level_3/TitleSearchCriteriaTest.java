package students.julija_katukova.lesson_11.level_3;

class TitleSearchCriteriaTest {

    public static void main(String[] args) {
        TitleSearchCriteriaTest titleSearchCriteriaTest = new TitleSearchCriteriaTest();
        titleSearchCriteriaTest.test1();
        titleSearchCriteriaTest.test2();
        titleSearchCriteriaTest.test3();
    }

    private void test1() {
        Book book1 = new Book("Marcel Proust", "In Search of Lost Time");
        TitleSearchCriteria titleSearchCriteria = new TitleSearchCriteria("In Search of Lost Time");
        boolean realResult = titleSearchCriteria.match(book1);
        check(realResult, true, "Test1");
    }

    private void test2() {
        Book book1 = new Book("Marcel Proust", "In Search of Lost Time");
        Book book2 = new Book("Fyodor Dostoyevsky", "Crime and Punishment");
        TitleSearchCriteria titleSearchCriteria = new TitleSearchCriteria("Crime and Punishment");
        boolean realResult = titleSearchCriteria.match(book2);
        check(realResult, true, "Test2");
    }

    private void test3() {
        Book book1 = new Book("Marcel Proust", "In Search of Lost Time");
        Book book2 = new Book("Fyodor Dostoyevsky", "Crime and Punishment");
        TitleSearchCriteria titleSearchCriteria = new TitleSearchCriteria("Crime and Punishment");
        boolean realResult = titleSearchCriteria.match(book1);
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
