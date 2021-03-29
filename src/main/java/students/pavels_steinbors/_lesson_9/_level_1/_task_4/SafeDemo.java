package students.pavels_steinbors._lesson_9._level_1._task_4;

class SafeDemo {

    public static void main(String[] args) {

        Safe safe = new Safe();
        safe.money = 500;
        safe.pin = 3434;
        System.out.println("Money in safe = " + safe.money);
        System.out.println("Pin number is: " + safe.pin);
    }
}
