package students.kate_br.lesson_9.level_2.task_10;

 class ConstructorChaining {

     private String constructorName;
     private int parameterCount;


     public ConstructorChaining(String constructorName) {
         this.constructorName = constructorName;
     }

     public ConstructorChaining(String constructorName, int parameterCount) {
         this("Constructor");
         this.constructorName = constructorName;
         this.parameterCount = parameterCount;
     }
 }
