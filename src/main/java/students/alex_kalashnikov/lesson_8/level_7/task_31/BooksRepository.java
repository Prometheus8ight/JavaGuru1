package students.alex_kalashnikov.lesson_8.level_7.task_31;

import java.time.LocalDate;
import java.util.Date;

class BooksRepository {

    private final int length = 10;
    private LibraryBooks[] array = new LibraryBooks[length];

    // добавляет новую книгу в массив
    void addBook(LibraryBooks book) {
        if (book.getBookId() - 1 < length) {
            array[book.getBookId() - 1] = book;
        } else {
            System.out.println("Not enough space in repository!");
        }
    }

    // возвращает значение книги в массиве по ID
    LibraryBooks findById(int bookId) {
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
    LibraryBooks[] findAll() {
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
    LibraryBooks[] findAvailable() {
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

    //сдача книги
    void getBook(int bookId, String userId) {
        LibraryBooks book = findById(bookId);
        if (!book.isNotAvailable() && book.isReservedForUser().equals("")) {
            book.setNotAvailable(true);
            book.setDateOfHanding(LocalDate.now());
            book.setUserId(userId);
        } else if (!book.isNotAvailable() && book.isReservedForUser().equals(userId)) {
            book.setNotAvailable(true);
            book.setDateOfHanding(LocalDate.now());
            book.setUserId(userId);
            book.setIsReservedForUser("");
        } else {
            System.out.println("Book will be available at " + book.getDateOfHanding().plusDays(10));
        }
    }

    // возврат книги
    void returnBook(int bookId) {
        LibraryBooks book = findById(bookId);
        if (book == null) {
            System.out.println("Wrong ID. Please check!");
        } else if (!book.isReservedForUser().equals("")) {
            book.setNotAvailable(false);
            book.setDateOfHanding(LocalDate.now());
            book.setUserId("");
            sendMessageToTheUser(book.isReservedForUser(), bookId);
        } else {
            book.setNotAvailable(false);
            book.setDateOfHanding(null);
            book.setUserId("");
        }
    }


    // резервация на дату, когда книга будет доступна
    void reserveBook(int bookId, String userId) {
        LibraryBooks book = findById(bookId);
        if (book.isReservedForUser().equals("")) {
            book.setIsReservedForUser(userId);
        } else {
            System.out.println("Book is already reserved!");
        }
    }

    // рассылка оповещений читателям о сроке сдачи книги в библиотеку
    void sendRemainder(LibraryBooks[] array) {
        for (int i = 0; i < array.length; i++) {
            if (LocalDate.now().isAfter(array[i].getDateOfHanding().plusDays(5))) {
                System.out.println(array[i].getUserId() + " , you have to return book ID: " + array[i].getBookId() + " at " + array[i].getDateOfHanding());
            }
        }
    }

    // выписывание штрафов за вовремя не сданные книги



    void sendMessageToTheUser(String userId, int bookId) {
        System.out.println(userId + ", book " + bookId + " is now available! Please, take book within 2 days, or reservation will be canceled!");
    }

}
