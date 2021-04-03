package students.julija_katukova.lesson_11.level_6;

class OrSearchCriteria implements SearchCriteria {

    private final SearchCriteria leftCondition;
    private final SearchCriteria rightCondition;

    public OrSearchCriteria(SearchCriteria leftCondition,
                            SearchCriteria rightCondition) {
        this.leftCondition = leftCondition;
        this.rightCondition = rightCondition;
    }

    public boolean match(Book book) {
        return this.leftCondition.match(book) ||
                this.rightCondition.match(book);
    }
}