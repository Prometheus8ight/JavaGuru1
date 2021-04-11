package students.alex_kalashnikov.lesson_11.level_7.task_39;

import java.util.*;

class BookDatabaseImplTest {

    public static void main(String[] args) {

        BookDatabaseImplTest newTest = new BookDatabaseImplTest();
        newTest.testFindByAuthorPerPage1();
        newTest.testFindByAuthorPerPage2();
        newTest.testFindByAuthorPerPage3();
        newTest.testFindByAuthorPerPage4();
        newTest.testFindByAuthorPerPage5();
        newTest.testFindByAuthorPerPage6();
        newTest.testFindByTitlePerPage1();
        newTest.testFindByTitlePerPage2();
        newTest.testFindByTitlePerPage3();
        newTest.testFindByTitlePerPage4();
        newTest.testFindByTitlePerPage5();
        newTest.testFindByTitlePerPage6();
        newTest.testFindUniqueAuthors1();
        newTest.testFindUniqueAuthors2();
        newTest.testFindUniqueAuthors3();
        newTest.testFindUniqueAuthors4();
        newTest.testFindUniqueTitles1();
        newTest.testFindUniqueTitles2();
        newTest.testFindUniqueTitles3();
        newTest.testFindUniqueTitles4();

    }

    void testArr(List<Book> expectedResult, List<Book> realResult) {
        if (Arrays.equals(expectedResult.toArray(), realResult.toArray())) {
            System.out.println("Test is OK!");
        } else {
            System.out.println("Test is FAILED!");
        }
    }

    void testSet(Set<String> expectedResult, Set<String> realResult) {
        if (Arrays.equals(expectedResult.toArray(), realResult.toArray())) {
            System.out.println("Test is OK!");
        } else {
            System.out.println("Test is FAILED!");
        }
    }

    void testFindByAuthorPerPage1() {
        BookDatabaseImpl newDatabase = new BookDatabaseImpl();
        newDatabase.save(new Book("A1", "B1"));
        newDatabase.save(new Book("A1", "B2"));
        newDatabase.save(new Book("A1", "B3"));
        newDatabase.save(new Book("A1", "B4"));
        newDatabase.save(new Book("A1", "B5"));
        newDatabase.save(new Book("A1", "B6"));
        newDatabase.save(new Book("A1", "B7"));
        newDatabase.save(new Book("A1", "B8"));
        newDatabase.save(new Book("A1", "B9"));
        newDatabase.save(new Book("A1", "B10"));
        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(new Book("A1", "B4"));
        expectedResult.add(new Book("A1", "B5"));
        expectedResult.add(new Book("A1", "B6"));
        testArr(expectedResult, newDatabase.findByAuthor("A1", 2));
    }

    void testFindByAuthorPerPage2() {
        BookDatabaseImpl newDatabase = new BookDatabaseImpl();
        newDatabase.save(new Book("A1", "B1"));
        newDatabase.save(new Book("A1", "B2"));
        newDatabase.save(new Book("A1", "B3"));
        newDatabase.save(new Book("A1", "B4"));
        newDatabase.save(new Book("A1", "B5"));
        newDatabase.save(new Book("A1", "B6"));
        newDatabase.save(new Book("A1", "B7"));
        newDatabase.save(new Book("A1", "B8"));
        newDatabase.save(new Book("A1", "B9"));
        newDatabase.save(new Book("A1", "B10"));
        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(new Book("A1", "B9"));
        expectedResult.add(new Book("A1", "B10"));
        newDatabase.setBooksPerPage(4);
        testArr(expectedResult, newDatabase.findByAuthor("A1", 3));
    }

    void testFindByAuthorPerPage3() {
        BookDatabaseImpl newDatabase = new BookDatabaseImpl();
        newDatabase.save(new Book("A1", "B1"));
        newDatabase.save(new Book("A2", "B2"));
        newDatabase.save(new Book("A1", "B3"));
        newDatabase.save(new Book("A4", "B4"));
        newDatabase.save(new Book("A5", "B5"));
        newDatabase.save(new Book("A6", "B6"));
        newDatabase.save(new Book("A5", "B7"));
        newDatabase.save(new Book("A1", "B8"));
        newDatabase.save(new Book("A9", "B9"));
        newDatabase.save(new Book("A10", "B10"));
        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(new Book("A1", "B1"));
        expectedResult.add(new Book("A1", "B3"));
        newDatabase.setBooksPerPage(2);
        testArr(expectedResult, newDatabase.findByAuthor("A1", 1));
    }

