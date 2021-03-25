package students.alex_kalashnikov.lesson_9.level_7.task_35;

class LibraryBooksTest {

    public static void main(String[] args) {


        LibraryBooksTest victim = new LibraryBooksTest();
        victim.testBuilder1();
        victim.testBuilder2();

    }

    void testBuilder1() {
        LibraryBooks realResult = new LibraryBooks.LibraryBooksBuilder("Clean Code", "Robert Martin")
                .getBookId()
                .isNotAvailable()
                .isReservedForUser()
                .getDateOfHanding()
                .getUserId()
                .build();
        LibraryBooks expectedResult = new LibraryBooks("Clean Code", "Robert Martin");
        expectedResult.setBookId(1);
        test(expectedResult, realResult);

    }

    void testBuilder2() {
        LibraryBooks realResult = new LibraryBooks.LibraryBooksBuilder("Head First Java", "Kathy Sierra")
                .getBookId()
                .isNotAvailable()
                .isReservedForUser()
                .getDateOfHanding()
                .getUserId()
                .build();
        LibraryBooks expectedResult = new LibraryBooks("Head First Java", "Robert Martin"); // не совпадает имя автора
        expectedResult.setBookId(2);
        test(expectedResult, realResult);
    }

    void test(LibraryBooks expectedResult, LibraryBooks realResult) {
        if (expectedResult.equals(realResult)) {
            System.out.println("Test is OK!");
            System.out.println("Expe :" + expectedResult);
            System.out.println("Real :" + realResult);
        } else {
            System.out.println("Test is FAILED!");
            System.out.println("Expe :" + expectedResult);
            System.out.println("Real :" + realResult);
        }
    }

}