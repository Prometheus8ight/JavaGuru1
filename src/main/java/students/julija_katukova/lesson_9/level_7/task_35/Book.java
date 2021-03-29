package students.julija_katukova.lesson_9.level_7.task_35;

class Book {

    private String id;          //required
    private String title;       //required
    private String author;      //required
    private boolean isBorrowed; //optional
    private boolean isReserved; //optional
    private String userId;      //optional
    private String dueToDate;   //optional

    static class Builder {

        private String id;          //required
        private String title;       //required
        private String author;      //required
        private boolean isBorrowed; //optional
        private boolean isReserved; //optional
        private String userId;      //optional
        private String dueToDate;   //optional

        public Builder(String id, String title, String author) {
            this.id = id;
            this.title = title;
            this.author = author;
        }

        public Builder isBorrowed(boolean isBorrowed) {
            this.isBorrowed = isBorrowed;
            return this;
        }

        public Builder isReserved(boolean isReserved) {
            this.isReserved = isReserved;
            return this;
        }

        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public Builder dueToDate(String dueToDate) {
            this.dueToDate = dueToDate;
            return this;
        }

        public Book build() {
            Book book = new Book();
            book.id = this.id;
            book.title = this.title;
            book.author = this.author;
            book.isBorrowed = this.isBorrowed;
            book.isReserved = this.isReserved;
            book.userId = this.userId;
            book.dueToDate = this.dueToDate;

            return book;
        }
    }

    private Book() {

    }
}
