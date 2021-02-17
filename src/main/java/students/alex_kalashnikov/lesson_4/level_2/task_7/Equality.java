package students.alex_kalashnikov.lesson_4.level_2.task_7;

class Equality {

    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter integer One: ");
        int intOne = scanner.nextInt();

        System.out.print("Enter integer Two: ");
        int intTwo = scanner.nextInt();

        if (intOne == intTwo) {
            System.out.println("Numbers are equals");
        }
        else {
            System.out.println("Numbers are different");
        }

    }

}