package students.bogdans_pavlovs.lesson_4.level_4.task_14;

class Calculator {

    //Basic operations
    public int add ( int firstNumber, int secondNumber){ return firstNumber + secondNumber; }
    public int subtract ( int firstNumber, int secondNumber){ return firstNumber - secondNumber; }
    public int divide ( int firstNumber, int secondNumber){ return firstNumber / secondNumber; }
    public int multiply ( int firstNumber, int secondNumber){ return firstNumber * secondNumber; }

    //Even or Odd
    public boolean isEven (int yourNumber){

        if(yourNumber % 2 == 0){
            return true;
        } else {
            return false;
        }

    }

    //Highest of Two
    public int highestOfTwo(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber){
            return firstNumber;
        } else {
            return secondNumber;
        }
    }

}
