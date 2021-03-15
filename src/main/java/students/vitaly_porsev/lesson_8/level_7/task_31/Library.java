package students.vitaly_porsev.lesson_8.level_7.task_31;

import java.text.ParseException;

class Library {

    public static void main(String[] args) throws ParseException {
        Book method = new Book();
        Book[] library = new Book[10];
        method.addBookToTheLibrary(library, "Война и Мир");
        method.addBookToTheLibrary(library, "Три товарища");
        method.addBookToTheLibrary(library, "Спартак");
        method.addBookToTheLibrary(library, "Head First Java");
        method.addBookToTheLibrary(library, "Муравьи");
        method.takeBookFromLibrary(library, "Спартак", "10/03/2021");
        method.returnBook(library, "Спартак");
        method.payForThePenalty(library, "Спартак", 10);
        method.payForThePenalty(library, "Спартак", 10);
        method.checkBook(library, "Спартак");
    }
}