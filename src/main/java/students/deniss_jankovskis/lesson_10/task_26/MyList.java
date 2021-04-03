package students.deniss_jankovskis.lesson_10.task_26;

interface MyList {

    boolean isEmpty(Object obj); //returns true if this list has no elements
    void add(Object obj); //insert the specified element at the specified position in a list
    void delete(Object obj); //remove all of the elements from this list
    void sort(); //sort the elements of the list on the basis of specified comparator
}
