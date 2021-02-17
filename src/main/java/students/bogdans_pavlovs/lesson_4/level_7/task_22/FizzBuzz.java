package students.bogdans_pavlovs.lesson_4.level_7.task_22;

class FizzBuzz {

        public String detect(int number) {

            if (number != 0 && number % 3 == 0 && number % 5 == 0) {
                return "FizzBuzz";
            } else if (number != 0 && number % 3 == 0) {
                return "Fizz";
            } else if (number != 0 && number % 5 == 0) {
                return "Buzz";
            } else {
                return "" + number;
            }
        }
}

/*
            // Реализуйте следующие требования:
            // - если переданное число делится на три возвращайте "Fizz"
            // - если переданное число делится на пять возвращайте "Buzz"
            // - если переданное число делится на три и на пять возвращайте "FizzBuzz"
            // - иначе возвращайте само число в виде строки (подсказка: return "" +  number)
 */