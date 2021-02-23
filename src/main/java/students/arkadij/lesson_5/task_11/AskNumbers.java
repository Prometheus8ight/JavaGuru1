package students.arkadij.lesson_5.task_11;
import java.util.Scanner;

class AskNumbers {

    public static void main(String[] args) {
        System.out.println("Please write down three numbers: ");
        Scanner hisNum = new Scanner(System.in);
        String theNumOne = hisNum.nextLine();
        String theNumTwo = hisNum.nextLine();
        String theNumThree = hisNum.nextLine();

        System.out.println("Your typed numbers are:");

        String[] values = {theNumOne,theNumTwo,theNumThree};
        for (String numbers : values){
            System.out.println(numbers);
        }
    }

}
