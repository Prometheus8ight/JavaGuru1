package students.alex_kalashnikov.lesson_11.level_4.task_23_26;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class FindUniqueBooksTest {

    public static void main(String[] args) {

        FindUniqueBooksTest newTest = new FindUniqueBooksTest();
        newTest.testFindUniqueBooks1();
        newTest.testFindUniqueBooks2();
        newTest.testFindUniqueBooks3();
        newTest.testFindUniqueBooks4();

    }

    void test(Set<Book> expectedResult, Set<Book> realResult) {
        if (Arrays.equals(expectedResult.toArray(), realResult.toArray())) {
            System.out.println("Test is OK!");
        } else {
            System.out.println("Test is FAILED!");
        }
    }

    void testFindUniqueBooks1() {
        BookDatabaseImpl victim = new BookDatabaseImpl();
        victim.save(new Book("A1", "B1", "2000"));
        victim.save(new Book("A2", "B2", "2001"));
        victim.save(new Book("A3", "B3", "2002"));
        victim.save(new Book("A4", "B4", "2003"));
        victim.save(new Book("A5", "B5", "2004"));
        Set<Book> expectedResult = new HashSet<>();
        expectedResult.add(new Book("A1", "B1", "2000"));
        expectedResult.add(new Book("A2", "B2", "2001"));
        expectedResult.add(new Book("A3", "B3", "2002"));
        expectedResult.add(new Book("A4", "B4", "2003"));
        expectedResult.add(new Book("A5", "B5", "2004"));
        test(expectedResult, victim.findUniqueBooks());
    }

    void testFindUniqueBooks2() {
        BookDatabaseImpl victim = new BookDatabaseImpl();
        victim.save(new Book("A1", "B1", "2000"));
        victim.save(new Book("A2", "B2", "2001"));
        victim.save(new Book("A1", "B3", "2002"));
        victim.save(new Book("A4", "B4", "2003"));
        victim.save(new Book("A1", "B5", "2004"));
        Set<Book> expectedResult = new HashSet<>();
        expectedResult.add(new Book("A1", "B1", "2000"));
        expectedResult.add(new Book("A2", "B2", "2001"));
        expectedResult.add(new Book("A1", "B3", "2002"));
        expectedResult.add(new Book("A4", "B4", "2003"));
        expectedResult.add(new Book("A1", "B5", "2004"));
        test(expectedResult, victim.findUniqueBooks());
    }

    void testFindUniqueBooks3() {
        BookDatabaseImpl victim = new BookDatabaseImpl();
        victim.save(new Book("A1", "B1", "2000"));
        victim.save(new Book("A2", "B2", "2001"));
        victim.save(new Book("A1", "B1", "2002"));
        victim.save(new Book("A4", "B4", "2003"));
        victim.save(new Book("A1", "B1", "2004"));
        Set<Book> expectedResult = new HashSet<>();
        expectedResult.add(new Book("A1", "B1", "2000"));
        expectedResult.add(new Book("A2", "B2", "2001"));
        expectedResult.add(new Book("A4", "B4", "2003"));
        test(expectedResult, victim.findUniqueBooks());
    }

    void testFindUniqueBooks4() {
        BookDatabaseImpl victim = new BookDatabaseImpl();
        victim.save(new Book("A1", "B1", "2000"));
        victim.save(new Book("A1", "B1", "2001"));
        victim.save(new Book("A1", "B1", "2002"));
        victim.save(new Book("A1", "B1", "2003"));
        victim.save(new Book("A1", "B1", "2004"));
        Set<Book> expectedResult = new HashSet<>();
        expectedResult.add(new Book("A1", "B1", "2000"));
        test(expectedResult, victim.findUniqueBooks());
    }

}