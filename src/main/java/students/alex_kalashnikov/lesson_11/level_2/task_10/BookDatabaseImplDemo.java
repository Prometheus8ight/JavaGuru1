package students.alex_kalashnikov.lesson_11.level_2.task_10;

import java.util.Arrays;

class BookDatabaseImplDemo {

    public static void main(String[] args) {

        BookDatabaseImpl newDataBase = new BookDatabaseImpl();
        newDataBase.save(new Book("A1", "B1"));
        newDataBase.save(new Book("A2", "B2"));
        newDataBase.save(new Book("A1", "B3"));
        newDataBase.save(new Book("A2", "B4"));
        newDataBase.save(new Book("A1", "B5"));
        System.out.println(newDataBase.findByAuthor("A1"));
        System.out.println(newDataBase.findByAuthor("A11"));
        System.out.println(Arrays.toString(newDataBase.repository.toArray()));

    }

}