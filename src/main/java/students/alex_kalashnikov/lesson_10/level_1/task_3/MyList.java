package students.alex_kalashnikov.lesson_10.level_1.task_3;

interface MyList {

    void add(Object x); // добавляет объект X в список

    void delete(Object x); // удаляет объект X из списка

    void delete(int index); // удаляет объект с указанным индексом из списка

    void editObject(Object x); // вносит изменения в объект X

    void editObject(int index); // вносит изменения в объект в указанной ячейке

    Object[] showAll(Object[] array); // возвращает значение всего списка

    Object showObject(int index); // возвращает объект находящийся в указанной ячейке

    int showSize(Object[] array); // возвращает кол-во элементов

    int showIndex(Object x); // возвращает номер ячейки, где хранится указанный объект

    boolean contains(Object x); // возвращает true, если объект находится в списке

    Object[] sortByData(String data); // возвращает список только с объектами содержащими data (сортирует по data)

}