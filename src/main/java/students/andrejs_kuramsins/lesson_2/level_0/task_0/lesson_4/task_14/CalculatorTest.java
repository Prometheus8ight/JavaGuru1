package students.andrejs_kuramsins.lesson_2.level_0.task_0.lesson_4.task_14;

 class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.multiTest();
        calculatorTest.divTest();
        calculatorTest.evenOrNotTest();
        calculatorTest.firstHighestTest();
        calculatorTest.secondHighestTest();
        calculatorTest.bothEqualTest();



    }


    public void sumTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 15;
        Calculator calculator = new Calculator();
        int realResult = calculator.sum(firstNumber, secondNumber);  //
        if (realResult == expectedResult) {
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }

    public void subTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 5;
        Calculator calculator = new Calculator();
        int realResult = calculator.sub(firstNumber, secondNumber);  //
        if (realResult == expectedResult) {
            System.out.println("Sub test = OK");
        } else {
            System.out.println("Sub test = FAIL");
        }
    }
    public void multiTest () {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 50;
        Calculator calculator = new Calculator();
        int realResult = calculator.multi(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Multi test = OK");
        } else {
            System.out.println("Multi test = FAIL");
        }
    }

    public void divTest () {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 2;
        Calculator calculator = new Calculator();
        int realResult = calculator.div(firstNumber, secondNumber);  //
        if (realResult == expectedResult) {
            System.out.println("Div test = OK");
        } else {
            System.out.println("Div test = FAIL");
        }
    }
    public void evenOrNotTest () {
        int yourNumber = 11;
        boolean expectedResult = true;
        Calculator calculator = new Calculator();
        boolean realResult = calculator.evenOrNot(yourNumber);
        if (realResult == expectedResult) {
            System.out.println("Even or not  test = OK");
        } else {
            System.out.println("Even or not test = FAIL");
        }
    }
    public void firstHighestTest () {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumber(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("First highest  test = OK");
        } else {
            System.out.println("First highest test = FAIL");
        }
    }
     public void secondHighestTest() {
         int firstNumber = 10;
         int secondNumber = 55;
         int expectedResult = 55;
         Calculator calculator = new Calculator();
         int realResult = calculator.maxOfTwoNumber(firstNumber, secondNumber);
         if (realResult == expectedResult) {
             System.out.println("Second highest  test = OK");
         } else {
             System.out.println("Second highest = FAIL");
         }
     }

         public void bothEqualTest () {
             int firstNumber = 5;
             int secondNumber = 5;
             int expectedResult = 5;
             Calculator calculator = new Calculator();
             int realResult = calculator.maxOfTwoNumber(firstNumber, secondNumber);
             if (realResult == expectedResult) {
                 System.out.println("Both equal  test = OK");
             } else {
                 System.out.println("Both equal test = FAIL");
             }
         }

}
