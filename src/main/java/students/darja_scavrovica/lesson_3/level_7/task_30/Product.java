package students.darja_scavrovica.lesson_3.level_7.task_30;

class Product {
    String name;
    double regularPrice;
    double discount;

    Product(String name)
    {this.name=name;}

    public void printInformation(){
        System.out.println("product name = "+ name+ "    product price = "+ regularPrice+" euro");
        System.out.println("discount = "+ discount+"%"+ "   summa = " +(regularPrice- (regularPrice*discount/100))+" euro");
    }

   String getName(){return this.name;}

}
