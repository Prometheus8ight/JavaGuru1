package students.alex_kalashnikov.lesson_8.level_7.task_31;

import java.time.LocalDate;

class Repository {

    private final int length = 10; // размер массива
    private final LibraryBooks[] array = new LibraryBooks[length]; // массив книг в библиотеке
    private final LibraryUsers[] userArray = new LibraryUsers[length]; // массив пользователей, которые взяли или зарезервировали книги в библиотеке

    //=========================== Методы для книг =====================================================================

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
        for (LibraryBooks libraryBooks : array) {
            if (libraryBooks == null) {
                continue;
            }
            if (libraryBooks.getBookId() == bookId) {
                return libraryBooks;
            }
        }
        return null;
    }

    // возвращает массив из всех книг
    LibraryBooks[] findAll() {
        int count = 0;
        for (LibraryBooks libraryBooks : array) {
            if (libraryBooks == null) {
                continue;
            } else {
                count++;
            }
        }
        LibraryBooks[] allBooksArr = new LibraryBooks[count];
        int j = 0;
        for (LibraryBooks libraryBooks : array) {
            if (libraryBooks == null) {
                continue;
            } else {
                allBooksArr[j] = libraryBooks;
                j++;
            }
        }
        return allBooksArr;
    }

    // возвращает массив из всех доступных книг
    LibraryBooks[] findAvailable() {
        int count = 0;
        for (LibraryBooks libraryBooks : array) {
            if (libraryBooks == null || libraryBooks.isNotAvailable() || libraryBooks.isReservedForUser().equals("")) {
                continue;
            } else {
                count++;
            }
        }
        LibraryBooks[] availableBooksArr = new LibraryBooks[count];
        int j = 0;
        for (LibraryBooks libraryBooks : array) {
            if (libraryBooks == null || libraryBooks.isNotAvailable() || libraryBooks.isReservedForUser().equals("")) {
                continue;
            } else {
                availableBooksArr[j] = libraryBooks;
                j++;
            }
        }
        return availableBooksArr;
    }

    //получение книги. При получении книги пользователь автоматически вносится в массив пользователей.
    void getBook(int bookId, String userName, String userAddress) {
        LibraryBooks book = findById(bookId);
        LibraryUsers user = new LibraryUsers(userName, userAddress);
        if (!book.isNotAvailable() && book.isReservedForUser().equals("")) {
            book.setNotAvailable(true);
            book.setDateOfHanding(LocalDate.now());
            book.setUserId(user.getUserId());
            user.setHasBookId(bookId);
            user.setDateOfHanding(LocalDate.now());
            addUser(user);

        } else if (!book.isNotAvailable() && !book.isReservedForUser().equals("")) {
            book.setNotAvailable(true);
            book.setDateOfHanding(LocalDate.now());
            book.setUserId(user.getUserId());
            book.setIsReservedForUser("");
            user.setHasBookId(bookId);
            user.setDateOfHanding(LocalDate.now());
            addUser(user);
            deleteUser(findUserByBookId(bookId));
        } else {
            System.out.println("Book will be available at " + book.getDateOfHanding().plusDays(10)); // 10 дней - срок на который можно взять книгу из библиотеки
        }
    }

    // возврат книги. При возвращении книги пользователь удаляется из массива пользователей
    void returnBook(int bookId) {
        LibraryBooks book = findById(bookId);
        int userIndex = findUserById(book.getUserId());
        if (book == null) {
            System.out.println("Wrong ID. Please check!");
        } else {
            book.setNotAvailable(false);
            book.setDateOfHanding(null);
            book.setUserId("");
            deleteUser(userIndex);
        }
    }

    // резервация на дату, когда книга будет доступна
    void reserveBook(int bookId, String userName, String userAddress) {
        LibraryBooks book = findById(bookId);
        LibraryUsers user = new LibraryUsers(userName, userAddress);
        if (book.isReservedForUser().equals("") && book.isNotAvailable()) {
            book.setIsReservedForUser(user.getUserId());
            user.setHasReservationBookId(bookId);
            user.setDateOfHanding(book.getDateOfHanding().plusDays(10)); // 10 дней - срок на который можно взять книгу из библиотеки
            addUser(user);
        } else if (book.isReservedForUser().equals("") && !book.isNotAvailable()) {
            book.setIsReservedForUser(user.getUserId());
            user.setHasReservationBookId(bookId);
            user.setDateOfHanding(LocalDate.now());
            addUser(user);
        } else {
            System.out.println("Book is already reserved!");
        }
    }

    // отменяет ранее сделанную резервацию
    void cancelReservation(int bookId) {
        LibraryBooks book = findById(bookId);
        int userIndex = findUserByBookId(bookId);
        if (book == null || book.isReservedForUser().equals("")) {
            System.out.println("Wrong ID. Please check!");
        } else {
            book.setIsReservedForUser("");
            deleteUser(userIndex);
        }
    }

    //=================================== Методы для пользователей ==================================================

    // добавляет пользователя взявшего книгу или сделавшего резервацию в массив
    private void addUser(LibraryUsers user) {
        if (LibraryUsers.getCount() - 1 < length) {
            userArray[LibraryUsers.getCount() - 1] = user;
        } else {
            System.out.println("Not enough space in user repository!");
        }
    }

    // удаляет пользователя из массива
    private void deleteUser(int userIndex) {
        if (userIndex >= 0 && userIndex <= userArray.length) {
            userArray[userIndex] = null;
        } else {
            System.out.println("Wrong User name!!!");
        }
    }

    // возвращает значение индекса пользователя в массиве по номеру ID
    private int findUserById(String userId) {
        for (int i = 0; i < userArray.length; i++) {
            if (userArray[i] == null) {
                continue;
            }
            if (userArray[i].getUserId().equals(userId)) {
                return i;
            }
        }
        return -1;
    }

    // возвращает значение индекса пользователя в массиве по номеру зарезервированной книги
    private int findUserByBookId(int bookId) {
        for (int i = 0; i < userArray.length; i++) {
            if (userArray[i] == null) {
                continue;
            }
            if (userArray[i].getHasReservationBookId() == (bookId)) {
                return i;
            }
        }
        return -1;
    }

    /*
    возвращает массив из всех пользователей
    (то есть в массиве будут все пользователи,
    у которых на момент использования метода
    есть книжки или сделана резервация.
     */
    LibraryUsers[] findAllUsers() {
        int count = 0;
        for (LibraryUsers libraryUsers : userArray) {
            if (libraryUsers == null) {
                continue;
            } else {
                count++;
            }
        }
        LibraryUsers[] allUsersArr = new LibraryUsers[count];
        int j = 0;
        for (LibraryUsers libraryUsers : userArray) {
            if (libraryUsers == null) {
                continue;
            } else {
                allUsersArr[j] = libraryUsers;
                j++;
            }
        }
        return allUsersArr;
    }

    /* метод для ежедневного обновления данных по пользователям
     (удаление просроченных резерваций, отправление напоминаний,
     выписывание штрафов в зависимости от срока просрочки)
     */
    void manageUsersArray() {
        for (int i = 0; i < userArray.length; i++) {
            if (LocalDate.now().isAfter(userArray[i].getDateOfHanding().plusDays(2)) // если пользователь не забирает зарезервированную книгу, то резервация аннулируется (пользователь удаляется из массива)
                    && userArray[i].getHasReservationBookId() != 0) {
                cancelReservation(userArray[i].getHasBookId());
                userArray[i] = null;
            }
        }
        for (LibraryUsers libraryUsers : userArray) { // за 5 дней до даты возврата книги пользователю отправляется напоминание
            if (libraryUsers.getHasBookId() != 0
                    && LocalDate.now().isAfter(libraryUsers.getDateOfHanding().plusDays(5))) {
                System.out.println(libraryUsers.getUserName() + " , you have to return book ID: " + libraryUsers.getHasBookId() + " at " + libraryUsers.getDateOfHanding().plusDays(10));
            }
        }
        for (LibraryUsers libraryUsers : userArray) {
            if (libraryUsers.getHasBookId() != 0
                    && LocalDate.now().isAfter(libraryUsers.getDateOfHanding().plusDays(100))) { // если просрочка 90 дней, то штраф увеличивается до 100
                libraryUsers.setAccruedPenalty(100);
            } else if (libraryUsers.getHasBookId() != 0
                    && LocalDate.now().isAfter(libraryUsers.getDateOfHanding().plusDays(50))) { // если просрочка 40 дней, то штраф увеличивается до 50
                libraryUsers.setAccruedPenalty(50);
            } else if (libraryUsers.getHasBookId() != 0
                    && LocalDate.now().isAfter(libraryUsers.getDateOfHanding().plusDays(25))) { // если просрочка 15 дней, то штраф увеличивается до 25
                libraryUsers.setAccruedPenalty(25);
            }
        }
    }

}