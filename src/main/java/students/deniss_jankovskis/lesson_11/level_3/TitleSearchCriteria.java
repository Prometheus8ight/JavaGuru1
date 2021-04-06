package students.deniss_jankovskis.lesson_11.level_3;

class TitleSearchCriteria implements SearchCriteria {

    private String titleToSearch;

    public TitleSearchCriteria(String titleToSearch) {
        this.titleToSearch = titleToSearch;
    }

    public boolean match(Book book) {
        return book.getTitle().equals(this.titleToSearch);
    }
}
