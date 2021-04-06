package students.julija_katukova.lesson_11.level_7;

import java.util.List;

class PageCriteria {

    private int pageSize;
    private int pageNumber;
    private boolean isSortedByAuthors;

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public void setPageNumber(int pageNumberToDisplay) {
        this.pageNumber = pageNumberToDisplay;
    }

    public void setSortedByAuthors(boolean sorted) {
        isSortedByAuthors = sorted;
    }

    public List<Book> getBooksForDisplay(List<Book> books) {
        if (isSortedByAuthors) {
            books.sort(new BookComparator());
        }
        if (pageNumber == 0) {
            return books; //если paging не указан, то база данных возвращает все найденные книги.
        } else {
            int from = pageSize * (pageNumber - 1);
            int to = (pageSize + pageSize * (pageNumber - 1));
            return books.subList(from, to);
        }
    }


}

