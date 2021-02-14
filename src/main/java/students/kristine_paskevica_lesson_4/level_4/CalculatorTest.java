package students.kristine_paskevica_lesson_4.level_4;

 class CalculatorTest {

     public static void main(String[] args) {

         CalculatorTest calculatorTest = new CalculatorTest();  // veido jaunu objektu, lai notestētu sum metodi
         calculatorTest.sumTest();
     }

     public void sumTest() {
         int firstNumber = 10;                          // подготавливаем тестовые данные
         int secondNumber = 5;                          // подготавливаем тестовые данные
         int expectedResult = 15;                       // подготавливаем тестовые данные
         Calculator calculator = new Calculator();
         int realResult = calculator.summeshana(firstNumber, secondNumber);  // вызываем продакшен код, который хотим протестировать
         if (realResult == expectedResult) {            // проверяем правильно ли сработал тестируемый код
             System.out.println("Sum test = OK");
         } else {
             System.out.println("Sum test = FAIL");
         }

         CalculatorTest calculatorTest = new CalculatorTest();  // veido jaunu objektu, lai notestētu starpibas metodi
         calculatorTest.starpibaTest();
         }

         public void starpibaTest() {
             int firstNumber = 10;
             int secondNumber = 5;
             int expectedResult = 5;
             Calculator calculator = new Calculator();
             int realResult = calculator.starpiba(firstNumber, secondNumber);
             if (realResult == expectedResult) {
                 System.out.println("Starpības tests = OK");
             } else {
                 System.out.println("Starpības tests= FAIL");
             }


             CalculatorTest calculatorTest = new CalculatorTest();  // veido jaunu objektu, lai notestētu reizinājuma metodi
             calculatorTest.reizinajumsTest();
         }

         public void reizinajumsTest() {
            int firstNumber = 10;
            int secondNumber = 5;
            int expectedResult = 50;
            Calculator calculator = new Calculator();
            int realResult = calculator.reizinajums(firstNumber, secondNumber);
            if (realResult == expectedResult) {
                System.out.println("Reizinājuma tests = OK");
             }  else {
                System.out.println("Reizinājuma tests= FAIL");
            }

             CalculatorTest calculatorTest = new CalculatorTest();  // veido jaunu objektu, lai notestētu dalīšanas metodi
             calculatorTest.dalishanasTest();
         }

         public void dalishanasTest() {
            int firstNumber = 10;
            int secondNumber = 5;
            int expectedResult = 2;
            Calculator calculator = new Calculator();
            int realResult = calculator.dalishana(firstNumber, secondNumber);
            if (realResult == expectedResult) {
             System.out.println("Dalīšanas tests = OK");
            }  else {
                 System.out.println("Dalīšanas tests= FAIL");
         }


     }}
