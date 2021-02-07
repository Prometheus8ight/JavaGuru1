package students.julija_katukova.lesson_3.level_7.task_30;

class Product {
    String name;
    double regularPrice;
    double discount; //Скидка в процентах
    double newPrice;

    Product(String productName){
        this.name = productName;
        }

    double actualPrice () {
        this.newPrice = this.regularPrice - (this.regularPrice * (this.discount / 100.00)); //нужно поделить на 100, потомуу то скидка указывается в процентах
        return newPrice;
    }
    void printInformation () {
        System.out.println("Продукт: " + this.name);
        System.out.println("Цена без скидки: " + this.regularPrice);
        System.out.println("Скидка (%): " + this.discount);
        System.out.println("Цена со скидкой: " + this.newPrice);
        }
    }

