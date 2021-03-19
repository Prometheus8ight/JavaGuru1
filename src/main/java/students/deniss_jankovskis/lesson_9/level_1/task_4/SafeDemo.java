package students.deniss_jankovskis.lesson_9.level_1.task_4;

public class SafeDemo {

    public static void main(String[] args) {

        Safe safe = new Safe();
        safe.pinCode = 5042;
        safe.money = 3000;

        System.out.println("PIN " + safe.pinCode);
        System.out.println("Amount of money: " + safe.money + " EUR");
    }
}
