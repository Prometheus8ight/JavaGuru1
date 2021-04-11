package students.deniss_jankovskis.lesson_11.level_7;

import java.util.List;

class PageCriteria {

    private int pageNumber;
    private int pageSize;
    private boolean sortByAuthor;

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public void setSortByAuthor(boolean sortByAuthor) {
        this.sortByAuthor = sortByAuthor;
    }

    public List<Book> bookList(List<Book> books) {
        if (sortByAuthor) {
            books.sort(new BookComparator());
        }
        if (pageNumber == 0) {
            return books;
        } else {
            int fromIndex = pageSize * (pageNumber - 1);
            int toIndex = (pageSize + pageSize * (pageNumber - 1));
            return books.subList(fromIndex, toIndex);
        }
    }
}



