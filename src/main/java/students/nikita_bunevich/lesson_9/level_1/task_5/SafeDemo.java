package students.nikita_bunevich.lesson_9.level_1.task_5;

class SafeDemo {
    public static void main(String[] args) {
        Safe safe = new Safe(1234, 0);
        safe.printAccountBalance();
        safe.putMoney(1235, 1000);
        safe.printAccountBalance();
        safe.putMoney(1234, 1000);
        safe.printAccountBalance();
        safe.getMoney(1246, 50);
        safe.printAccountBalance();
        safe.getMoney(1234, 20);
        safe.printAccountBalance();
        safe.getMoney(1234, 990);
        safe.printAccountBalance();

    }
}
