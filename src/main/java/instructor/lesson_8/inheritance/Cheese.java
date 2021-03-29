package instructor.lesson_8.inheritance;

class Cheese extends Product {

    String type;
    String color;
    String shape;

    @Override
    public String toString() {
        return "Cheese{" +
                "type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", shape='" + shape + '\'' +
                ", product='" + super.toString() + '\'' +
                '}';
    }
}
