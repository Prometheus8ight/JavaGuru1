package instructor.lesson_10.strategy;

class Bird implements Walkable, Flyable {

    @Override
    public void fly() {
        System.out.println("Flying like a bird");
    }

    @Override
    public void walk() {
        System.out.println("Walking like a bird");
    }
}
