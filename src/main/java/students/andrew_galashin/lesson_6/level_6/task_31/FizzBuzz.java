package students.andrew_galashin.lesson_6.level_6.task_31;

class FizzBuzz {


    private int Number;

    public String detect(int number) {
        this.Number = number;
        if ((Number % 3 == 0) && (Number % 5 == 0)) return "FizzBuzz";
        else if (Number % 3 == 0) return "Fizz";
        else if (Number % 5 == 0) return "Buzz";
        else return "" + Number;
    }

}

