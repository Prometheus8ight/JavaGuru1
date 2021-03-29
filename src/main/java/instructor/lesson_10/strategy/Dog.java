package instructor.lesson_10.strategy;

class Dog implements Walkable, Swimable {

    @Override
    public void swim() {
        System.out.println("Swimming like a dog");
    }

    @Override
    public void walk() {
        System.out.println("Walking like a dog");
    }
}