    void testFindByAuthorPerPage4() {
        BookDatabaseImpl newDatabase = new BookDatabaseImpl();
        newDatabase.save(new Book("A1", "B1"));
        newDatabase.save(new Book("A2", "B2"));
        newDatabase.save(new Book("A1", "B3"));
        newDatabase.save(new Book("A4", "B4"));
        newDatabase.save(new Book("A5", "B5"));
        newDatabase.save(new Book("A6", "B6"));
        newDatabase.save(new Book("A5", "B7"));
        newDatabase.save(new Book("A1", "B8"));
        newDatabase.save(new Book("A9", "B9"));
        newDatabase.save(new Book("A10", "B10"));
        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(new Book("A1", "B8"));
        newDatabase.setBooksPerPage(2);
        testArr(expectedResult, newDatabase.findByAuthor("A1", 2));
    }

    void testFindByAuthorPerPage5() {
        BookDatabaseImpl newDatabase = new BookDatabaseImpl();
        newDatabase.save(new Book("A1", "B1"));
        newDatabase.save(new Book("A2", "B2"));
        newDatabase.save(new Book("A1", "B3"));
        newDatabase.save(new Book("A4", "B4"));
        newDatabase.save(new Book("A5", "B5"));
        newDatabase.save(new Book("A6", "B6"));
        newDatabase.save(new Book("A5", "B7"));
        newDatabase.save(new Book("A1", "B8"));
        newDatabase.save(new Book("A9", "B9"));
        newDatabase.save(new Book("A10", "B10"));
        List<Book> expectedResult = new ArrayList<>();
        newDatabase.setBooksPerPage(2);
        testArr(expectedResult, newDatabase.findByAuthor("A15", 2));
    }

    void testFindByAuthorPerPage6() {
        BookDatabaseImpl newDatabase = new BookDatabaseImpl();
        newDatabase.save(new Book("A1", "B1"));
        newDatabase.save(new Book("A1", "B2"));
        newDatabase.save(new Book("A1", "B3"));
        newDatabase.save(new Book("A1", "B4"));
        newDatabase.save(new Book("A1", "B5"));
        newDatabase.save(new Book("A1", "B6"));
        newDatabase.save(new Book("A1", "B7"));
        newDatabase.save(new Book("A1", "B8"));
        newDatabase.save(new Book("A1", "B9"));
        newDatabase.save(new Book("A1", "B10"));
        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(new Book("A1", "B1"));
        expectedResult.add(new Book("A1", "B2"));
        expectedResult.add(new Book("A1", "B3"));
        expectedResult.add(new Book("A1", "B4"));
        expectedResult.add(new Book("A1", "B5"));
        expectedResult.add(new Book("A1", "B6"));
        expectedResult.add(new Book("A1", "B7"));
        expectedResult.add(new Book("A1", "B8"));
        expectedResult.add(new Book("A1", "B9"));
        expectedResult.add(new Book("A1", "B10"));
        testArr(expectedResult, newDatabase.findByAuthor("A1"));
    }

    void testFindByTitlePerPage1() {
        BookDatabaseImpl newDatabase = new BookDatabaseImpl();
        newDatabase.save(new Book("A1", "B1"));
        newDatabase.save(new Book("A2", "B1"));
        newDatabase.save(new Book("A3", "B1"));
        newDatabase.save(new Book("A4", "B1"));
        newDatabase.save(new Book("A5", "B1"));
        newDatabase.save(new Book("A6", "B1"));
        newDatabase.save(new Book("A7", "B1"));
        newDatabase.save(new Book("A8", "B1"));
        newDatabase.save(new Book("A9", "B1"));
        newDatabase.save(new Book("A10", "B1"));
        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(new Book("A4", "B1"));
        expectedResult.add(new Book("A5", "B1"));
        expectedResult.add(new Book("A6", "B1"));
        testArr(expectedResult, newDatabase.findByTitle("B1", 2));
    }

