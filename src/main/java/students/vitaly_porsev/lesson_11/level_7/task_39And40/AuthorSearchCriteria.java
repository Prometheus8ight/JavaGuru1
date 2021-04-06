package students.vitaly_porsev.lesson_11.level_7.task_39And40;

public class AuthorSearchCriteria implements SearchCriteria{

    private String authorToSearch;

    public AuthorSearchCriteria(String authorToSearch) {
        this.authorToSearch = authorToSearch;
    }

    public boolean match(Book book) {
        return authorToSearch.equals(book.getAuthor());
    }
}
