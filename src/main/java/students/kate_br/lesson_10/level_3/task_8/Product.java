package students.kate_br.lesson_10.level_3.task_8;

 class Product {

     private String title;

     public Product(String title) {
         this.title = title;
     }

     public String getTitle() {
         return title;
     }

     @Override
     public String toString() {
         return "Product{" +
                 "title='" + title + '\'' +
                 '}';
     }
 }
