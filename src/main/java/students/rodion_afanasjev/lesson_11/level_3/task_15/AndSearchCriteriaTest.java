package students.rodion_afanasjev.lesson_11.level_3.task_15;

class AndSearchCriteriaTest {

    public static void main(String[] args) {

        AndSearchCriteriaTest andSearchCriteriaTest = new AndSearchCriteriaTest();
        andSearchCriteriaTest.andCriteriaTrueTest();
        andSearchCriteriaTest.andCriteriaTrue2Test();
        andSearchCriteriaTest.andCriteriaFalseTest();

    }

    public void andCriteriaTrueTest(){
        AndSearchCriteria andSearchCriteria = new AndSearchCriteria(new AuthorSearchCriteria("Slava"), new TitleSearchCriteria("KPSS"));
        Book book = new Book("Slava", "KPSS");
        boolean realResult = andSearchCriteria.match(book);
        check(realResult, true, "andCriteriaTrueTest");
    }

    public void andCriteriaTrue2Test(){
        AndSearchCriteria andSearchCriteria = new AndSearchCriteria(new AuthorSearchCriteria("Slava"), new YearOfIssueSearchCriteria("2021"));
        Book book = new Book("Slava", "KPSS");
        book.setYearOfIssue("2021");
        boolean realResult = andSearchCriteria.match(book);
        check(realResult, true, "andCriteriaTrueTest");
    }

    public void andCriteriaFalseTest(){
        AndSearchCriteria andSearchCriteria = new AndSearchCriteria(new AuthorSearchCriteria("Slava"), new TitleSearchCriteria("Salat"));
        Book book = new Book("Slava", "KPSS");
        boolean realResult = andSearchCriteria.match(book);
        check(realResult, false, "andCriteriaFalseTest");
    }

    public void check(boolean realResult, boolean expectedResult, String testName) {
        if (realResult == expectedResult) {
            System.out.println(testName + " : OK");
        } else {
            System.out.println(testName + " : FAIL");
        }
    }

}
