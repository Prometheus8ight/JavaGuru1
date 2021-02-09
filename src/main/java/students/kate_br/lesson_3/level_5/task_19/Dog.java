package students.kate_br.lesson_3.level_5.task_19;

 class Dog {

     String name;
     int age;

     Dog(String name, int age){
         this.age = age;
         this.name = name;

     }

     void voice(){
         System.out.println("Dog name is " + this.name);
         System.out.println("The dog is " + this.age + " years old");
     }

}
