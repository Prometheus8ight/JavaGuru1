package students.julija_katukova.lesson_11.level_3;

class AndSearchCriteriaTest {

    public static void main(String[] args) {
        AndSearchCriteriaTest titleSearchCriteriaTest = new AndSearchCriteriaTest();
        titleSearchCriteriaTest.test1();
        titleSearchCriteriaTest.test2();
        titleSearchCriteriaTest.test3();
        titleSearchCriteriaTest.test4();
        titleSearchCriteriaTest.test5();
        titleSearchCriteriaTest.test6();
        titleSearchCriteriaTest.test7();
        titleSearchCriteriaTest.test8();
        titleSearchCriteriaTest.test9();
        titleSearchCriteriaTest.test10();
        titleSearchCriteriaTest.test11();
        titleSearchCriteriaTest.test12();
    }

    private void test1() {
        Book book1 = new Book("Marcel Proust", "In Search of Lost Time");
        book1.setYearOfIssue("1913");
        AndSearchCriteria andSearchCriteria = new AndSearchCriteria(new AuthorSearchCriteria("Marcel Proust"), new TitleSearchCriteria("In Search of Lost Time"));
        boolean realResult = andSearchCriteria.match(book1);
        check(realResult, true, "Test1");
    }

    private void test2() {
        Book book1 = new Book("Marcel Proust", "In Search of Lost Time");
        book1.setYearOfIssue("1913");
        AndSearchCriteria andSearchCriteria = new AndSearchCriteria(new AuthorSearchCriteria("Marcel Proust"), new TitleSearchCriteria("Crime and Punishment"));
        boolean realResult = andSearchCriteria.match(book1);
        check(realResult, false, "Test2");
    }

    private void test3() {
        Book book1 = new Book("Marcel Proust", "In Search of Lost Time");
        book1.setYearOfIssue("1913");
        AndSearchCriteria andSearchCriteria = new AndSearchCriteria(new AuthorSearchCriteria("Fyodor Dostoyevsky"), new TitleSearchCriteria("In Search of Lost Time"));
        boolean realResult = andSearchCriteria.match(book1);
        check(realResult, false, "Test3");
    }

    private void test4() {
        Book book1 = new Book("Marcel Proust", "In Search of Lost Time");
        book1.setYearOfIssue("1913");
        AndSearchCriteria andSearchCriteria = new AndSearchCriteria(new AuthorSearchCriteria("Marcel Proust"), new YearOfIssueSearchCriteria("1913"));
        boolean realResult = andSearchCriteria.match(book1);
        check(realResult, true, "Test4");
    }

    private void test5() {
        Book book1 = new Book("Marcel Proust", "In Search of Lost Time");
        book1.setYearOfIssue("1913");
        AndSearchCriteria andSearchCriteria = new AndSearchCriteria(new AuthorSearchCriteria("Marcel Proust"), new YearOfIssueSearchCriteria("1914"));
        boolean realResult = andSearchCriteria.match(book1);
        check(realResult, false, "Test5");
    }

    private void test6() {
        Book book1 = new Book("Marcel Proust", "In Search of Lost Time");
        book1.setYearOfIssue("1913");
        AndSearchCriteria andSearchCriteria = new AndSearchCriteria(new AuthorSearchCriteria("Fyodor Dostoyevsky"), new YearOfIssueSearchCriteria("1913"));
        boolean realResult = andSearchCriteria.match(book1);
        check(realResult, false, "Test6");
    }

    private void test7() {
        Book book1 = new Book("Marcel Proust", "In Search of Lost Time");
        book1.setYearOfIssue("1913");
        AndSearchCriteria andSearchCriteria = new AndSearchCriteria(new TitleSearchCriteria("In Search of Lost Time"), new YearOfIssueSearchCriteria("1913"));
        boolean realResult = andSearchCriteria.match(book1);
        check(realResult, true, "Test7");
    }

    private void test8() {
        Book book1 = new Book("Marcel Proust", "In Search of Lost Time");
        book1.setYearOfIssue("1913");
        AndSearchCriteria andSearchCriteria = new AndSearchCriteria(new TitleSearchCriteria("In Search of Lost Time"), new YearOfIssueSearchCriteria("1914"));
        boolean realResult = andSearchCriteria.match(book1);
        check(realResult, false, "Test8");
    }

    private void test9() {
        Book book1 = new Book("Marcel Proust", "In Search of Lost Time");
        book1.setYearOfIssue("1913");
        AndSearchCriteria andSearchCriteria = new AndSearchCriteria(new TitleSearchCriteria("Crime and Punishment"), new YearOfIssueSearchCriteria("1913"));
        boolean realResult = andSearchCriteria.match(book1);
        check(realResult, false, "Test9");
    }

    private void test10() {
        Book book1 = new Book("Marcel Proust", "In Search of Lost Time");
        book1.setYearOfIssue("1913");
        AndSearchCriteria andSearchCriteria = new AndSearchCriteria(new TitleSearchCriteria("Crime and Punishment"), new YearOfIssueSearchCriteria("2000"));
        boolean realResult = andSearchCriteria.match(book1);
        check(realResult, false, "Test10");
    }

    private void test11() {
        Book book1 = new Book("Marcel Proust", "In Search of Lost Time");
        book1.setYearOfIssue("1913");
        AndSearchCriteria andSearchCriteria = new AndSearchCriteria(new AuthorSearchCriteria("Fyodor Dostoyevsky"), new YearOfIssueSearchCriteria("2000"));
        boolean realResult = andSearchCriteria.match(book1);
        check(realResult, false, "Test11");
    }

    private void test12() {
        Book book1 = new Book("Marcel Proust", "In Search of Lost Time");
        book1.setYearOfIssue("1913");
        AndSearchCriteria andSearchCriteria = new AndSearchCriteria(new AuthorSearchCriteria("Fyodor Dostoyevsky"), new TitleSearchCriteria("Crime and Punishment"));
        boolean realResult = andSearchCriteria.match(book1);
        check(realResult, false, "Test12");
    }

    private void check(boolean realResult, boolean expectedResult, String testName) {
        if (realResult == expectedResult) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
}
