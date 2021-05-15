package students.rodion_afanasjev.lesson_11.level_3.task_15;

class AuthorSearchCriteriaTest {

    public static void main(String[] args) {

        AuthorSearchCriteriaTest authorSearchCriteriaTest = new AuthorSearchCriteriaTest();
        authorSearchCriteriaTest.authorCriteriaTrueTest();
        authorSearchCriteriaTest.authorCriteriaFailTest();

    }

    public void authorCriteriaTrueTest(){
        AuthorSearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Slava");
        Book book = new Book("Slava","KPSS");
        boolean realResult = authorSearchCriteria.match(book);
        check(realResult, true, "authorCriteriaTrueTest");
    }

    public void authorCriteriaFailTest(){
        AuthorSearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Morgen");
        Book book = new Book("Slava","KPSS");
        boolean realResult = authorSearchCriteria.match(book);
        check(realResult, false, "authorCriteriaFailTest");
    }

    public void check(boolean realResult, boolean expectedResult, String testName) {
        if (realResult == expectedResult) {
            System.out.println(testName + " : OK");
        } else {
            System.out.println(testName + " : FAIL");
        }
    }

}
