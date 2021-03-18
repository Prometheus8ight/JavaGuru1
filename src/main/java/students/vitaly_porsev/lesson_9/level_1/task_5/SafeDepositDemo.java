package students.vitaly_porsev.lesson_9.level_1.task_5;

class SafeDepositDemo {
    public static void main(String[] args) {
        SafeDeposit safeDeposit = new SafeDeposit(2121, 500);
        safeDeposit.getMoney(2121, 600);
        System.out.println(safeDeposit);
    }
}