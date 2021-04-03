package students.vitaly_porsev.lesson_11.level_5.allTasks;

class AuthorSearchCriteria implements SearchCriteria {

    private String authorToSearch;

    public AuthorSearchCriteria(String authorToSearch) {
        this.authorToSearch = authorToSearch;
    }

    public boolean match(Book book) {
        return authorToSearch.equals(book.getAuthor());
    }
}
