package students.alex_kalashnikov.lesson_3.level_7.task_30;

class Product {

    String name;
    double regularPrice;
    double discount;

    Product(String name) {
        this.name = name;
         }

    double actualPrice() {
        double result = regularPrice * (1 - discount / 100);
        return result;
    }

    void printInformation() {

        System.out.println(name + ": цена:" + regularPrice + "; скидка:" + discount + "; чистая цена:" + actualPrice() + ";");

    }


}



