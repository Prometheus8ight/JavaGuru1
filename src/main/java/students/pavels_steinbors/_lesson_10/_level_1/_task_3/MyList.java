package students.pavels_steinbors._lesson_10._level_1._task_3;

interface MyList {

    void add(Object item); // добавляет в коллекцию новый элемент;

    boolean contains(Object obj); // возвращает true, если объект obj содержится в коллекции и false, если нет;

    void clear(); // удаляет все элементы коллекции;

    void remove(Object obj); // удаляет из коллекции элемент obj.
}
