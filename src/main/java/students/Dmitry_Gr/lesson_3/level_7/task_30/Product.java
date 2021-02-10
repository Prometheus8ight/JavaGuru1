package students.Dmitry_Gr.lesson_3.level_7.task_30;

class Product {

    String name;
    double regularPrice;
    double discount;

    Product(String name){
        this.name = name;
    }

    double actualPrice() { return regularPrice - regularPrice * discount; }

    void printInformation (){

        System.out.println("Product Name: " + name);
        System.out.println("Regular Price: " + regularPrice);
        System.out.println("Discount: " + discount * 100 + "%");
        System.out.println("Actual Price: " + actualPrice());

    }


}
