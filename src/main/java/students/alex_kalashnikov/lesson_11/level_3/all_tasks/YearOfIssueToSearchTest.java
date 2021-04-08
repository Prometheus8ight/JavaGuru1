package students.alex_kalashnikov.lesson_11.level_3.all_tasks;

class YearOfIssueToSearchTest {

    public static void main(String[] args) {

        YearOfIssueToSearchTest yearOfIssueToSearchTest = new YearOfIssueToSearchTest();
        yearOfIssueToSearchTest.testYearOfIssueToSearch1();
        yearOfIssueToSearchTest.testYearOfIssueToSearch2();

    }

    void test(boolean expectedResult, boolean realResult) {
        if (expectedResult == realResult) {
            System.out.println("Test is OK");
        }
        else {
            System.out.println("Test is FAILED!");
        }
    }

    void testYearOfIssueToSearch1() {
        YearOfIssueSearchCriteria yearOfIssueSearchCriteria = new YearOfIssueSearchCriteria("2001");
        test(true, yearOfIssueSearchCriteria.match(new Book("A2", "B2", "2001")));
    }

    void testYearOfIssueToSearch2() {
        YearOfIssueSearchCriteria yearOfIssueSearchCriteria = new YearOfIssueSearchCriteria("2002");
        test(false, yearOfIssueSearchCriteria.match(new Book("A2", "B2", "2003")));
    }

}