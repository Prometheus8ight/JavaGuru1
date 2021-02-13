package students.julija_katukova.lesson_3.level_7.task_30;

class Product {
    String name;
    double regularPrice;
    double discount; //Скидка в процентах

    Product(String productName){
        this.name = productName;
        }

    double actualPrice () {
        return regularPrice - (regularPrice * (discount / 100.00)); //нужно поделить на 100, потомуу то скидка указывается в процентах

    }
    void printInformation () {
        System.out.println("Продукт: " + this.name);
        System.out.println("Цена без скидки: " + this.regularPrice);
        System.out.println("Скидка (%): " + this.discount);
        System.out.println("Цена со скидкой: " + actualPrice());
        }
    }

