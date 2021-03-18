package students.rodion_afanasjev.lesson_9.level_1.task_5;

class SafeDemo {

    public static void main(String[] args) {

        Safe safe = new Safe(123, 50);
        safe.putMoney(123, 50);
        System.out.println(safe);
        safe.getMoney(123, 75);
        System.out.println(safe);
    }

}
