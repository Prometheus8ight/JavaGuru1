package students.alex_kalashnikov.lesson_11.level_4.task_23_26;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class FindUniqueAuthorTest {

    public static void main(String[] args) {

        FindUniqueAuthorTest newTest = new FindUniqueAuthorTest();
        newTest.testFindUniqueAuthor1();
        newTest.testFindUniqueAuthor2();
        newTest.testFindUniqueAuthor3();

    }

    void test(Set<String> expectedResult, Set<String> realResult) {
        if (Arrays.equals(expectedResult.toArray(), realResult.toArray())) {
            System.out.println("Test is OK!");
        } else {
            System.out.println("Test is FAILED!");
        }
    }

    void testFindUniqueAuthor1() {
        BookDatabaseImpl victim = new BookDatabaseImpl();
        victim.save(new Book("A1", "B1", "2000"));
        victim.save(new Book("A2", "B2", "2001"));
        victim.save(new Book("A3", "B3", "2002"));
        victim.save(new Book("A4", "B4", "2003"));
        victim.save(new Book("A5", "B5", "2004"));
        Set<String> expectedResult = new HashSet<>();
        expectedResult.add("A1");
        expectedResult.add("A2");
        expectedResult.add("A3");
        expectedResult.add("A4");
        expectedResult.add("A5");
        test(expectedResult, victim.findUniqueAuthors());
    }

    void testFindUniqueAuthor2() {
        BookDatabaseImpl victim = new BookDatabaseImpl();
        victim.save(new Book("A1", "B1", "2000"));
        victim.save(new Book("A2", "B2", "2001"));
        victim.save(new Book("A1", "B3", "2002"));
        victim.save(new Book("A4", "B4", "2003"));
        victim.save(new Book("A1", "B5", "2004"));
        Set<String> expectedResult = new HashSet<>();
        expectedResult.add("A1");
        expectedResult.add("A2");
        expectedResult.add("A4");
        test(expectedResult, victim.findUniqueAuthors());
    }

    void testFindUniqueAuthor3() {
        BookDatabaseImpl victim = new BookDatabaseImpl();
        victim.save(new Book("A1", "B1", "2000"));
        victim.save(new Book("A1", "B2", "2001"));
        victim.save(new Book("A1", "B3", "2002"));
        victim.save(new Book("A1", "B4", "2003"));
        victim.save(new Book("A1", "B5", "2004"));
        Set<String> expectedResult = new HashSet<>();
        expectedResult.add("A1");
        test(expectedResult, victim.findUniqueAuthors());
    }

}