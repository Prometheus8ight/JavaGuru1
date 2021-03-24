package instructor.lesson_10.strategy;

class Shoe implements Flyable {

    @Override
    public void fly() {
        System.out.println("Flying like a shoe");
    }
}
