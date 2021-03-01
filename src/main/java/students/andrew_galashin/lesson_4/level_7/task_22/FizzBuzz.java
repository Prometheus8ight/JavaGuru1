package students.andrew_galashin.lesson_4.level_7.task_22;

class FizzBuzz {

   public String detect(int number){

            if (number != 0 && number % 3 == 0 && number % 5 == 0){
                return "FizzBuzz";
            }
            else if (number != 0 && number % 5 == 0){
                return "Buzz";
            }
            else if (number != 0 && number % 3 == 0){
                return "Fizz";
        }
            else {
                return "Error";
            }
        }
    }
