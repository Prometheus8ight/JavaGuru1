package students.bogdans_pavlovs.lesson_9.task_5;

class SafeDemo {

    public static void main(String[] args) {

        Safe safe = new Safe("#1234", 200);
        System.out.println(safe.getMoney());

        safe.deposit("#1234", 200);
        System.out.println(safe.getMoney());

        safe.withdraw("#1234", 150);
        System.out.println(safe.getMoney());

        safe.withdraw("6969", 250);
        System.out.println(safe.getMoney());

    }
}
