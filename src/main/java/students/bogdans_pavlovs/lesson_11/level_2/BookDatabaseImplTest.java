package students.bogdans_pavlovs.lesson_11.level_2;

class BookDatabaseImplTest {

    public static void main(String[] args) {

        BookDatabaseImplTest test = new BookDatabaseImplTest();

        test.deleteByIDTest();
        test.deleteByObjectTest();
        test.findByIDTest();
        test.findByAuthorTest();
        test.findByTitleTest();
        test.countBooksTest();
        test.deleteByAuthorTest();
        test.deleteByTitleTest();

    }

    void deleteByIDTest(){

        BookDatabaseImpl database = new BookDatabaseImpl();

        Book a = new Book("Olaf", "Vikings");

        database.save(a);
        boolean realResult = database.delete(a.getId());
        booleanResultCheck(realResult, true, "Delete by ID Test");
    }

    void deleteByObjectTest(){

        BookDatabaseImpl database = new BookDatabaseImpl();

        Book a = new Book("Olaf", "Vikings");

        database.save(a);
        boolean realResult = database.delete(a);
        booleanResultCheck(realResult, true, "Delete by Object Test");

    }

    void findByIDTest(){

        BookDatabaseImpl database = new BookDatabaseImpl();

        Book a = new Book("Olaf", "Vikings");

        database.save(a);

        String realResult = database.findById(a.getId()).toString();
        String expectedResult = "Optional[Book{id=1, title='Vikings', author='Olaf'}]";
        stringResultCheck(realResult, expectedResult, "Find by ID Test");

    }

    void findByAuthorTest(){

        BookDatabaseImpl database = new BookDatabaseImpl();

        Book a = new Book("Olaf", "Vikings");
        Book b = new Book("Olaf", "Vikings II");
        Book c = new Book("Falo", "Not Vikings");

        database.save(a);
        database.save(b);
        database.save(c);

        String realResult = database.findByAuthor("Olaf").toString();
        String expectedResult = "[Book{id=1, title='Vikings', author='Olaf'}, Book{id=2, title='Vikings II', author='Olaf'}]";

        stringResultCheck(realResult, expectedResult, "Find by Author Test");

    }

    void findByTitleTest(){

        BookDatabaseImpl database = new BookDatabaseImpl();

        Book a = new Book("Olaf", "Vikings");
        Book b = new Book("Falo", "Vikings");
        Book c = new Book("Lofa", "Not Vikings IV");

        database.save(a);
        database.save(b);
        database.save(c);

        String realResult = database.findByTitle("Vikings").toString();
        String expectedResult = "[Book{id=1, title='Vikings', author='Olaf'}, Book{id=2, title='Vikings', author='Falo'}]";

        stringResultCheck(realResult, expectedResult, "Find by Title Test");

    }

    void countBooksTest(){

        BookDatabaseImpl database = new BookDatabaseImpl();

        Book a = new Book("Olaf", "Vikings");
        Book b = new Book("Falo", "Vikings");
        Book c = new Book("Lofa", "Not Vikings IV");

        database.save(a);
        database.save(b);
        database.save(c);

        int realResult = database.countAllBooks();
        intResultCheck(realResult, 3, "Count Books Test");

    }

    void deleteByAuthorTest (){

        BookDatabaseImpl database = new BookDatabaseImpl();

        Book a = new Book("Olaf", "Vikings");
        Book b = new Book("Olaf", "Vikings II");
        Book c = new Book("Falo", "Not Vikings");

        database.save(a);
        database.save(b);
        database.save(c);

        database.deleteByAuthor("Olaf");

        String realResult = database.findByAuthor("Olaf").toString();
        stringResultCheck(realResult, "[]", "Delete by Author Test");

    }

    void deleteByTitleTest (){

        BookDatabaseImpl database = new BookDatabaseImpl();

        Book a = new Book("Olaf", "Vikings");
        Book b = new Book("Falo", "Vikings");
        Book c = new Book("Lofa", "Not Vikings IV");

        database.save(a);
        database.save(b);
        database.save(c);

        database.deleteByTitle("Vikings");

        String realResult = database.findByTitle("Vikings").toString();
        stringResultCheck(realResult, "[]", "Delete by Title Test");

    }

    void intResultCheck(int realResult, int expectedResult, String testName){

        if (realResult == expectedResult){
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }

    }

    void stringResultCheck (String realResult, String expectedResult, String testName){

        if (realResult.equals(expectedResult)){
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }

    }

    void booleanResultCheck(boolean realResult, boolean expectedResult, String testName){

        if (realResult == expectedResult){
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }

    }

}
