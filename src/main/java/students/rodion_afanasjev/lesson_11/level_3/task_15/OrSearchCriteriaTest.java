package students.rodion_afanasjev.lesson_11.level_3.task_15;

class OrSearchCriteriaTest {

    public static void main(String[] args) {

        OrSearchCriteriaTest orSearchCriteriaTest = new OrSearchCriteriaTest();
        orSearchCriteriaTest.orCriteriaTrueTest();
        orSearchCriteriaTest.orCriteriaFalseTest();

    }

    public void orCriteriaTrueTest(){
        OrSearchCriteria orSearchCriteria = new OrSearchCriteria(new AuthorSearchCriteria("Slava"), new TitleSearchCriteria("Salat"));
        Book book = new Book("Slava", "KPSS");
        boolean realResult = orSearchCriteria.match(book);
        check(realResult, true, "orCriteriaTrueTest");
    }

    public void orCriteriaFalseTest(){
        OrSearchCriteria orSearchCriteria = new OrSearchCriteria(new AuthorSearchCriteria("Morgen"), new TitleSearchCriteria("Salat"));
        Book book = new Book("Slava", "KPSS");
        boolean realResult = orSearchCriteria.match(book);
        check(realResult, false, "orCriteriaTrueTest");
    }

    public void check(boolean realResult, boolean expectedResult, String testName) {
        if (realResult == expectedResult) {
            System.out.println(testName + " : OK");
        } else {
            System.out.println(testName + " : FAIL");
        }
    }

}
