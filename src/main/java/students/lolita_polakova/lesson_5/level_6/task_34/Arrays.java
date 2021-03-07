package students.lolita_polakova.lesson_5.level_6.task_34;

class Arrays {

    public int[] create(int length) {
        return new int[length];
    }

    public void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}