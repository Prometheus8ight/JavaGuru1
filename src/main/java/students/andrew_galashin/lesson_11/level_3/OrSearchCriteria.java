package students.andrew_galashin.lesson_11.level_3;

class OrSearchCriteria implements SearchCriteria {

    private SearchCriteria left;
    private SearchCriteria right;

    public OrSearchCriteria(SearchCriteria left, SearchCriteria right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean match(Book book) {
        return left.match(book) || right.match(book);
    }
}
