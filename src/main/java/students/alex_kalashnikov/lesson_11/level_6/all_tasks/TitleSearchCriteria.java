package students.alex_kalashnikov.lesson_11.level_6.all_tasks;

class TitleSearchCriteria implements SearchCriteria {

    private String titleToSearch;

    public TitleSearchCriteria(String titleToSearch) {
        this.titleToSearch = titleToSearch;
    }

    @Override
    public boolean match(Book book) {
        return titleToSearch.equals(book.getTitle());
    }

}