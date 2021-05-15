package students.rodion_afanasjev.lesson_11.level_3.task_15;

class TitleSearchCriteriaTest {

    public static void main(String[] args) {

        TitleSearchCriteriaTest titleSearchCriteriaTest = new TitleSearchCriteriaTest();
        titleSearchCriteriaTest.titleCriteriaTrueTest();
        titleSearchCriteriaTest.titleCriteriaFailTest();

    }

    public void titleCriteriaTrueTest(){
        TitleSearchCriteria titleSearchCriteria = new TitleSearchCriteria("KPSS");
        Book book = new Book("Slava","KPSS");
        boolean realResult = titleSearchCriteria.match(book);
        check(realResult, true, "titleCriteriaTrueTest");
    }

    public void titleCriteriaFailTest(){
        TitleSearchCriteria titleSearchCriteria = new TitleSearchCriteria("Rasol");
        Book book = new Book("Slava","KPSS");
        boolean realResult = titleSearchCriteria.match(book);
        check(realResult, false, "titleCriteriaFailTest");
    }

    public void check(boolean realResult, boolean expectedResult, String testName) {
        if (realResult == expectedResult) {
            System.out.println(testName + " : OK");
        } else {
            System.out.println(testName + " : FAIL");
        }
    }

}
