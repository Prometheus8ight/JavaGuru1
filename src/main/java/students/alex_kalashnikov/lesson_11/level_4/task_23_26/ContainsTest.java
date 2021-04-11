package students.alex_kalashnikov.lesson_11.level_4.task_23_26;

class ContainsTest {

    public static void main(String[] args) {

        ContainsTest newTest = new ContainsTest();
        newTest.testContains1();
        newTest.testContains2();
        newTest.testContains3();
        newTest.testContains4();
        newTest.testContains5();
    }

    void test(boolean expectedResult, boolean realResult) {
        if (expectedResult == realResult) {
            System.out.println("Test is OK!");
        } else {
            System.out.println("Test is FAILED!");
        }
    }

    void testContains1() {
        BookDatabaseImpl victim = new BookDatabaseImpl();
        victim.save(new Book("A1", "B1", "2000"));
        victim.save(new Book("A2", "B2", "2001"));
        victim.save(new Book("A3", "B3", "2002"));
        victim.save(new Book("A4", "B4", "2003"));
        victim.save(new Book("A5", "B5", "2004"));
        test(true, victim.contains(new Book("A1", "B1", "2000")));
    }

    void testContains2() {
        BookDatabaseImpl victim = new BookDatabaseImpl();
        victim.save(new Book("A1", "B1", "2000"));
        victim.save(new Book("A2", "B2", "2001"));
        victim.save(new Book("A3", "B3", "2002"));
        victim.save(new Book("A4", "B4", "2003"));
        victim.save(new Book("A5", "B5", "2004"));
        test(true, victim.contains(new Book("A5", "B5", "2004")));
    }

    void testContains3() {
        BookDatabaseImpl victim = new BookDatabaseImpl();
        victim.save(new Book("A1", "B1", "2000"));
        victim.save(new Book("A2", "B2", "2001"));
        victim.save(new Book("A3", "B3", "2002"));
        victim.save(new Book("A4", "B4", "2003"));
        victim.save(new Book("A5", "B5", "2004"));
        test(true, victim.contains(new Book("A3", "B3", "2002")));
    }

    void testContains4() {
        BookDatabaseImpl victim = new BookDatabaseImpl();
        victim.save(new Book("A1", "B1", "2000"));
        victim.save(new Book("A2", "B2", "2001"));
        victim.save(new Book("A3", "B3", "2002"));
        victim.save(new Book("A4", "B4", "2003"));
        victim.save(new Book("A5", "B5", "2004"));
        test(false, victim.contains(new Book("A11", "B1", "2000")));
    }

    void testContains5() {
        BookDatabaseImpl victim = new BookDatabaseImpl();
        test(false, victim.contains(new Book("A1", "B1", "2000")));
    }

}