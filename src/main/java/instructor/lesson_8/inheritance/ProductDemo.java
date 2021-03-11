package instructor.lesson_8.inheritance;

class ProductDemo {

    public static void main(String[] args) {

        Cheese cheese = new Cheese();
        cheese.expired = true;

        Milk milk = new Milk();

        Bread bread = new Bread();

        Product product = new Product();
        System.out.println(product.toString());

        System.out.println(cheese.toString());

    }
}