    void testFindByTitlePerPage2() {
        BookDatabaseImpl newDatabase = new BookDatabaseImpl();
        newDatabase.save(new Book("A1", "B1"));
        newDatabase.save(new Book("A2", "B1"));
        newDatabase.save(new Book("A3", "B1"));
        newDatabase.save(new Book("A4", "B1"));
        newDatabase.save(new Book("A5", "B1"));
        newDatabase.save(new Book("A6", "B1"));
        newDatabase.save(new Book("A7", "B1"));
        newDatabase.save(new Book("A8", "B1"));
        newDatabase.save(new Book("A9", "B1"));
        newDatabase.save(new Book("A10", "B1"));
        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(new Book("A9", "B1"));
        expectedResult.add(new Book("A10", "B1"));
        newDatabase.setBooksPerPage(4);
        testArr(expectedResult, newDatabase.findByTitle("B1", 3));
    }

    void testFindByTitlePerPage3() {
        BookDatabaseImpl newDatabase = new BookDatabaseImpl();
        newDatabase.save(new Book("A1", "B1"));
        newDatabase.save(new Book("A2", "B2"));
        newDatabase.save(new Book("A3", "B1"));
        newDatabase.save(new Book("A4", "B4"));
        newDatabase.save(new Book("A5", "B5"));
        newDatabase.save(new Book("A6", "B6"));
        newDatabase.save(new Book("A7", "B5"));
        newDatabase.save(new Book("A8", "B1"));
        newDatabase.save(new Book("A9", "B9"));
        newDatabase.save(new Book("A10", "B10"));
        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(new Book("A1", "B1"));
        expectedResult.add(new Book("A3", "B1"));
        newDatabase.setBooksPerPage(2);
        testArr(expectedResult, newDatabase.findByTitle("B1", 1));
    }

    void testFindByTitlePerPage4() {
        BookDatabaseImpl newDatabase = new BookDatabaseImpl();
        newDatabase.save(new Book("A1", "B1"));
        newDatabase.save(new Book("A2", "B2"));
        newDatabase.save(new Book("A3", "B1"));
        newDatabase.save(new Book("A4", "B4"));
        newDatabase.save(new Book("A5", "B5"));
        newDatabase.save(new Book("A6", "B6"));
        newDatabase.save(new Book("A7", "B5"));
        newDatabase.save(new Book("A8", "B1"));
        newDatabase.save(new Book("A9", "B9"));
        newDatabase.save(new Book("A10", "B10"));
        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(new Book("A8", "B1"));
        newDatabase.setBooksPerPage(2);
        testArr(expectedResult, newDatabase.findByTitle("B1", 2));
    }

    void testFindByTitlePerPage5() {
        BookDatabaseImpl newDatabase = new BookDatabaseImpl();
        newDatabase.save(new Book("A1", "B1"));
        newDatabase.save(new Book("A2", "B2"));
        newDatabase.save(new Book("A3", "B1"));
        newDatabase.save(new Book("A4", "B4"));
        newDatabase.save(new Book("A5", "B5"));
        newDatabase.save(new Book("A6", "B6"));
        newDatabase.save(new Book("A7", "B5"));
        newDatabase.save(new Book("A8", "B1"));
        newDatabase.save(new Book("A9", "B9"));
        newDatabase.save(new Book("A10", "B10"));
        List<Book> expectedResult = new ArrayList<>();
        newDatabase.setBooksPerPage(2);
        testArr(expectedResult, newDatabase.findByTitle("B15", 2));
    }

    void testFindByTitlePerPage6() {
        BookDatabaseImpl newDatabase = new BookDatabaseImpl();
        newDatabase.save(new Book("A1", "B1"));
        newDatabase.save(new Book("A2", "B1"));
        newDatabase.save(new Book("A3", "B1"));
        newDatabase.save(new Book("A4", "B1"));
        newDatabase.save(new Book("A5", "B1"));
        newDatabase.save(new Book("A6", "B1"));
        newDatabase.save(new Book("A7", "B1"));
        newDatabase.save(new Book("A8", "B1"));
        newDatabase.save(new Book("A9", "B1"));
        newDatabase.save(new Book("A10", "B1"));
        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(new Book("A1", "B1"));
        expectedResult.add(new Book("A2", "B1"));
        expectedResult.add(new Book("A3", "B1"));
        expectedResult.add(new Book("A4", "B1"));
        expectedResult.add(new Book("A5", "B1"));
        expectedResult.add(new Book("A6", "B1"));
        expectedResult.add(new Book("A7", "B1"));
        expectedResult.add(new Book("A8", "B1"));
        expectedResult.add(new Book("A9", "B1"));
        expectedResult.add(new Book("A10", "B1"));
        testArr(expectedResult, newDatabase.findByTitle("B1"));
    }

