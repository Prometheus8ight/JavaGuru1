package students.kate_br.lesson_11.level_1.task_3;


import java.util.ArrayList;



class IntegerListDemo {

     public static void main(String[] args) {

         ArrayList<Integer> number = new ArrayList<>();

         number.add(0, 1);
         number.add(5);
         number.add(2);
         number.add(4);
         number.add(3);
         System.out.println("Size: " + number.size());

         number.remove(number.lastIndexOf(2));
         System.out.println("List: " + number.isEmpty());


         System.out.println(number);


     }
}
