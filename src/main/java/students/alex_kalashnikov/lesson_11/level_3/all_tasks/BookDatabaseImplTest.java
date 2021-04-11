package students.alex_kalashnikov.lesson_11.level_3.all_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class BookDatabaseImplTest {

    public static void main(String[] args) {

        BookDatabaseImplTest newTest = new BookDatabaseImplTest();
        newTest.testSearchCriteria1();
        newTest.testSearchCriteria2();
        newTest.testSearchCriteria3();
        newTest.testSearchCriteria4();
        newTest.testSearchCriteria5();
        newTest.testSearchCriteria6();
        newTest.testSearchCriteria7();
        newTest.testSearchCriteria8();
        newTest.testSearchCriteria9();
        newTest.testSearchCriteria10();

    }

    void test(List<Book> expectedResult, List<Book> realResult) {
        if (Arrays.equals(expectedResult.toArray(), realResult.toArray())) {
            System.out.println("Test is OK!");
        } else {
            System.out.println("Test is FAILED!");
        }
    }

    void testSearchCriteria1() {
        BookDatabaseImpl victim = new BookDatabaseImpl();
        victim.save(new Book("A1", "B1", "2000"));
        victim.save(new Book("A2", "B2", "2001"));
        victim.save(new Book("A3", "B3", "2002"));
        victim.save(new Book("A4", "B4", "2003"));
        victim.save(new Book("A5", "B5", "2004"));
        List<Book> expectedResult = new ArrayList();
        expectedResult.add(new Book("A1", "B1", "2000"));
        test(expectedResult, victim.find(new AndSearchCriteria(new AuthorSearchCriteria("A1"),
                new TitleSearchCriteria("B1"))));
//        System.out.println(expectedResult);
//        System.out.println(victim.find(new AndSearchCriteria(new AuthorSearchCriteria("A1"),
//                new TitleSearchCriteria("B1"))));
    }

    void testSearchCriteria2() {
        BookDatabaseImpl victim = new BookDatabaseImpl();
        victim.save(new Book("A1", "B1", "2000"));
        victim.save(new Book("A2", "B2", "2001"));
        victim.save(new Book("A3", "B3", "2002"));
        victim.save(new Book("A4", "B4", "2003"));
        victim.save(new Book("A5", "B5", "2004"));
        List<Book> expectedResult = new ArrayList();
        expectedResult.add(new Book("A5", "B5", "2002"));
        test(expectedResult, victim.find(new AndSearchCriteria(new AuthorSearchCriteria("A5"),
                new TitleSearchCriteria("B5"))));
    }

    void testSearchCriteria3() {
        BookDatabaseImpl victim = new BookDatabaseImpl();
        victim.save(new Book("A1", "B1", "2000"));
        victim.save(new Book("A2", "B2", "2001"));
        victim.save(new Book("A3", "B3", "2002"));
        victim.save(new Book("A4", "B4", "2003"));
        victim.save(new Book("A5", "B5", "2004"));
        List<Book> expectedResult = new ArrayList();
        test(expectedResult, victim.find(new AndSearchCriteria(new AuthorSearchCriteria("A11"),
                new TitleSearchCriteria("B11"))));
    }

    void testSearchCriteria4() {
        BookDatabaseImpl victim = new BookDatabaseImpl();
        victim.save(new Book("A1", "B1", "2000"));
        victim.save(new Book("A2", "B2", "2001"));
        victim.save(new Book("A3", "B3", "2002"));
        victim.save(new Book("A4", "B4", "2003"));
        victim.save(new Book("A1", "B1", "2004"));
        List<Book> expectedResult = new ArrayList();
        expectedResult.add(new Book("A1", "B1", "2002"));
        expectedResult.add(new Book("A1", "B1", "2005"));
        test(expectedResult, victim.find(new AndSearchCriteria(new AuthorSearchCriteria("A1"),
                new TitleSearchCriteria("B1"))));
    }

    void testSearchCriteria5() {
        BookDatabaseImpl victim = new BookDatabaseImpl();
        victim.save(new Book("A1", "B1", "2000"));
        victim.save(new Book("A2", "B2", "2001"));
        victim.save(new Book("A3", "B3", "2002"));
        victim.save(new Book("A4", "B4", "2003"));
        victim.save(new Book("A1", "B1", "2004"));
        victim.delete(1L);
        List<Book> expectedResult = new ArrayList();
        expectedResult.add(new Book("A1", "B1", "2004"));
        test(expectedResult, victim.find(new AndSearchCriteria(new AuthorSearchCriteria("A1"),
                new TitleSearchCriteria("B1"))));
    }

    void testSearchCriteria6() {
        BookDatabaseImpl victim = new BookDatabaseImpl();
        victim.save(new Book("A1", "B1", "2000"));
        victim.save(new Book("A2", "B2", "2001"));
        victim.save(new Book("A1", "B3", "2000"));
        victim.save(new Book("A4", "B4", "2003"));
        victim.save(new Book("A1", "B5", "2000"));
        List<Book> expectedResult = new ArrayList();
        expectedResult.add(new Book("A1", "B1", "2000"));
        expectedResult.add(new Book("A1", "B3", "2005"));
        expectedResult.add(new Book("A1", "B5", "2010"));
        test(expectedResult, victim.find(new AndSearchCriteria(new AuthorSearchCriteria("A1"),
                new YearOfIssueSearchCriteria("2000"))));
    }

    void testSearchCriteria7() {
        BookDatabaseImpl victim = new BookDatabaseImpl();
        victim.save(new Book("A1", "B1", "2000"));
        victim.save(new Book("A2", "B2", "2001"));
        victim.save(new Book("A3", "B3", "2002"));
        victim.save(new Book("A4", "B4", "2003"));
        victim.save(new Book("A5", "B5", "2004"));
        List<Book> expectedResult = new ArrayList();
        expectedResult.add(new Book("A1", "B1", "2000"));
        test(expectedResult, victim.find(new OrSearchCriteria(new AuthorSearchCriteria("A1"),
                new TitleSearchCriteria("B11"))));
    }

    void testSearchCriteria8() {
        BookDatabaseImpl victim = new BookDatabaseImpl();
        victim.save(new Book("A1", "B1", "2000"));
        victim.save(new Book("A2", "B2", "2001"));
        victim.save(new Book("A3", "B3", "2002"));
        victim.save(new Book("A4", "B4", "2003"));
        victim.save(new Book("A5", "B5", "2004"));
        List<Book> expectedResult = new ArrayList();
        expectedResult.add(new Book("A3", "B3", "2002"));
        test(expectedResult, victim.find(new OrSearchCriteria(new AuthorSearchCriteria("A11"),
                new TitleSearchCriteria("B3"))));
    }

    void testSearchCriteria9() {
        BookDatabaseImpl victim = new BookDatabaseImpl();
        victim.save(new Book("A1", "B1", "2000"));
        victim.save(new Book("A2", "B2", "2001"));
        victim.save(new Book("A3", "B3", "2002"));
        victim.save(new Book("A4", "B4", "2003"));
        victim.save(new Book("A1", "B5", "2004"));
        List<Book> expectedResult = new ArrayList();
        expectedResult.add(new Book("A1", "B1", "2000"));
        expectedResult.add(new Book("A3", "B3", "2002"));
        expectedResult.add(new Book("A1", "B5", "2004"));
        test(expectedResult, victim.find(new OrSearchCriteria(new AuthorSearchCriteria("A1"),
                new TitleSearchCriteria("B3"))));
    }

    void testSearchCriteria10() {
        BookDatabaseImpl victim = new BookDatabaseImpl();
        victim.save(new Book("A1", "B1", "2000"));
        victim.save(new Book("A2", "B2", "2001"));
        victim.save(new Book("A3", "B3", "2002"));
        victim.save(new Book("A4", "B4", "2003"));
        victim.save(new Book("A5", "B5", "2004"));
        List<Book> expectedResult = new ArrayList();
        test(expectedResult, victim.find(new OrSearchCriteria(new AuthorSearchCriteria("A11"),
                new TitleSearchCriteria("B11"))));
    }

}