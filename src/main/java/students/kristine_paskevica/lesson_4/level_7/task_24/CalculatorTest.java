package students.kristine_paskevica.lesson_4.level_7.task_24;

 class CalculatorTest {
     public static void main(String[] args) {

        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.mulTest();
        calculatorTest.divTest();
        calculatorTest.isEvenTest1();
        calculatorTest.isEvenTest2();
 }

 public void patrRezultataParbaude(boolean realRezu, boolean rezParbaude){
         if(realRezu == rezParbaude){
             System.out.println("Ir pareizi");
         }
         else{
             System.out.println("Nav pareizi");
         }
 }
     public void rezultataParbaude(int realRezu, int rezParbaude) {
         if (realRezu == rezParbaude) {
             System.out.println("Ir pareizi");
         } else {
             System.out.println("Nav pareizi");
         }
     }
     public void sumTest() {
         int firstNumber = 45;
         int secondNumber = 40;
         int rezParbaude = 85;
         Calculator calculator = new Calculator();
         int realRezu = calculator.sum(firstNumber, secondNumber);
         rezultataParbaude(realRezu, rezParbaude);
     }

     public void subTest() {
         int firstNumber = 35;
         int secondNumber = 10;
         int rezParbaude = 25;
         Calculator calculator = new Calculator();
         int realRezu = calculator.sub(firstNumber, secondNumber);
         rezultataParbaude(realRezu, rezParbaude);
     }

     public void mulTest() {
         int firstNumber = 2;
         int secondNumber = 5;
         int rezParbaude = 10;
         Calculator calculator = new Calculator();
         int realRezu = calculator.mul(firstNumber, secondNumber);
         rezultataParbaude(realRezu, rezParbaude);
     }

     public void divTest() {
         int firstNumber = 40;
         int secondNumber = 8;
         int rezParbaude = 5;
         Calculator calculator = new Calculator();
         int realRezu = calculator.div(firstNumber, secondNumber);
         rezultataParbaude(realRezu, rezParbaude);
     }

     public void isEvenTest1() {
         Calculator calculator = new Calculator();
         boolean rezParbaude = true;
         boolean realRezu = calculator.isEven(20);
         patrRezultataParbaude(realRezu, rezParbaude);
     }

     public void isEvenTest2() {
         Calculator calculator = new Calculator();
         boolean rezParbaude = false;
         boolean realRezu = calculator.isEven(21);
         patrRezultataParbaude(realRezu, rezParbaude);
     }
 }



