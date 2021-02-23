package students.alex_kalashnikov.lesson_5.level_6.task_38;

class ArrayDemo {

    public static void main(String[] args) {

        Arrays object = new Arrays();

        int[] array = object.create(5);
        object.fillRandomly(array);
        object.print(array);
        object.findMax(array);
        object.findMin(array);

        System.out.println("=================================================");
        System.out.print("Max number is: ");
        System.out.println(object.findMax(array));
        System.out.println("=================================================");
        System.out.print("Min number is: ");
        System.out.println(object.findMin(array));

    }

}
