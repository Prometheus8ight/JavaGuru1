package students.alex_kalashnikov.lesson_11.level_5.task_28;

import java.util.*;

class AuthorToBooksMapTest {

    public static void main(String[] args) {

        AuthorToBooksMapTest newTest = new AuthorToBooksMapTest();
        newTest.testAuthorToBooksMap1();
        newTest.testAuthorToBooksMap2();
        newTest.testAuthorToBooksMap3();
        newTest.testAuthorToBooksMap4();

    }

    void test(Map<String, List<Book>> expectedResult, Map<String, List<Book>> realResult) {
        if (Arrays.equals(expectedResult.values().toArray(), realResult.values().toArray())) {
            System.out.println("Test is OK!");
        } else {
            System.out.println("Test is FAILED!");
        }
    }

    void testAuthorToBooksMap1() {
        BookDatabaseImpl victim = new BookDatabaseImpl();
        victim.save(new Book("A1", "B1", "2000"));
        victim.save(new Book("A2", "B2", "2001"));
        victim.save(new Book("A3", "B3", "2002"));
        victim.save(new Book("A4", "B4", "2003"));
        victim.save(new Book("A5", "B5", "2004"));
        Map<String, List<Book>> expectedResult = new HashMap<>();
        expectedResult.put("A1", new ArrayList<>(Arrays.asList(new Book("A1", "B1", "2000"))));
        expectedResult.put("A2", new ArrayList<>(Arrays.asList(new Book("A2", "B2", "2001"))));
        expectedResult.put("A3", new ArrayList<>(Arrays.asList(new Book("A3", "B3", "2002"))));
        expectedResult.put("A4", new ArrayList<>(Arrays.asList(new Book("A4", "B4", "2003"))));
        expectedResult.put("A5", new ArrayList<>(Arrays.asList(new Book("A5", "B5", "2004"))));
        test(expectedResult, victim.getAuthorToBooksMap());
    }

    void testAuthorToBooksMap2() {
        BookDatabaseImpl victim = new BookDatabaseImpl();
        victim.save(new Book("A1", "B1", "2000"));
        victim.save(new Book("A2", "B2", "2001"));
        victim.save(new Book("A1", "B3", "2002"));
        victim.save(new Book("A4", "B4", "2003"));
        victim.save(new Book("A1", "B5", "2004"));
        Map<String, List<Book>> expectedResult = new HashMap<>();
        expectedResult.put("A1", new ArrayList<>(Arrays.asList(new Book("A1", "B1", "2000"),
                new Book("A1", "B3", "2002"),
                new Book("A1", "B5", "2004"))));
        expectedResult.put("A2", new ArrayList<>(Arrays.asList(new Book("A2", "B2", "2001"))));
        expectedResult.put("A4", new ArrayList<>(Arrays.asList(new Book("A4", "B4", "2003"))));
        test(expectedResult, victim.getAuthorToBooksMap());
    }

    void testAuthorToBooksMap3() {
        BookDatabaseImpl victim = new BookDatabaseImpl();
        victim.save(new Book("A1", "B1", "2000"));
        victim.save(new Book("A2", "B2", "2001"));
        victim.save(new Book("A1", "B1", "2002"));
        victim.save(new Book("A4", "B4", "2003"));
        victim.save(new Book("A1", "B1", "2004"));
        Map<String, List<Book>> expectedResult = new HashMap<>();
        expectedResult.put("A1", new ArrayList<>(Arrays.asList(new Book("A1", "B1", "2000"),
                new Book("A1", "B1", "2002"),
                new Book("A1", "B1", "2004"))));
        expectedResult.put("A2", new ArrayList<>(Arrays.asList(new Book("A2", "B2", "2001"))));
        expectedResult.put("A4", new ArrayList<>(Arrays.asList(new Book("A4", "B4", "2003"))));
        test(expectedResult, victim.getAuthorToBooksMap());
    }

    void testAuthorToBooksMap4() {
        BookDatabaseImpl victim = new BookDatabaseImpl();
        Map<String, List<Book>> expectedResult = new HashMap<>();
        test(expectedResult, victim.getAuthorToBooksMap());
    }

}