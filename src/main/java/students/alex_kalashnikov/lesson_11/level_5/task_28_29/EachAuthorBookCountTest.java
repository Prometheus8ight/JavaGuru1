package students.alex_kalashnikov.lesson_11.level_5.task_28_29;

import java.util.*;

class EachAuthorBookCountTest {

    public static void main(String[] args) {

        EachAuthorBookCountTest newTest = new EachAuthorBookCountTest();
        newTest.testEachAuthorBookCount1();
        newTest.testEachAuthorBookCount2();
        newTest.testEachAuthorBookCount3();
        newTest.testEachAuthorBookCount4();
        newTest.testEachAuthorBookCount5();
        newTest.testEachAuthorBookCount6();
        newTest.testEachAuthorBookCount7();
    }

    void test(Map<String, Integer> expectedResult, Map<String, Integer> realResult) {
        if (Arrays.equals(expectedResult.values().toArray(), realResult.values().toArray())) {
            System.out.println("Test is OK!");
        } else {
            System.out.println("Test is FAILED!");
        }
    }

    void testEachAuthorBookCount1() {
        BookDatabaseImpl victim = new BookDatabaseImpl();
        victim.save(new Book("A1", "B1", "2000"));
        victim.save(new Book("A2", "B2", "2001"));
        victim.save(new Book("A3", "B3", "2002"));
        victim.save(new Book("A4", "B4", "2003"));
        victim.save(new Book("A5", "B5", "2004"));
        Map<String, Integer> expectedResult = new HashMap<>();
        expectedResult.put("A1", 1);
        expectedResult.put("A2", 1);
        expectedResult.put("A3", 1);
        expectedResult.put("A4", 1);
        expectedResult.put("A5", 1);
        test(expectedResult, victim.getEachAuthorBookCount());
//        System.out.println(Arrays.toString(expectedResult.values().toArray()));
//        System.out.println(Arrays.toString(victim.getEachAuthorBookCount().values().toArray()));
    }

    void testEachAuthorBookCount2() {
        BookDatabaseImpl victim = new BookDatabaseImpl();
        victim.save(new Book("A1", "B1", "2000"));
        victim.save(new Book("A2", "B2", "2001"));
        victim.save(new Book("A1", "B3", "2002"));
        victim.save(new Book("A4", "B4", "2003"));
        victim.save(new Book("A1", "B5", "2004"));
        Map<String, Integer> expectedResult = new HashMap<>();
        expectedResult.put("A1", 3);
        expectedResult.put("A2", 1);
        expectedResult.put("A4", 1);
        test(expectedResult, victim.getEachAuthorBookCount());
    }

    void testEachAuthorBookCount3() {
        BookDatabaseImpl victim = new BookDatabaseImpl();
        victim.save(new Book("A1", "B1", "2000"));
        victim.save(new Book("A2", "B2", "2001"));
        victim.save(new Book("A1", "B1", "2002"));
        victim.save(new Book("A4", "B4", "2003"));
        victim.save(new Book("A1", "B1", "2004"));
        Map<String, Integer> expectedResult = new HashMap<>();
        expectedResult.put("A1", 1);
        expectedResult.put("A2", 1);
        expectedResult.put("A4", 1);
        test(expectedResult, victim.getEachAuthorBookCount());
    }

    void testEachAuthorBookCount4() {
        BookDatabaseImpl victim = new BookDatabaseImpl();
        victim.save(new Book("A1", "B1", "2000"));
        victim.save(new Book("A1", "B2", "2001"));
        victim.save(new Book("A1", "B1", "2002"));
        victim.save(new Book("A1", "B4", "2003"));
        victim.save(new Book("A1", "B1", "2004"));
        Map<String, Integer> expectedResult = new HashMap<>();
        expectedResult.put("A1", 3);
        test(expectedResult, victim.getEachAuthorBookCount());
    }

    void testEachAuthorBookCount5() {
        BookDatabaseImpl victim = new BookDatabaseImpl();
        victim.save(new Book("A1", "B1", "2000"));
        victim.save(new Book("A1", "B1", "2001"));
        victim.save(new Book("A1", "B1", "2002"));
        victim.save(new Book("A1", "B1", "2003"));
        victim.save(new Book("A1", "B1", "2004"));
        Map<String, Integer> expectedResult = new HashMap<>();
        expectedResult.put("A1", 1);
        test(expectedResult, victim.getEachAuthorBookCount());
    }

    void testEachAuthorBookCount6() {
        BookDatabaseImpl victim = new BookDatabaseImpl();
        victim.save(new Book("A1", "B1", "2000"));
        victim.save(new Book("A2", "B2", "2001"));
        victim.save(new Book("A1", "B1", "2002"));
        victim.save(new Book("A4", "B4", "2003"));
        victim.save(new Book("A4", "B5", "2004"));
        victim.save(new Book("A2", "B2", "2005"));
        victim.save(new Book("A7", "B7", "2006"));
        victim.save(new Book("A1", "B8", "2007"));
        victim.save(new Book("A4", "B9", "2008"));
        victim.save(new Book("A10", "B10", "2009"));
        Map<String, Integer> expectedResult = new HashMap<>();
        expectedResult.put("A1", 2);
        expectedResult.put("A2", 1);
        expectedResult.put("A4", 3);
        expectedResult.put("A7", 1);
        expectedResult.put("A10", 1);
        test(expectedResult, victim.getEachAuthorBookCount());
    }

    void testEachAuthorBookCount7() {
        BookDatabaseImpl victim = new BookDatabaseImpl();
        Map<String, Integer> expectedResult = new HashMap<>();
        test(expectedResult, victim.getEachAuthorBookCount());
    }

}