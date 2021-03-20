package students.alex_kalashnikov.lesson_8.level_7.task_31;

import java.time.LocalDate;

class LibraryUsers {

    private String userId;
    private String userName;
    private String userAddress;
    private int hasBookId;
    private int hasReservationBookId;
    private LocalDate dateOfHanding;
    private int accruedPenalty;
    private static int count = 1;

    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getHasBookId() {
        return hasBookId;
    }

    public void setHasBookId(int hasBookId) {
        this.hasBookId = hasBookId;
    }

    public int getHasReservationBookId() {
        return hasReservationBookId;
    }

    public void setHasReservationBookId(int hasReservationBookId) {
        this.hasReservationBookId = hasReservationBookId;
    }

    public LocalDate getDateOfHanding() {
        return dateOfHanding;
    }

    public void setDateOfHanding(LocalDate dateOfHanding) {
        this.dateOfHanding = dateOfHanding;
    }

    public void setAccruedPenalty(int accruedPenalty) {
        this.accruedPenalty = accruedPenalty;
    }

    public static int getCount() {
        return count;
    }

    public LibraryUsers(String userName, String userAddress) {
        this.userId = "User" + count;
        this.userName = userName;
        this.userAddress = userAddress;
        this.hasBookId = 0;
        this.hasReservationBookId = 0;
        this.accruedPenalty = 0;
        count++;
    }

    @Override
    public String toString() {
        return "User{" +
                "ID='" + userId + '\'' +
                "|| Name='" + userName + '\'' +
                "|| Address='" + userAddress + '\'' +
                "|| Has book ID='" + hasBookId + '\'' +
                "|| Has reservation for book ID='" + hasReservationBookId + '\'' +
                "|| Date Of Handing='" + dateOfHanding + '\'' +
                "|| Accrued penalties='" + accruedPenalty + '\'' +
                '}' + "\n";
    }

}