package students.deniss_jankovskis.lesson_4.level_7;

class FizzBuzz {

    public String detect(int number) {

      if (number % 3 == 0) { //если переданное число делится на три возвращайте "Fizz"
            return "Fizz";
        }
        else if (number % 5 == 0) { //если переданное число делится на пять возвращайте "Buzz"
            return "Buzz";
        }
        else if (number % 3 == 0 && number % 5 == 0) { //если переданное число делится на три и на пять возвращайте "FizzBuzz"
            return "FizzBuzz";
        }
        else //иначе возвращайте само число в виде строки (подсказка: return "" +  number)
            return "" +  number;


    }
}
