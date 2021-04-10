package students.rodion_afanasjev.lesson_12.level_3.task_18;

class NullPointerExceptionDemo {

    public static void main(String[] args) {

        String container = null;
        System.out.println(container.length());

        // Исключение NullPointerException вылетает когда мы пытаемся что-то
        // Сделать с тем, чего нету.
        // String container = контейнер для хранения строк
        // null = пустота ( не void )

    }

}
