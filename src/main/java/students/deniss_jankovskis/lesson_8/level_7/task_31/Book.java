package students.deniss_jankovskis.lesson_8.level_7.task_31;

import java.time.LocalDateTime;

class Book {

    private String title;
    private int penalty;
    private LocalDateTime dateOfReservation;
    private LocalDateTime dateOfReturn;
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
                ", dateOfReservation = " + dateOfReservation +
                ", dateOfReturn = " + dateOfReturn +
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

    public LocalDateTime getDateOfReservation() {
        return dateOfReservation;
    }

    public void setDateOfReservation(LocalDateTime dateOfReservation) {
        this.dateOfReservation = dateOfReservation;
    }

    public LocalDateTime getDateOfReturn() {
        return dateOfReturn;
    }

    public void setDateOfReturn(LocalDateTime dateOfReturn) {
        this.dateOfReturn = dateOfReturn;
    }

    public boolean InLibrary() {
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