package students.alex_kalashnikov.lesson_10.level_3.task_6;

@FunctionalInterface
interface Shape {

    double calculateArea(double size);

}

// Функциональный интерфейс содержит один
// и только один абстрактный метод. Так же
// позволяет выразить метод без создания
// экземпляра класса (лямбда-выражение)