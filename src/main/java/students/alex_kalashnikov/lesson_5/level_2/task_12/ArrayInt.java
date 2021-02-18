package students.alex_kalashnikov.lesson_5.level_2.task_12;

class ArrayInt {

    public static void main(String[] args) {

        int[] numbers = {(int) (Math.pow(-2,31) + (Math.random() * Math.pow(2,32))), (int) (Math.pow(-2,31) + (Math.random() * Math.pow(2,32))), (int) (Math.pow(-2,31) + (Math.random() * Math.pow(2,32)))};

        for (int i = 0; i < numbers.length; i++) {


            System.out.println("Index[" + i + "]: " + numbers[i]);
        }
    }

}