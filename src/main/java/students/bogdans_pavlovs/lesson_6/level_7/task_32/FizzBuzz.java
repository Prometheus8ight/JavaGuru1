package students.bogdans_pavlovs.lesson_6.level_7.task_32;

/*
Подсказка: а нужно ли свойство класса initialNumber?
Или метод detect можно реализовать без него?
 */


class FizzBuzz {

    public String detect(int number) {
        if ((number % 3 == 0) && (number % 5 == 0)) return "FizzBuzz";
        else if (number % 3 == 0) return "Fizz";
        else if (number % 5 == 0) return "Buzz";
        else return "" + number;
    }

}
