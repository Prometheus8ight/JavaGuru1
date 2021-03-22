package students.vitaly_porsev.lesson_8.level_7.task_31;

import java.time.LocalDateTime;

class Book {

    private String title;
    private int penalty;
    private LocalDateTime dateWhenBookTook;
    private LocalDateTime whenBookShouldBeBack;
    private boolean inLibrary;
    private boolean reserve;

    public Book(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book{ " +
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

    public LocalDateTime getDateWhenBookTook() {
        return dateWhenBookTook;
    }

    public void setDateWhenBookTook(LocalDateTime dateWhenBookTook) {
        this.dateWhenBookTook = dateWhenBookTook;
    }

    public LocalDateTime getWhenBookShouldBeBack() {
        return whenBookShouldBeBack;
    }

    public void setWhenBookShouldBeBack(LocalDateTime whenBookShouldBeBack) {
        this.whenBookShouldBeBack =  whenBookShouldBeBack;
    }

    public boolean getIsInLibrary() {
        return inLibrary;
    }

    public void setInLibrary(boolean inLibrary) {
        this.inLibrary = inLibrary;
    }

    public boolean isReserve() {
        return reserve;
    }

    public void setReserve(boolean reserve) {
        this.reserve = reserve;
    }
}