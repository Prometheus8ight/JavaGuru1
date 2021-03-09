package students.alex_kalashnikov.lesson_7.level_6.task_12;

class ArrayCopyDemo {

    public static void main(String[] args) {

        ArrayCopy newObject = new ArrayCopy();
        int[] array = newObject.fillRandomly(newObject.create(20));
        newObject.copyInRange(array, -25, 25);

    }

}
