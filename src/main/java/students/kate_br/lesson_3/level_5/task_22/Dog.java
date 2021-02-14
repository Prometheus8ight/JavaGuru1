package students.kate_br.lesson_3.level_5.task_22;

 class Dog {

     String name;
     String color;



     Dog (String dogName, String dogColor){
         this.name = dogName;
         this.color = dogColor;



     }

     void voice(){

         System.out.println("This is a dog");
         System.out.println("The dog name is " + this.name + " and she is a " + this.color);
     }

     void changeColor(String newColor){

         this.color = newColor;

         System.out.println("When " + this.name + " was a puppy she was a " + this.color + " color dog");
     }


}
