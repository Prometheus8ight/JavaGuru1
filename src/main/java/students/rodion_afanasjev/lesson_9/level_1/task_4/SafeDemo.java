package students.rodion_afanasjev.lesson_9.level_1.task_4;

class SafeDemo {

    public static void main(String[] args) {

        Safe safe = new Safe();
        int pin = safe.pinCode = 123;
        int money = safe.moneyAmount = 50;

        System.out.println("Pin code : " + pin);
        System.out.println("Money amount : " + money);

    }

}
