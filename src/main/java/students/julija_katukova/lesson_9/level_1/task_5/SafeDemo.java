package main.java.students.julija_katukova.lesson_9.level_1.task_5;

class SafeDemo {

    public static void main(String[] args) {

        Safe safe = new Safe(1234, 0);
        safe.printAccountBalance();
        safe.putMoney(1236, 100);
        safe.printAccountBalance();
        safe.putMoney(1234, 100);
        safe.printAccountBalance();
        safe.getMoney(1246, 20);
        safe.printAccountBalance();
        safe.getMoney(1234, 20);
        safe.printAccountBalance();
        safe.getMoney(1234, 150);
        safe.printAccountBalance();

    }
}
