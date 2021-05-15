package students.rodion_afanasjev.lesson_11.level_3.task_15;

class YearOfIssueSearchCriteriaTest {

    public static void main(String[] args) {

        YearOfIssueSearchCriteriaTest yearOfIssueSearchCriteriaTest = new YearOfIssueSearchCriteriaTest();
        yearOfIssueSearchCriteriaTest.yearCriteriaTrueTest();
        yearOfIssueSearchCriteriaTest.yearCriteriaFalseTest();

    }

    public void yearCriteriaTrueTest(){
        YearOfIssueSearchCriteria yearOfIssueSearchCriteria = new YearOfIssueSearchCriteria("2021");
        Book book = new Book("Slava", "KPSS");
        book.setYearOfIssue("2021");
        boolean realResult = yearOfIssueSearchCriteria.match(book);
        check(realResult, true, "yearCriteriaTrueTest");
    }

    public void yearCriteriaFalseTest(){
        YearOfIssueSearchCriteria yearOfIssueSearchCriteria = new YearOfIssueSearchCriteria("2021");
        Book book = new Book("Slava", "KPSS");
        book.setYearOfIssue("2022");
        boolean realResult = yearOfIssueSearchCriteria.match(book);
        check(realResult, false, "yearCriteriaFalseTest");
    }

    public void check(boolean realResult, boolean expectedResult, String testName) {
        if (realResult == expectedResult) {
            System.out.println(testName + " : OK");
        } else {
            System.out.println(testName + " : FAIL");
        }
    }

}
