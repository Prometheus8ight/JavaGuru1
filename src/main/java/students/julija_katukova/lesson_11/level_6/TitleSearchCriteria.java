package students.julija_katukova.lesson_11.level_6;

class TitleSearchCriteria implements SearchCriteria {

    private final String titleToSearch;

    public TitleSearchCriteria(String titleToSearch) {
        this.titleToSearch = titleToSearch;
    }

    public boolean match(Book book) {
        return book.getTitle().equals(this.titleToSearch);
    }
}