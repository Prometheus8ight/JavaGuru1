package instructor.lesson_10.strategy;

class Penguin implements Walkable, Swimable {

    @Override
    public void swim() {
        System.out.println("Swimming like penguin");
    }

    @Override
    public void walk() {
        System.out.println("Walking like penguin");
    }
}
