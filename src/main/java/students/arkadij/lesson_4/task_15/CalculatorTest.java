package students.arkadij.lesson_4.task_15;

class CalculatorTest {

    public void maxANumberTest(){
        int a = 10;
        int b = 5;
        int c = 5;
        int expectedNumber = 10;
        Calculator calculator = new Calculator();
        int realNumber = calculator.maxOfThree(a,b,c);
        if (realNumber == expectedNumber){
            System.out.println("WELL DONE! [A] MAX");
        } else {
            System.out.println("FAIL! [A] MAX");
        }
    }

    public void maxBNumberTest(){
        int a = 5;
        int b = 10;
        int c = 5;
        int expectedNumber = 10;
        Calculator calculator = new Calculator();
        int realNumber = calculator.maxOfThree(a,b,c);
        if (realNumber == expectedNumber){
            System.out.println("WELL DONE! [B] MAX");
        } else {
            System.out.println("FAIL! [B] MAX");
        }
    }

    public void maxCNumberTest(){
        int a = 5;
        int b = 5;
        int c = 10;
        int expectedNumber = 10;
        Calculator calculator = new Calculator();
        int realNumber = calculator.maxOfThree(a,b,c);
        if (realNumber == expectedNumber){
            System.out.println("WELL DONE! [C] MAX");
        } else {
            System.out.println("FAIL! [C] MAX");
        }
    }

    public void moreEqualABThanCNumberTest(){
        int a = 10;
        int b = 10;
        int c = 5;
        int expectedNumber = 10;
        Calculator calculator = new Calculator();
        int realNumber = calculator.maxOfThree(a,b,c);
        if (realNumber == expectedNumber){
            System.out.println("WELL DONE! [A=B] MORE");
        } else {
            System.out.println("FAIL! [A=B] MORE");
        }
    }

    public void lessEqualABThanCNumberTest(){
        int a = 5;
        int b = 5;
        int c = 10;
        int expectedNumber = 10;
        Calculator calculator = new Calculator();
        int realNumber = calculator.maxOfThree(a,b,c);
        if (realNumber == expectedNumber){
            System.out.println("WELL DONE! [A=B] LESS");
        } else {
            System.out.println("FAIL! [A=B] LESS");
        }
    }

    public void moreEqualACThanBNumberTest(){
        int a = 10;
        int b = 5;
        int c = 10;
        int expectedNumber = 10;
        Calculator calculator = new Calculator();
        int realNumber = calculator.maxOfThree(a,b,c);
        if (realNumber == expectedNumber){
            System.out.println("WELL DONE! [A=C] MORE");
        } else {
            System.out.println("FAIL! [A=C] MORE");
        }
    }

    public void lessEqualACThanBNumberTest(){
        int a = 5;
        int b = 10;
        int c = 5;
        int expectedNumber = 10;
        Calculator calculator = new Calculator();
        int realNumber = calculator.maxOfThree(a,b,c);
        if (realNumber == expectedNumber){
            System.out.println("WELL DONE! [A=C] LESS");
        } else {
            System.out.println("FAIL! [A=C] LESS");
        }
    }

    public void moreEqualBCThanANumberTest(){
        int a = 5;
        int b = 10;
        int c = 10;
        int expectedNumber = 10;
        Calculator calculator = new Calculator();
        int realNumber = calculator.maxOfThree(a,b,c);
        if (realNumber == expectedNumber){
            System.out.println("WELL DONE! [B=C] MORE");
        } else {
            System.out.println("FAIL! [B=C] MORE");
        }
    }

    public void lessEqualBCThanANumberTest(){
        int a = 10;
        int b = 5;
        int c = 5;
        int expectedNumber = 10;
        Calculator calculator = new Calculator();
        int realNumber = calculator.maxOfThree(a,b,c);
        if (realNumber == expectedNumber){
            System.out.println("WELL DONE! [B=C] LESS");
        } else {
            System.out.println("FAIL! [B=C] LESS");
        }
    }

    public void aBCNumberEqualTest(){
        int a = 10;
        int b = 10;
        int c = 10;
        int expectedNumber = 10;
        Calculator calculator = new Calculator();
        int realNumber = calculator.maxOfThree(a,b,c);
        if (realNumber == expectedNumber){
            System.out.println("WELL DONE! [A=B=C]");
        } else {
            System.out.println("FAIL! [A=B=C]");
        }
    }

}
