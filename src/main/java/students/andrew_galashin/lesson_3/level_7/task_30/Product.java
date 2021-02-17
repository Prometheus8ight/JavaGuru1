package students.andrew_galashin.lesson_3.level_7.task_30;

class Product {
    String name;
    double regularPrice;
    double discount;

        Product(String prodName){
            this.name = prodName;
        }

            double actualPrice(){
            return regularPrice - (regularPrice * (discount/100));
            }

                void printInformation(){
                    System.out.println("Product: " + this.name);
                    System.out.println("Price without discount: " + this.discount);
                    System.out.println("Discount: " + this.discount);
                    System.out.println("Price with discount: " + actualPrice());
                }
}
