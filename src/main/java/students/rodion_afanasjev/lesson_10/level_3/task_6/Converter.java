package students.rodion_afanasjev.lesson_10.level_3.task_6;

@FunctionalInterface
public interface Converter<T, N> {

    N convert(T t);

    // Функциональный интерфейс в Java – это интерфейс, который содержит только 1 абстрактный метод.

}
