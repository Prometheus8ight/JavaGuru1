package students.alex_kalashnikov.lesson_9.level_2.task_8;

class ProtectedClass {

    /*
    Модификатор protected необходим, чтобы только дочерние классы
    имели доступ к переменным и методам родительского класса.
    Для самого класса такой модификатор не нужен, потому, что
    дочерние классы ссылаются на родительский класс через extends

     */
    private String title;
    private String author;

}
