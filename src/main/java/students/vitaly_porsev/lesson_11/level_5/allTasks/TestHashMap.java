package students.vitaly_porsev.lesson_11.level_5.allTasks;

public class TestHashMap {
    public static void main(String[] args) {
        TestHashMap method = new TestHashMap();
        method.getAuthorToBooksMapTest();
        method.countAuthorBooksTest();
    }


    void getAuthorToBooksMapTest() {
        BookDatabaseImpl book = new BookDatabaseImpl();

        book.save(new Book("In Search of Lost Time", "Marcel Proust", "1913"));
        book.save(new Book("Life After Life", "Kate Atkinson", "2013"));
        book.save(new Book("Misery", "Stephen King", "1987"));
        book.save(new Book("Don Quixote", "Miguel de Cervantes", "1605"));
        book.save(new Book("Swann's Way", "Marcel Proust", "1913"));
        book.save(new Book("Life After Life", "Jill McCorcle", "2013"));
        book.save(new Book("Inferno", "Dan Braun", "2013"));
        book.save(new Book("Bag of Bones", "Stephen King", "1998"));

        String expectedResult = "{Kate Atkinson=[[2, Kate Atkinson, Life After Life, 2013]], Dan Braun=[[7, Dan Braun, Inferno, 2013]], Marcel Proust=[[1, " +
                "Marcel Proust, In Search of Lost Time, 1913], [5, Marcel Proust, Swann's Way, 1913]], Jill McCorcle=[[6, Jill McCorcle, Life After Life, 2013]], " +
                "Miguel de Cervantes=[[4, Miguel de Cervantes, Don Quixote, 1605]], Stephen King=[[3, Stephen King, Misery, 1987], [8, Stephen King, Bag of Bones, 1998]]}";
        checkStrings(expectedResult, String.valueOf(book.getAuthorToBooksMap()), "getAuthorToBooksMapTest");
    }

    void countAuthorBooksTest(){
        BookDatabaseImpl book = new BookDatabaseImpl();

        book.save(new Book("In Search of Lost Time", "Marcel Proust", "1913"));
        book.save(new Book("Life After Life", "Kate Atkinson", "2013"));
        book.save(new Book("Misery", "Stephen King", "1987"));
        book.save(new Book("Don Quixote", "Miguel de Cervantes", "1605"));
        book.save(new Book("Swann's Way", "Marcel Proust", "1913"));
        book.save(new Book("Life After Life", "Jill McCorcle", "2013"));
        book.save(new Book("Inferno", "Dan Braun", "2013"));
        book.save(new Book("Bag of Bones", "Stephen King", "1998"));

        String expectedResult = "{Kate Atkinson=1, Dan Braun=1, Marcel Proust=2, Jill McCorcle=1, Miguel de Cervantes=1, Stephen King=2}";
        checkStrings(expectedResult, String.valueOf(book.getEachAuthorBookCount()), "getEachAuthorBookCountTest");
    }

    void checkStrings(String expectedResult, String realResult, String testName) {
        if (expectedResult.equals(realResult)) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - FALSE");
        }
    }
}
