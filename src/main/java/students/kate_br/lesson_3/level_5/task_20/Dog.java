package students.kate_br.lesson_3.level_5.task_20;

 class Dog {

     String name;
     int age;

     Dog(String dogName, int dogAge) {

         this.name = dogName;
         this.age = dogAge;
     }


     void voice() {

         System.out.println("This is " + this.name);
         System.out.println(this.name + " is " + this.age + " years old");


     }

     void happyBirthday() {

         this.age = this.age + 1;

         System.out.println("Happy Birthday, " + name);
         System.out.println("Today you are " + (this.age + 1) + " years old");
         System.out.println("Congratulations, good girl!");

     }
 }