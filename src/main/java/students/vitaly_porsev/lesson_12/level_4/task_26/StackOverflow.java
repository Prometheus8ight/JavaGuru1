package students.vitaly_porsev.lesson_12.level_4.task_26;

public class StackOverflow {
    public static void main(String[] args) {
        System.out.println(recursionSum(100));
    }


    public static int recursionSum(int sum) {
        return recursionSum(sum + sum);
    }
}

