package students.alex_kalashnikov.lesson_4.level_2.task_5;

class IntegerMax {

    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter integer One: ");
        int intOne = scanner.nextInt();

        System.out.print("Enter integer Two: ");
        int intTwo = scanner.nextInt();

        if (intOne > intTwo) {
            System.out.println(intOne);
        }
        else {
            System.out.println(intTwo);
        }

    }

}
