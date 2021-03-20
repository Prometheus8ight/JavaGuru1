package students.alex_kalashnikov.lesson_8.level_7.task_31;

import java.time.LocalDate;

class UserRepository {

    static private final int length = 10; // размер массива
    static private final UserLibrary[] userArray = new UserLibrary[length]; // массив пользователей, которые взяли или зарезервировали книги в библиотеке

    // добавляет пользователя взявшего книгу или сделавшего резервацию в массив
    static void addUser(UserLibrary user) {
        if (UserLibrary.getCount() - 1 < length) {
            userArray[UserLibrary.getCount() - 1] = user;
        } else {
            System.out.println("Not enough space in user repository!");
        }
    }

    // добавляет пользователя взявшего книгу или сделавшего резервацию в массив
    static void deleteUser(int userIndex) {
        if (userIndex >= 0 && userIndex <= userArray.length) {
            userArray[userIndex] = null;
        } else {
            System.out.println("Wrong User name!!!");
        }
    }

    // возвращает значение индекса пользователя в массиве по ID
    static int findUserById(String userId) {
        int index = -1;
        for (int i = 0; i < userArray.length; i++) {
            if (userArray[i] == null) {
                continue;
            }
            if (userArray[i].getUserId().equals(userId)) {
                index = i;
                break;
            }
        }
        return index;
    }

    // возвращает массив из всех пользователей
    static UserLibrary[] findAllUsers() {
        int count = 0;
        for (int i = 0; i < userArray.length; i++) {
            if (userArray[i] == null) {
                continue;
            } else {
                count++;
            }
        }
        UserLibrary[] allUsersArr = new UserLibrary[count];
        int j = 0;
        for (int i = 0; i < userArray.length; i++) {
            if (userArray[i] == null) {
                continue;
            } else {
                allUsersArr[j] = userArray[i];
                j++;
            }
        }
        return allUsersArr;
    }

/* метод для ежедневного обновления данных по пользователям
// (удаление просроченных резерваций, отправление напоминаний,
 выписывание штрафов в зависимости от срока просрочки)
 */
    static void manageUsersArray() {
        for (int i = 0; i < userArray.length; i++) {
            if (LocalDate.now().isAfter(userArray[i].getDateOfHanding().plusDays(2)) // если пользователь не забирает зарезервированную книгу, то резервация аннулируется (пользователь удаляется из массива)
                    && userArray[i].getHasReservationBookId() != 0) {
                BooksRepository.cancelReservation(userArray[i].getHasBookId());
                userArray[i] = null;
            }
        }
        for (int i = 0; i < userArray.length; i++) { // за 5 дней до даты возврата книги пользователю отправляется напоминание
            if (userArray[i].getHasBookId() != 0
                    && LocalDate.now().isAfter(userArray[i].getDateOfHanding().plusDays(5))) {
                System.out.println(userArray[i].getUserName() + " , you have to return book ID: " + userArray[i].getHasBookId() + " at " + userArray[i].getDateOfHanding().plusDays(5));
            }
        }
        for (int i = 0; i < userArray.length; i++) {
            if (userArray[i].getHasBookId() != 0
                    && LocalDate.now().isAfter(userArray[i].getDateOfHanding().plusDays(100))) { // если просрочка 90 дней, то штраф увеличивается до 100
                userArray[i].setAccruedPenalty(100);
            } else if (userArray[i].getHasBookId() != 0
                    && LocalDate.now().isAfter(userArray[i].getDateOfHanding().plusDays(50))) { // если просрочка 40 дней, то штраф увеличивается до 50
                userArray[i].setAccruedPenalty(50);
            } else if (userArray[i].getHasBookId() != 0
                    && LocalDate.now().isAfter(userArray[i].getDateOfHanding().plusDays(25))) { // если просрочка 15 дней, то штраф увеличивается до 25
                userArray[i].setAccruedPenalty(25);
            }
        }
    }

}