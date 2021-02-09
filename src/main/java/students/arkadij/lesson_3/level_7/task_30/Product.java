package students.arkadij.lesson_3.level_7.task_30;

class Product {

    String productName;
    double regularPrice;
    double discount;
    double actualPrice;
    double sup;

    public Product(String productName, double regularPrice, double discount){
        this.productName = productName;
        this.regularPrice = regularPrice;
        this.discount = discount;
    }

    public String getProductName(){
        return productName;
    }

    public void realPrice() {
        sup = 100 - discount;
        actualPrice = (sup * regularPrice)/100;
    }

    public void printInformation(){
        System.out.println("We are going to look at a discount of one interesting product called: " + productName);
        System.out.println("Regular product price: " + regularPrice + "$");
        System.out.println("The discount rate for this product: " + discount + "%");
        System.out.println("Actual price after discount: " + actualPrice);
        System.out.println("You'll save " + (regularPrice - actualPrice) + "$ off that discount.");    }

}
