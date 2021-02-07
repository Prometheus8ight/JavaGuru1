package students.kate_br.lesson_3.level_5.task_19;

 class Dog {

     int age = 4;

     Dog(int dogAge){
         this.age = dogAge;

     }

     void voice(String name){
         System.out.println("Dog name is " + name);
         System.out.println("The dog is " + this.age + " years old");
     }

}
