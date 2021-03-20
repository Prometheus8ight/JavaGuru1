package students.alex_kalashnikov.lesson_8.level_7.task_31;

import java.time.LocalDate;

class BooksRepository {

    static private final int length = 10; // размер массива
    static private LibraryBooks[] array = new LibraryBooks[length]; // массив книг в библиотеке

    // добавляет новую книгу в массив
    static void addBook(LibraryBooks book) {
        if (book.getBookId() - 1 < length) {
            array[book.getBookId() - 1] = book;
        } else {
            System.out.println("Not enough space in repository!");
        }
    }

    // возвращает значение книги в массиве по ID
    static LibraryBooks findById(int bookId) {
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                continue;
            }
            if (array[i].getBookId() == bookId) {
                index = i;
                break;
            }
        }
        if (index > -1) {
            return array[index];
        } else {
            return null;
        }
    }

    // возвращает массив из всех книг
    static LibraryBooks[] findAll() {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                continue;
            } else {
                count++;
            }
        }
        LibraryBooks[] allBooksArr = new LibraryBooks[count];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                continue;
            } else {
                allBooksArr[j] = array[i];
                j++;
            }
        }
        return allBooksArr;
    }

    // возвращает массив из всех доступных книг
    static LibraryBooks[] findAvailable() {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null || array[i].isNotAvailable() || array[i].isReservedForUser().equals("")) {
                continue;
            } else {
                count++;
            }
        }
        LibraryBooks[] availableBooksArr = new LibraryBooks[count];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null || array[i].isNotAvailable() || array[i].isReservedForUser().equals("")) {
                continue;
            } else {
                availableBooksArr[j] = array[i];
                j++;
            }
        }
        return availableBooksArr;
    }

    //получение книги. При получении книги пользователь автоматически вносится в массив пользователей.
    static void getBook(int bookId, String userName, String userAddress) {
        LibraryBooks book = findById(bookId);
        LibraryUsers user = new LibraryUsers(userName, userAddress);
        if (!book.isNotAvailable() && book.isReservedForUser().equals("")) {
            book.setNotAvailable(true);
            book.setDateOfHanding(LocalDate.now());
            book.setUserId(user.getUserId());
            user.setHasBookId(bookId);
            user.setDateOfHanding(LocalDate.now());
            UsersRepository.addUser(user);

        } else if (!book.isNotAvailable() && !book.isReservedForUser().equals("")) {
            book.setNotAvailable(true);
            book.setDateOfHanding(LocalDate.now());
            book.setUserId(user.getUserId());
            book.setIsReservedForUser("");
            user.setHasBookId(bookId);
            user.setDateOfHanding(LocalDate.now());
            UsersRepository.addUser(user);
            UsersRepository.deleteUser(UsersRepository.findUserByBookId(bookId));
        } else {
            System.out.println("Book will be available at " + book.getDateOfHanding().plusDays(10));
        }
    }

    // возврат книги. При возвращении книги пользователь удаляется из массива пользователей
    static void returnBook(int bookId) {
        LibraryBooks book = findById(bookId);
        int userIndex = UsersRepository.findUserById(book.getUserId());
        if (book == null) {
            System.out.println("Wrong ID. Please check!");
        } else {
            book.setNotAvailable(false);
            book.setDateOfHanding(null);
            book.setUserId("");
            UsersRepository.deleteUser(userIndex);
        }
    }

    // резервация на дату, когда книга будет доступна
    static void reserveBook(int bookId, String userName, String userAddress) {
        LibraryBooks book = findById(bookId);
        LibraryUsers user = new LibraryUsers(userName, userAddress);
        if (book.isReservedForUser().equals("") && book.isNotAvailable()) {
            book.setIsReservedForUser(user.getUserId());
            user.setHasReservationBookId(bookId);
            user.setDateOfHanding(book.getDateOfHanding().plusDays(10)); // 10 дней - срок на который можно взять книгу из библиотеки
            UsersRepository.addUser(user);
        }
        else if (book.isReservedForUser().equals("") && !book.isNotAvailable()) {
            book.setIsReservedForUser(user.getUserId());
            user.setHasReservationBookId(bookId);
            user.setDateOfHanding(LocalDate.now()); // 10 дней - срок на который можно взять книгу из библиотеки
            UsersRepository.addUser(user);
        }
        else {
            System.out.println("Book is already reserved!");
        }
    }

    // отменяет ранее сделанную резервацию
    static void cancelReservation(int bookId) {
        LibraryBooks book = findById(bookId);
//        LibraryUsers user = UsersRepository.findUserByBookId(bookId)
        int userIndex = UsersRepository.findUserByBookId(bookId);
        if (book == null || book.isReservedForUser().equals("")) {
            System.out.println("Wrong ID. Please check!");
        } else {
            book.setIsReservedForUser("");
            UsersRepository.deleteUser(userIndex);
        }
    }

}