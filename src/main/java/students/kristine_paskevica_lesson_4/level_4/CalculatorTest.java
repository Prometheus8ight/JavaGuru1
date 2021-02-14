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
         } else {
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
         } else {
             System.out.println("Dalīšanas tests= FAIL");
         }

         CalculatorTest calculatorTest = new CalculatorTest();  // veido jaunu objektu, lai notestētu pāra skaitļa noteikšanas metodi
         calculatorTest.paraSkaitlis();
     }

     public void paraSkaitlis() {
         int skaitlis = 10;
         boolean expectedResult = true;
         Calculator calculator = new Calculator();
         boolean realResult = calculator.paraNepara(skaitlis);
         if (realResult == expectedResult) {
             System.out.println("Pāra skaitļa pārbaude ir precīza");
         } else {
             System.out.println("Pāra skaitļa Pārbaude nav precīza");
         }

         CalculatorTest calculatorTest = new CalculatorTest();  // veido jaunu objektu, lai notestētu nepāra skaitļa noteikšanas metodi
         calculatorTest.neparaSkaitlis();
     }

     public void neparaSkaitlis() {
         int skaitlis = 11;
         boolean expectedResult = false;
         Calculator calculator = new Calculator();
         boolean realResult = calculator.paraNepara(skaitlis);
         if (realResult == expectedResult) {
             System.out.println("Nepāra skaitļa pārbaude ir precīza");
         } else {
             System.out.println("Nepāra skaitļa pārbaude nav precīza");
         }

         CalculatorTest calculatorTest = new CalculatorTest();  // veido jaunu objektu, lai notestētu nepāra skaitļa noteikšanas metodi
         calculatorTest.pirmaisSkLiel();
        }
     public void pirmaisSkLiel(){
         int skaitlis1 = 11;
         int skaitlis2 = 9;
         int expectedResult = 11;
         Calculator calculator = new Calculator();
         int realResult = calculator.lielSkaitlis(skaitlis1, skaitlis2);
         if (realResult == expectedResult){
             System.out.println("Pirmais skaitlis ir lielāks - precīza pārbaude");
         }
         else{
             System.out.println("Pirmais skaitlis ir lielāks - neprecīza pārbaude");
         }
         CalculatorTest calculatorTest = new CalculatorTest();  // veido jaunu objektu, lai notestētu nepāra skaitļa noteikšanas metodi
         calculatorTest.otraisSkLiel();
     }
     public void otraisSkLiel() {
         int skaitlis1 = 11;
         int skaitlis2 = 12;
         int expectedResult = 12;
         Calculator calculator = new Calculator();
         int realResult = calculator.lielSkaitlis(skaitlis1, skaitlis2);
         if (realResult == expectedResult) {
             System.out.println("Otrais skaitlis ir lielāks - precīza pārbaude");
         } else {
             System.out.println("Otrais skaitlis ir lielāks - neprecīza pārbaude");
         }

         CalculatorTest calculatorTest = new CalculatorTest();
         calculatorTest.vienadi();
     }
         public void vienadi(){
             int expectedResult = 50;
             Calculator calculator = new Calculator();
             int realResult = calculator.lielSkaitlis(50, 50);
             if (realResult == expectedResult) {
                 System.out.println("Vienādu skaitļu pārbaude ir precīza");
             } else {
                 System.out.println("Vienādu skaitļu pārbaude nav precīza");
             }

 }}
