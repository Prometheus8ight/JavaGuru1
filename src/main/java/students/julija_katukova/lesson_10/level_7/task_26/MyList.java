package students.julija_katukova.lesson_10.level_7.task_26;

interface MyList {

    void addNewElement(Object object); //extend list length and adding new element without copying all data

    void deleteElement(Object object); // delete object info and empty element

    void sortElements(); //sort elements without loops

    void clear(); // removes all of the elements

    boolean contains(Object object); // This method returns true if this list contains the specified element.

}
