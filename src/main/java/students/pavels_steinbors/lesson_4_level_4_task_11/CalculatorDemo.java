package students.pavels_steinbors.lesson_4_level_4_task_11;

class CalculatorDemo {

    public static void main(String[] args) {

        Calculator calculator1 = new Calculator();

        System.out.println("Сумма: " + calculator1.sum(80, 20));
        System.out.println("Разница: " + calculator1.subtraction(21, 11));
        System.out.println("Деление: " + calculator1.divide(100, 25));
        System.out.println("Умножение: " + calculator1.multiplication(85, 19));
    }
}
