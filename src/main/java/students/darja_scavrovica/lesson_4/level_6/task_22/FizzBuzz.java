package students.darja_scavrovica.lesson_4.level_6.task_22;

class FizzBuzz {
    public String detect(int number) {
        if (number % 3==0 && number% 5 ==0 ){ return "FizzBuzz";}
        else if (number % 5==0){return "Buzz";}
        else if (number % 3==0 ){return "Fizz";}
        else return "" + number;
    }

}
