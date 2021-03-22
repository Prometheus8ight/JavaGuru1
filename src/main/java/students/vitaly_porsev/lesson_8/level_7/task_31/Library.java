package students.vitaly_porsev.lesson_8.level_7.task_31;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

class Library {

    private Book[] library = new Book[10];


    String addBookToTheLibrary(String title) {
        for (int i = 0; i < library.length; i++) {
            if (library[i] == null) {
                library[i] = createNewBok(title);
                library[i].setInLibrary(true);
                return "Книга добавлена!";
            }
        }
        return null;
    }

    private Book createNewBok(String title) {
        return new Book(title);
    }

    private boolean equal(Book book, String title) {
        return book.getTitle().toLowerCase(Locale.ROOT).equals(title.toLowerCase());
    }

    String takeBookFromLibrary(String title, String whenBookShouldBeBack) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime bookDueDate = LocalDateTime.parse(whenBookShouldBeBack, formatter);
        for (Book book : library) {
            if (book != null && equal(book, title) && book.isReserve()
                    || book != null && equal(book, title) && !book.getIsInLibrary()) {
                return "Книга недоступна!";
            } else if (book != null && equal(book, title)) {
                book.setInLibrary(false);
                book.setDateWhenBookTook(LocalDateTime.now());
                book.setWhenBookShouldBeBack(bookDueDate);
            }
        }
        return "Спасибо. Вы должны вернуть книгу: " + whenBookShouldBeBack + ".";
    }

    String returnBook(String title){
        for (Book book : library) {
            if (book != null && equal(book, title)) {
                if (LocalDateTime.now().isAfter(book.getWhenBookShouldBeBack())) {
                    book.setPenalty(20);
                    return "Вы просрочили сдачу книги, ваш штраф: " + book.getPenalty();
                } else {
                    penalties(title);
                }
            }
        }
        return "Спасибо, что своевременно вернули книгу.";
    }

    private void penalties(String title) {
        for (Book book : library) {
            if (book != null && equal(book, title)) {
                book.setInLibrary(true);
                book.setDateWhenBookTook(null);
                book.setWhenBookShouldBeBack(null);
                book.setPenalty(0);
            }
        }
    }

    String payForThePenalty(String title, int pay) {
        for (Book book : library) {
            if (book != null) {
                if (equal(book, title) && !book.getIsInLibrary()) {
                    if (pay == book.getPenalty()) {
                        penalties(title);
                        return "Спасибо за оплату!";
                    } else if (pay < book.getPenalty()) {
                        book.setPenalty(book.getPenalty() - pay);
                        return "Вы должны доплатить ещё: " + book.getPenalty();
                    } else {
                        penalties(title);
                        return "Спасибо. Ваша сдача: " + (pay - book.getPenalty());
                    }
                }
            }
        }
        return "Книга недоступна";
    }

    String reserveBook(String title) {
        for (Book book : library) {
            if (book != null && equal(book, title) && book.getIsInLibrary() && !book.isReserve()) {
                book.setReserve(true);
                return "Ваша книга зарезервирована!";
            }
        }
        return "Книга недоступна";
    }

    String unReserveBook(String title) {
        for (Book book : library) {
            if (book != null && equal(book, title) && book.isReserve()) {
                book.setReserve(false);
                return "Резервация отменена.";
            }
        }
        return "Книга недоступна";
    }

    private int foundTakenBooks() {
        int counter = 0;
        for (Book book : library) {
            if (book != null && book.getWhenBookShouldBeBack() != null) {
                counter++;
            }
        }
        return counter;
    }

    String[] whenBooksShouldBeBack() {
        String[] takenBooks = new String[foundTakenBooks()];
        int index = 0;
        for (Book book : library) {
            if (book != null && book.getWhenBookShouldBeBack() != null) {
                takenBooks[index] = "Книга: " + book.getTitle() + ". Должна быть возращена: " + book.getWhenBookShouldBeBack() + ".";
                index++;
            }
        }
        return takenBooks;
    }

    String deleteBookFromLibrary(String title) {
        for (int i = 0; i < library.length; i++) {
            if (library[i] != null && equal(library[i], title)) {
                library[i] = null;
                return "Книга удалена!";
            }
        }
        return "Книга не найдена!";
    }

    String checkBook(String title) {
        for (Book book : library) {
            if (book != null && equal(book, title)) {
                return book.getTitle() + " " + book.getWhenBookShouldBeBack() + " " + book.getPenalty();
            }
        }
        return "Книга не найдена";
    }

    private int foundAllBooks() {
        int counter = 0;
        for (Book book : library) {
            if (book != null) {
                counter++;
            }
        }
        return counter;
    }

    Book[] checkAllBooks() {
        Book[] allBooks = new Book[foundAllBooks()];
        int index = 0;
        for (Book book : library) {
            if (book != null) {
                allBooks[index] = book;
                index++;
            }
        }
        return allBooks;
    }
}