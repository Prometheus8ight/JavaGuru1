package students.alex_kalashnikov.lesson_5.level_5.task_33;

class Arrays {

    public int[] create(int length) {
        return new int[length];
    }

    public void fillRandomly(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.pow(-2,31) + Math.random() * Math.pow(2,32));
       }

    }
}
