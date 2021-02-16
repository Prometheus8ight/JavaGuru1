package students.alex_kalashnikov.lesson_4.level_7.task_22;

class FizzBuzz {

    // int number;

    public String detect(int number) {

    //   java.util.Scanner scanner = new java.util.Scanner(System.in);
    //   System.out.print("Enter number: ");
    //   number = scanner.nextInt();

       if (number % 3 == 0 && number % 5 == 0) {
           return "FizzBuzz";
       }
       else if (number % 5 == 0) {
           return "Buzz";
       }
       else if (number % 3 == 0) {
           return "Fizz";
       }
       else {
           return "" + number;
       }
    }
}
