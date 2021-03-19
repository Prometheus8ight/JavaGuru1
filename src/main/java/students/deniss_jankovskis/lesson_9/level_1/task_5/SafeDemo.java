package students.deniss_jankovskis.lesson_9.level_1.task_5;

class SafeDemo {

    public static void main(String[] args) {

        Safe safe = new Safe(5042, 100);
        safe.checkPassword(5042);
        safe.putMoney(5042, 50);
        safe.getMoney(5042,150);

        System.out.println(safe);
    }
}
