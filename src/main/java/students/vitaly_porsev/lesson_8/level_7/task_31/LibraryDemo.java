package students.vitaly_porsev.lesson_8.level_7.task_31;

class LibraryDemo {
    public static void main(String[] args)  {
        Library method = new Library();
        method.addBookToTheLibrary("Война и Мир");
        method.addBookToTheLibrary("Три товарища");
        method.addBookToTheLibrary("Спартак");
        method.addBookToTheLibrary("Head First Java");
        method.addBookToTheLibrary("Муравьи");
        method.takeBookFromLibrary("Спартак", "22/03/2021 13:00");
        method.takeBookFromLibrary("Три Товарища", "20/03/2021 10:00");
        System.out.println(method.returnBook("Спартак"));
        System.out.println(method.payForThePenalty("Спартак", 10));
        System.out.println(method.payForThePenalty("Спартак", 10));
        System.out.println(method.reserveBook("Муравьи"));
        System.out.println(method.unReserveBook("Муравьи"));
        System.out.println(method.takeBookFromLibrary("Муравьи" , "25/02/2021 12:00"));
        System.out.println(method.checkBook("Спартак"));
    }
}
