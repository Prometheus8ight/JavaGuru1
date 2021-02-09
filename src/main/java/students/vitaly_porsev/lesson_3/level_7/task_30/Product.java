package students.vitaly_porsev.lesson_3.level_7.task_30;

class Product {
    String name;
    double regulaPrice;
    double discount;

    public Product(String name) {
        this.name = name;
    }

    public void setRegulaPrice(double regulaPrice) {
        this.regulaPrice = regulaPrice;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    double actualPrice() {
        return this.regulaPrice - (this.regulaPrice / 100) * this.discount;
    }

    void printInformation() {
        System.out.println("Имя продукта: " + this.name + ". Цена продукта: " + this.regulaPrice);
        System.out.println("Имя продукта: " + this.name + ". Цена продукта со скидкой: " + actualPrice());
    }
}
