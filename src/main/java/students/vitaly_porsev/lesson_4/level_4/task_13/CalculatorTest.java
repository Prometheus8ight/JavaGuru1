package students.vitaly_porsev.lesson_4.level_4.task_13;

class CalculatorTest {

    public void isEvenTest(){
        boolean expectedResult = true;
        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven(10);
        if (realResult == expectedResult) {
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }

}