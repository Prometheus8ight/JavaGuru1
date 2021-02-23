package students.alex_kalashnikov.lesson_5.level_2.task_14;

class ArrayInt {

    public static void main(String[] args) {

        int[] numbers = {(int) (Math.pow(-2,31) + (Math.random() * Math.pow(2,32))), (int) (Math.pow(-2,31) + (Math.random() * Math.pow(2,32))), (int) (Math.pow(-2,31) + (Math.random() * Math.pow(2,32)))};
        long sum = 0;  // сумма трех рандомных int может превышать пределы значений int, поэтому тип суммы - long.

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        long average = sum / numbers.length;

        System.out.println("average = " + average);
    }

}