    void testFindUniqueAuthors1() {
        BookDatabaseImpl newDatabase = new BookDatabaseImpl();
        newDatabase.save(new Book("A1", "B1"));
        newDatabase.save(new Book("A2", "B2"));
        newDatabase.save(new Book("A3", "B3"));
        newDatabase.save(new Book("A1", "B4"));
        newDatabase.save(new Book("A5", "B5"));
        newDatabase.save(new Book("A2", "B6"));
        newDatabase.save(new Book("A7", "B7"));
        newDatabase.save(new Book("A1", "B8"));
        newDatabase.save(new Book("A9", "B9"));
        newDatabase.save(new Book("A3", "B10"));
        newDatabase.save(new Book("A11", "B11"));
        newDatabase.save(new Book("A2", "B12"));
        Set<String> expectedResult = new HashSet<>();
        expectedResult.add("A1");
        expectedResult.add("A2");
        expectedResult.add("A11");
        testSet(expectedResult, newDatabase.findUniqueAuthors(1));
    }

    void testFindUniqueAuthors2() {
        BookDatabaseImpl newDatabase = new BookDatabaseImpl();
        newDatabase.save(new Book("A1", "B1"));
        newDatabase.save(new Book("A2", "B2"));
        newDatabase.save(new Book("A3", "B3"));
        newDatabase.save(new Book("A1", "B4"));
        newDatabase.save(new Book("A5", "B5"));
        newDatabase.save(new Book("A2", "B6"));
        newDatabase.save(new Book("A7", "B7"));
        newDatabase.save(new Book("A1", "B8"));
        newDatabase.save(new Book("A9", "B9"));
        newDatabase.save(new Book("A3", "B10"));
        newDatabase.save(new Book("A11", "B11"));
        newDatabase.save(new Book("A2", "B12"));
        Set<String> expectedResult = new HashSet<>();
        expectedResult.add("A3");
        expectedResult.add("A5");
        expectedResult.add("A7");
        testSet(expectedResult, newDatabase.findUniqueAuthors(2));
    }

    void testFindUniqueAuthors3() {
        BookDatabaseImpl newDatabase = new BookDatabaseImpl();
        newDatabase.save(new Book("A1", "B1"));
        newDatabase.save(new Book("A2", "B2"));
        newDatabase.save(new Book("A3", "B3"));
        newDatabase.save(new Book("A1", "B4"));
        newDatabase.save(new Book("A5", "B5"));
        newDatabase.save(new Book("A2", "B6"));
        newDatabase.save(new Book("A7", "B7"));
        newDatabase.save(new Book("A1", "B8"));
        newDatabase.save(new Book("A9", "B9"));
        newDatabase.save(new Book("A3", "B10"));
        newDatabase.save(new Book("A11", "B11"));
        newDatabase.save(new Book("A2", "B12"));
        Set<String> expectedResult = new HashSet<>();
        expectedResult.add("A7");
        expectedResult.add("A9");
        newDatabase.setBooksPerPage(5);
        testSet(expectedResult, newDatabase.findUniqueAuthors(2));
    }

    void testFindUniqueAuthors4() {
        BookDatabaseImpl newDatabase = new BookDatabaseImpl();
        newDatabase.save(new Book("A1", "B1"));
        newDatabase.save(new Book("A2", "B2"));
        newDatabase.save(new Book("A3", "B3"));
        newDatabase.save(new Book("A1", "B4"));
        newDatabase.save(new Book("A5", "B5"));
        newDatabase.save(new Book("A2", "B6"));
        newDatabase.save(new Book("A7", "B7"));
        newDatabase.save(new Book("A1", "B8"));
        newDatabase.save(new Book("A9", "B9"));
        newDatabase.save(new Book("A3", "B10"));
        newDatabase.save(new Book("A11", "B11"));
        newDatabase.save(new Book("A2", "B12"));
        Set<String> expectedResult = new HashSet<>();
        expectedResult.add("A1");
        expectedResult.add("A2");
        expectedResult.add("A11");
        expectedResult.add("A3");
        expectedResult.add("A5");
        expectedResult.add("A7");
        expectedResult.add("A9");
        testSet(expectedResult, newDatabase.findUniqueAuthors());
    }

