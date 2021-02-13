package students.rodion_afanasjev.lesson_4.level_7.task_22;

class FizzBuzzDemo {

    public static void main(String[] args) {

        FizzBuzz fizzBuzz = new FizzBuzz();
        String game = fizzBuzz.detect(30);
        System.out.println(game);

        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
        fizzBuzzTest.fizzTest();
        fizzBuzzTest.buzzTest();
        fizzBuzzTest.fizzBuzzTest();
        fizzBuzzTest.returnTest();

    }

}
