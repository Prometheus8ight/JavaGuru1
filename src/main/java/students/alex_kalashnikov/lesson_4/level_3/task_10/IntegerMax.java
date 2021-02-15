package students.alex_kalashnikov.lesson_4.level_3.task_10;

class IntegerMax {

    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter first integer: ");
        int intFirst = scanner.nextInt();

        System.out.print("Enter second integer: ");
        int intSecond = scanner.nextInt();

        System.out.print("Enter third integer: ");
        int intThird = scanner.nextInt();

        /* 1) int1 > int2 и int1 > int3;
           2) int1 > int2 и int1 = int3;
           3) int1 = int2 и int1 > int3;

           4) int2 > int1 и int2 > int3;
           5) int2 > int1 и int2 = int3;
           6) int2 = int1 и int2 > int3;

           7) int3 > int1 и int3 > int2;
           8) int3 > int1 и int3 = int2;
           9) int3 = int1 и int3 > int2;

          10) int1 = int2 = int3;
        */

        if (intFirst > intSecond && intFirst > intThird) {             // 1
            System.out.println(intFirst);
        }
        else if (intFirst > intSecond && intFirst == intThird) {       // 2
            System.out.println(intFirst);
        }
        else if(intFirst == intSecond && intFirst > intThird) {        // 3
            System.out.println(intFirst);
        }
        else if(intSecond > intFirst && intSecond > intThird) {        // 4
            System.out.println(intSecond);
        }
        else if(intSecond > intFirst && intSecond == intThird) {       // 5
            System.out.println(intSecond);
        }
        else if(intSecond == intFirst && intSecond > intThird) {       // 6
            System.out.println(intSecond);
        }
        else if(intThird > intFirst && intThird > intSecond) {         // 7
            System.out.println(intThird);
        }
        else if(intThird > intFirst && intThird == intSecond) {        // 8
            System.out.println(intThird);
        }
        else if(intThird == intFirst && intThird > intSecond) {        // 9
            System.out.println(intThird);
        }
        else {
            System.out.println("All integers are equal");              // 10
        }

    }

}