    void testFindUniqueTitles1() {
        BookDatabaseImpl newDatabase = new BookDatabaseImpl();
        newDatabase.save(new Book("A1", "B1"));
        newDatabase.save(new Book("A2", "B2"));
        newDatabase.save(new Book("A3", "B3"));
        newDatabase.save(new Book("A4", "B1"));
        newDatabase.save(new Book("A5", "B5"));
        newDatabase.save(new Book("A6", "B5"));
        newDatabase.save(new Book("A7", "B7"));
        newDatabase.save(new Book("A8", "B8"));
        newDatabase.save(new Book("A9", "B1"));
        newDatabase.save(new Book("A10", "B2"));
        newDatabase.save(new Book("A11", "B1"));
        newDatabase.save(new Book("A12", "B12"));
        Set<String> expectedResult = new HashSet<>();
        expectedResult.add("B2");
        expectedResult.add("B3");
        expectedResult.add("B5");
        testSet(expectedResult, newDatabase.findUniqueTitles(1));
    }

    void testFindUniqueTitles2() {
        BookDatabaseImpl newDatabase = new BookDatabaseImpl();
        newDatabase.save(new Book("A1", "B1"));
        newDatabase.save(new Book("A2", "B2"));
        newDatabase.save(new Book("A3", "B3"));
        newDatabase.save(new Book("A4", "B1"));
        newDatabase.save(new Book("A5", "B5"));
        newDatabase.save(new Book("A6", "B5"));
        newDatabase.save(new Book("A7", "B7"));
        newDatabase.save(new Book("A8", "B8"));
        newDatabase.save(new Book("A9", "B1"));
        newDatabase.save(new Book("A10", "B2"));
        newDatabase.save(new Book("A11", "B1"));
        newDatabase.save(new Book("A12", "B12"));
        Set<String> expectedResult = new HashSet<>();
        expectedResult.add("B1");
        testSet(expectedResult, newDatabase.findUniqueTitles(3));
    }

    void testFindUniqueTitles3() {
        BookDatabaseImpl newDatabase = new BookDatabaseImpl();
        newDatabase.save(new Book("A1", "B1"));
        newDatabase.save(new Book("A2", "B2"));
        newDatabase.save(new Book("A3", "B3"));
        newDatabase.save(new Book("A4", "B1"));
        newDatabase.save(new Book("A5", "B5"));
        newDatabase.save(new Book("A6", "B5"));
        newDatabase.save(new Book("A7", "B7"));
        newDatabase.save(new Book("A8", "B8"));
        newDatabase.save(new Book("A9", "B1"));
        newDatabase.save(new Book("A10", "B2"));
        newDatabase.save(new Book("A11", "B1"));
        newDatabase.save(new Book("A12", "B12"));
        Set<String> expectedResult = new HashSet<>();
        expectedResult.add("B8");
        expectedResult.add("B1");
        newDatabase.setBooksPerPage(5);
        testSet(expectedResult, newDatabase.findUniqueTitles(2));
    }

    void testFindUniqueTitles4() {
        BookDatabaseImpl newDatabase = new BookDatabaseImpl();
        newDatabase.save(new Book("A1", "B1"));
        newDatabase.save(new Book("A2", "B2"));
        newDatabase.save(new Book("A3", "B3"));
        newDatabase.save(new Book("A4", "B1"));
        newDatabase.save(new Book("A5", "B5"));
        newDatabase.save(new Book("A6", "B5"));
        newDatabase.save(new Book("A7", "B7"));
        newDatabase.save(new Book("A8", "B8"));
        newDatabase.save(new Book("A9", "B1"));
        newDatabase.save(new Book("A10", "B2"));
        newDatabase.save(new Book("A11", "B1"));
        newDatabase.save(new Book("A12", "B12"));
        Set<String> expectedResult = new HashSet<>();
        expectedResult.add("B2");
        expectedResult.add("B3");
        expectedResult.add("B5");
        expectedResult.add("B12");
        expectedResult.add("B7");
        expectedResult.add("B8");
        expectedResult.add("B1");
        testSet(expectedResult, newDatabase.findUniqueTitles());
    }

}