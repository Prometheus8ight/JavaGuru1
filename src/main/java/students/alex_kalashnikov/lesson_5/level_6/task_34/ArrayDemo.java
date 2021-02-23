package students.alex_kalashnikov.lesson_5.level_6.task_34;

class ArrayDemo {

    public static void main(String[] args) {

        Arrays object = new Arrays();

        int[] array = object.create(5);
        object.fillRandomly(array);
        object.print(array);
    }

}
