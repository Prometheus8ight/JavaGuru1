package students.arkadij.lesson_4.task_22;

class FizzBuzzDemo {

    public static void main(String[] args) {

        FizzBuzz fizzBuzz = new FizzBuzz();
        String something = fizzBuzz.detect(9);
        System.out.println(something);
        String somethingTwo = fizzBuzz.detect(10);
        System.out.println(somethingTwo);
        String somethingThree = fizzBuzz.detect(30);
        System.out.println(somethingThree);

        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
        fizzBuzzTest.fizzTest();
        fizzBuzzTest.buzzTest();
        fizzBuzzTest.fizzBuzzTest();
        fizzBuzzTest.numberTest();

    }

}
