package students.nikita_bunevich.lesson_9.level_1.task_4;

public class SafeDemo {
    public static void main(String[] args) {
        Safe safe = new Safe();
        System.out.println("Ваш пин: " + safe.pin +" Ваш счет: " + safe.money);
        safe.pin = 12414;
        safe.money = 123.45;
        System.out.println("Ваш пин: " + safe.pin + " Ваш счет: " + safe.money);
        safe.money = 1;
        System.out.println("Ваш пин: " + safe.pin + " Ваш счет: " + safe.money);

    }
}
