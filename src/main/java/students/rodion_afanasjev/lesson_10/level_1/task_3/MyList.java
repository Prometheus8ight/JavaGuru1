package students.rodion_afanasjev.lesson_10.level_1.task_3;

interface MyList {

    void addNewElement(Object object); // Добавить новый элемент и изменить длинну массива

    void deleteElementByIndex(int index); // Удалить элемент массива по индексу

    void deleteAllElements(Object object); // Удалить все элементы массива

    void sortElements(); // Сортировать элементы массива

    void searchElementByIndex(int index); // Поиск элемента по индексу

    void getIndexInfo(); // Вывести информацию об элементе индекса

    boolean isEmpty(); // Проверка пустой ли элемент массива

}
