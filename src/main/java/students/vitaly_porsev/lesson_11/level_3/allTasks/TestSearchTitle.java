package students.vitaly_porsev.lesson_11.level_3.allTasks;

public class TestSearchTitle {
    public static void main(String[] args) {
        TestSearchTitle method = new TestSearchTitle();
        method.TitleSearchTest();
        method.TitleSearchTestFalse();
    }

    void TitleSearchTest() {
        SearchCriteria title = new TitleSearchCriteria("Doctor Sleep");
        Book book = new Book("Stephen King", "Doctor Sleep", "2013");
        check(true, title.match(book), "TitleSearchTest");
    }

    void TitleSearchTestFalse() {
        SearchCriteria title = new TitleSearchCriteria("Doctor Who");
        Book book = new Book("Stephen King", "Doctor Sleep", "2013");
        check(false, title.match(book), "TitleSearchTest");
    }

    private void check(boolean expectedResult, boolean realResult, String testName) {
        if (expectedResult == realResult) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - FALSE");
        }
    }
}
