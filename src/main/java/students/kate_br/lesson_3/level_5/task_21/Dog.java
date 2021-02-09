package students.kate_br.lesson_3.level_5.task_21;

 class Dog {

     String name;
     String color;
     int age;

     Dog(String dogName, String dogColor, int dogAge){

         this.name = dogName;
         this.age = dogAge;
         this.color = dogColor;
     }


     void voice(){

         System.out.println("This is " + this.name + " and she is a dog");
         System.out.println(this.name + " is " + this.age + " years old");
         System.out.println("She is a " + this.color + " dog");
     }
}
