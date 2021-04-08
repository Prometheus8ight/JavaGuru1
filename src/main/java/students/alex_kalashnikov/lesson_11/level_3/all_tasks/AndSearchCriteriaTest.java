package students.alex_kalashnikov.lesson_11.level_3.all_tasks;

class AndSearchCriteriaTest {

    public static void main(String[] args) {

        AndSearchCriteriaTest andSearchCriteriaTest = new AndSearchCriteriaTest();
        andSearchCriteriaTest.testAndSearchCriteria1();
        andSearchCriteriaTest.testAndSearchCriteria2();
        andSearchCriteriaTest.testAndSearchCriteria3();
        andSearchCriteriaTest.testAndSearchCriteria4();
        andSearchCriteriaTest.testAndSearchCriteria5();
        andSearchCriteriaTest.testAndSearchCriteria6();

    }

    void test(boolean expectedResult, boolean realResult) {
        if (expectedResult == realResult) {
            System.out.println("Test is OK");
        } else {
            System.out.println("Test is FAILED!");
        }
    }

    void testAndSearchCriteria1() {
        AndSearchCriteria victim = new AndSearchCriteria(new AuthorSearchCriteria("A2"),
                new TitleSearchCriteria("B1"));
        test(true, victim.match(new Book("A2", "B1", "2005")));
    }

    void testAndSearchCriteria2() {
        AndSearchCriteria victim = new AndSearchCriteria(new AuthorSearchCriteria("A2"),
                new TitleSearchCriteria("B2"));
        test(false, victim.match(new Book("A2", "B1", "2005")));
    }

    void testAndSearchCriteria3() {
        AndSearchCriteria victim = new AndSearchCriteria(new AuthorSearchCriteria("A2"),
                new TitleSearchCriteria("B2"));
        test(false, victim.match(new Book("A1", "B2", "2005")));
    }

    void testAndSearchCriteria4() {
        AndSearchCriteria victim = new AndSearchCriteria(new AuthorSearchCriteria("A2"),
                new TitleSearchCriteria("B2"));
        test(false, victim.match(new Book("A1", "B1", "2005")));
    }

    void testAndSearchCriteria5() {
        AndSearchCriteria victim = new AndSearchCriteria(new AuthorSearchCriteria("A2"),
                new YearOfIssueSearchCriteria("2005"));
        test(false, victim.match(new Book("A1", "B1", "2005")));
    }

    void testAndSearchCriteria6() {
        AndSearchCriteria victim = new AndSearchCriteria(new AuthorSearchCriteria("A2"),
                new YearOfIssueSearchCriteria("2005"));
        test(true, victim.match(new Book("A2", "B1", "2005")));
    }

}