package students.alex_kalashnikov.lesson_11.level_3.all_tasks;

class TitleSearchCriteriaTest {

    public static void main(String[] args) {

        TitleSearchCriteriaTest newTest = new TitleSearchCriteriaTest();
        newTest.testTitleSearchCriteria1();
        newTest.testTitleSearchCriteria2();

    }

    void test(boolean expectedResult, boolean realResult) {
        if (expectedResult == realResult) {
            System.out.println("Test is OK");
        }
        else {
            System.out.println("Test is FAILED!");
        }
    }

    void testTitleSearchCriteria1() {
        TitleSearchCriteria titleSearchCriteria = new TitleSearchCriteria("B2");
        test(true, titleSearchCriteria.match(new Book("A2", "B2", "2000")));
    }

    void testTitleSearchCriteria2() {
        TitleSearchCriteria titleSearchCriteria = new TitleSearchCriteria("B1");
        test(false, titleSearchCriteria.match(new Book("A2", "B2", "2001")));
    }

}