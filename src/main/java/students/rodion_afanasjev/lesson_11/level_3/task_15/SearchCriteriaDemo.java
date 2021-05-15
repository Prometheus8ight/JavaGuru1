package students.rodion_afanasjev.lesson_11.level_3.task_15;

import org.mockito.internal.matchers.Or;

class SearchCriteriaDemo {

    public static void main(String[] args) {

        AndSearchCriteria andSearchCriteria = new AndSearchCriteria(new AuthorSearchCriteria("Kuper"), new TitleSearchCriteria("Zveroboi"));
        AndSearchCriteria andSearchCriteria1 = new AndSearchCriteria(new AuthorSearchCriteria("Kuper"), new YearOfIssueSearchCriteria("1890"));
        OrSearchCriteria orSearchCriteria = new OrSearchCriteria(new AuthorSearchCriteria("Kuper"), new YearOfIssueSearchCriteria("1980"));
        OrSearchCriteria orSearchCriteria1 = new OrSearchCriteria(orSearchCriteria, new TitleSearchCriteria("Zveroboi"));

    }

}
