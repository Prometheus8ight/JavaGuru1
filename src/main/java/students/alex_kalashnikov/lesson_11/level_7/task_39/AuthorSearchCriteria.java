package students.alex_kalashnikov.lesson_11.level_7.task_39;

class AuthorSearchCriteria implements SearchCriteria {

    private String authorToSearch;

    public AuthorSearchCriteria(String authorToSearch) {
        this.authorToSearch = authorToSearch;
    }

    @Override
    public boolean match(Book book) {
        return authorToSearch.equals(book.getAuthor());
    }

}