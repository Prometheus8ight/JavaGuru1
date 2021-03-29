package instructor.lesson_8.inheritance;

public class Product {

    private int weight;
    protected int calories;
    boolean expired;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Product{" +
                "weight=" + weight +
                ", calories=" + calories +
                ", expired=" + expired +
                '}';
    }

    final public void printInfo() {
        System.out.println("weight = " + weight);
        System.out.println("calories = " + calories);
        System.out.println("expired = " + expired);
    }
}
