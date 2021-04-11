package students.alex_kalashnikov.lesson_11.level_3.all_tasks;

class OrSearchCriteriaTest {

    public static void main(String[] args) {

        OrSearchCriteriaTest newTest = new OrSearchCriteriaTest();
        newTest.testOrSearchCriteria1();
        newTest.testOrSearchCriteria2();
        newTest.testOrSearchCriteria3();
        newTest.testOrSearchCriteria4();
        newTest.testOrSearchCriteria5();
        newTest.testOrSearchCriteria6();

    }

    void test(boolean expectedResult, boolean realResult) {
        if (expectedResult == realResult) {
            System.out.println("Test is OK");
        } else {
            System.out.println("Test is FAILED!");
        }
    }

    void testOrSearchCriteria1() {
        OrSearchCriteria victim = new OrSearchCriteria(new AuthorSearchCriteria("A2"),
                new TitleSearchCriteria("B2"));
        test(true, victim.match(new Book("A2", "B2", "2005")));
    }

    void testOrSearchCriteria2() {
        OrSearchCriteria victim = new OrSearchCriteria(new AuthorSearchCriteria("A2"),
                new TitleSearchCriteria("B2"));
        test(true, victim.match(new Book("A2", "B1", "2005")));
    }

    void testOrSearchCriteria3() {
        OrSearchCriteria victim = new OrSearchCriteria(new AuthorSearchCriteria("A2"),
                new TitleSearchCriteria("B2"));
        test(true, victim.match(new Book("A1", "B2", "2005")));
    }

    void testOrSearchCriteria4() {
        OrSearchCriteria victim = new OrSearchCriteria(new AuthorSearchCriteria("A2"),
                new TitleSearchCriteria("B2"));
        test(false, victim.match(new Book("A1", "B1", "2005")));
    }

    void testOrSearchCriteria5() {
        OrSearchCriteria victim = new OrSearchCriteria(new YearOfIssueSearchCriteria("2005"),
                new TitleSearchCriteria("B2"));
        test(true, victim.match(new Book("A1", "B1", "2005")));
    }

    void testOrSearchCriteria6() {
        OrSearchCriteria victim = new OrSearchCriteria(new YearOfIssueSearchCriteria("2005"),
                new TitleSearchCriteria("B2"));
        test(false, victim.match(new Book("A1", "B1", "2004")));
    }

}