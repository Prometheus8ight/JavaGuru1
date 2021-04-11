package students.alex_kalashnikov.lesson_11.level_4.task_23_26;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class FindUniqueTitleTest {

    public static void main(String[] args) {

        FindUniqueTitleTest newTest = new FindUniqueTitleTest();
        newTest.testFindUniqueTitle1();
        newTest.testFindUniqueTitle2();
        newTest.testFindUniqueTitle3();

    }

    void test(Set<String> expectedResult, Set<String> realResult) {
        if (Arrays.equals(expectedResult.toArray(), realResult.toArray())) {
            System.out.println("Test is OK!");
        } else {
            System.out.println("Test is FAILED!");
        }
    }

    void testFindUniqueTitle1() {
        BookDatabaseImpl victim = new BookDatabaseImpl();
        victim.save(new Book("A1", "B1", "2000"));
        victim.save(new Book("A2", "B2", "2001"));
        victim.save(new Book("A3", "B3", "2002"));
        victim.save(new Book("A4", "B4", "2003"));
        victim.save(new Book("A5", "B5", "2004"));
        Set<String> expectedResult = new HashSet<>();
        expectedResult.add("B1");
        expectedResult.add("B2");
        expectedResult.add("B3");
        expectedResult.add("B4");
        expectedResult.add("B5");
        test(expectedResult, victim.findUniqueTitles());
    }

    void testFindUniqueTitle2() {
        BookDatabaseImpl victim = new BookDatabaseImpl();
        victim.save(new Book("A1", "B1", "2000"));
        victim.save(new Book("A2", "B2", "2001"));
        victim.save(new Book("A3", "B1", "2002"));
        victim.save(new Book("A4", "B4", "2003"));
        victim.save(new Book("A5", "B1", "2004"));
        Set<String> expectedResult = new HashSet<>();
        expectedResult.add("B1");
        expectedResult.add("B2");
        expectedResult.add("B4");
        test(expectedResult, victim.findUniqueTitles());
    }

    void testFindUniqueTitle3() {
        BookDatabaseImpl victim = new BookDatabaseImpl();
        victim.save(new Book("A1", "B1", "2000"));
        victim.save(new Book("A2", "B1", "2001"));
        victim.save(new Book("A3", "B1", "2002"));
        victim.save(new Book("A4", "B1", "2003"));
        victim.save(new Book("A5", "B1", "2004"));
        Set<String> expectedResult = new HashSet<>();
        expectedResult.add("B1");
        test(expectedResult, victim.findUniqueTitles());
    }

}