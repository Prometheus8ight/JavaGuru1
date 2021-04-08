package students.alex_kalashnikov.lesson_11.level_3.all_tasks;

class AuthorSearchCriteriaTest {

    public static void main(String[] args) {

        AuthorSearchCriteriaTest newTest = new AuthorSearchCriteriaTest();
        newTest.testAuthorSearchCriteria1();
        newTest.testAuthorSearchCriteria2();

    }

    void test(boolean expectedResult, boolean realResult) {
        if (expectedResult == realResult) {
            System.out.println("Test is OK");
        } else {
            System.out.println("Test is FAILED!");
        }
    }

    void testAuthorSearchCriteria1() {
        AuthorSearchCriteria authorSearchCriteria = new AuthorSearchCriteria("A2");
        test(true, authorSearchCriteria.match(new Book("A2", "B2", "2000")));
    }

    void testAuthorSearchCriteria2() {
        AuthorSearchCriteria authorSearchCriteria = new AuthorSearchCriteria("A1");
        test(false, authorSearchCriteria.match(new Book("A2", "B2", "2001")));
    }

}