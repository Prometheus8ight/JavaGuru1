package students.andrew_galashin.lesson_11.level_3;

class AuthorSearchCriteria implements SearchCriteria {

    private String author;

    public AuthorSearchCriteria(String author) {
        this.author = author;
    }

    @Override
    public boolean match(Book book) {
        return author.equals(book.getAuthor());
    }
}
