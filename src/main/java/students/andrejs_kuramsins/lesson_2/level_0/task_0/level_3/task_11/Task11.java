package students.andrejs_kuramsins.lesson_2.level_0.task_0.level_3.task_11;

class Task11 {
    public static void main(String[] args) {

            System.out.println("Enter your number a : ");
            java.util.Scanner scanner = new java.util.Scanner(System.in);
            double a = scanner.nextDouble();

            System.out.println("Enter your number b : ");
            double b = scanner.nextDouble();

            System.out.println("Enter your number c : ");
            double c = scanner.nextInt();

            double arithmetic = (a + b + c) / 3;

            System.out.println("The medium arithmetic of your numbers " + "= " + arithmetic );


        }
    }
