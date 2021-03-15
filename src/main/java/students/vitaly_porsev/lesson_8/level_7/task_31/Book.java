package students.vitaly_porsev.lesson_8.level_7.task_31;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

class Book {

    private String title;
    private int penalty;
    private Date dateWhenBookTook;
    private Date whenBookShouldBeBack;
    private boolean inLibrary;
    private boolean reserve;

    public Book() {
    }

    public Book(String title) {
        this.title = title;
    }

    void addBookToTheLibrary(Book[] books, String title) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = createNewBok(title);
                books[i].inLibrary = true;
                break;
            }
        }
    }

    boolean equal(Book book, String title) {
        return book.title.toLowerCase(Locale.ROOT).equals(title.toLowerCase());
    }

    void takeBookFromLibrary(Book[] books, String title, String whenBookShouldBeBack) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(whenBookShouldBeBack);
        for (Book book : books) {
            if (book != null) {
                if (equal(book, title) && book.reserve
                        || equal(book, title) && !book.inLibrary) {
                    System.out.println("Книга недоступна!");
                    break;
                } else if (equal(book, title)) {
                    book.inLibrary = false;
                    book.dateWhenBookTook = date;
                    book.whenBookShouldBeBack = date1;
                    break;
                }
            }
        }
    }

    void returnBook(Book[] books, String title) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        for (Book book : books) {
            if (book != null) {
                if (equal(book, title)) {
                    if (date.after(book.whenBookShouldBeBack)) {
                        book.penalty = 20;
                        System.out.println("Вы просрочили сдачу книги, ваш штраф: " + book.penalty);
                    } else {
                        penalties(books, title);
                        System.out.println("Спасибо, что своевременно вернули книгу.");
                    }
                    break;
                }
            }
        }
    }

    private void penalties(Book[] books, String title) {
        for (Book book : books) {
            if (book != null) {
                if (equal(book, title)) {
                    book.inLibrary = true;
                    book.dateWhenBookTook = null;
                    book.whenBookShouldBeBack = null;
                    book.penalty = 0;
                }
            }
        }
    }

    void payForThePenalty(Book[] books, String title, int pay) {
        for (Book book : books) {
            if (book != null) {
                if (equal(book, title)) {
                    if (pay == book.penalty) {
                        penalties(books, title);
                        System.out.println("Спасибо за оплату!");
                        break;
                    } else if (pay < book.penalty) {
                        book.penalty -= pay;
                        System.out.println("Вы должны доплатить ещё: " + book.penalty);
                        break;
                    } else {
                        penalties(books, title);
                        System.out.println("Спасибо. Ваша сдача: " + (pay - book.penalty));
                        break;
                    }
                }
            }
        }
    }

    void reserve(Book[] books, String title) {
        for (Book book : books) {
            if (book != null) {
                if (equal(book, title) && book.inLibrary && !book.reserve) {
                    book.reserve = true;
                    System.out.println("Ваша книга зарезервирована!");
                } else {
                    System.out.println("Книга недоступна");
                }
                break;
            }
        }
    }

    void whenBooksShouldBeBack(Book[] books) {
        for (Book book : books) {
            if (book != null && book.whenBookShouldBeBack != null) {
                System.out.println(book.title + " - книга должна быть возращена: " + book.whenBookShouldBeBack);
            }
        }
    }

    void deleteBookFromLibrary(Book[] books, String title) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                if (equal(books[i], title)) {
                    books[i] = null;
                    break;
                }
            }
        }
    }

    void checkBook(Book[] books, String title) {
        for (Book book : books) {
            if (book != null) {
                if (equal(book, title)) {
                    System.out.println(book.title + " " + book.whenBookShouldBeBack + " " + book.penalty);
                    break;
                }
            } else {
                System.out.println("Книга не найдена");
                break;
            }
        }
    }

    void checkAllBooks(Book[] books) {
        for (Book book : books) {
            if (book != null) {
                System.out.println(book);
            }
        }
    }

    private Book createNewBok(String title) {
        return new Book(title);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title = '" + title + '\'' +
                ", penalty = " + penalty +
                ", dateWhenBookTook = " + dateWhenBookTook +
                ", whenBookShouldBeBack = " + whenBookShouldBeBack +
                ", inLibrary = " + inLibrary +
                ", reserve = " + reserve +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPenalty() {
        return penalty;
    }

    public void setPenalty(int penalty) {
        this.penalty = penalty;
    }

    public Date getDateWhenBookTook() {
        return dateWhenBookTook;
    }

    public void setDateWhenBookTook(Date dateWhenBookTook) {
        this.dateWhenBookTook = dateWhenBookTook;
    }

    public Date getWhenBookShouldBeBack() {
        return whenBookShouldBeBack;
    }

    public void setWhenBookShouldBeBack(Date whenBookShouldBeBack) {
        this.whenBookShouldBeBack = whenBookShouldBeBack;
    }

    public boolean isInLibrary() {
        return inLibrary;
    }

    public void setInLibrary(boolean inLibrary) {
        this.inLibrary = inLibrary;
    }
}