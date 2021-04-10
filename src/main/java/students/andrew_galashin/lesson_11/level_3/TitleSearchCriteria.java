package students.andrew_galashin.lesson_11.level_3;

class TitleSearchCriteria implements SearchCriteria{

    private String titleToSearch;

    public TitleSearchCriteria(String titleToSearch) {
        this.titleToSearch = titleToSearch;
    }

    public boolean match(Book book) {
        return titleToSearch.equals(book.getTitle());
    }

}
