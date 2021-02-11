package students.vitaly_porsev.lesson_4.level_3.task_8;

import java.util.Scanner;

public class ThreeNum {

    void equalOrDifferent(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите три цифры: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if(a == b && b == c){
            System.out.println("All numbers are equal");
        }else if(a != b && b != c && c != a){
            System.out.println("All numbers are different");
        }else{
            System.out.println("Neither all are equal or different");
        }
    }
}
