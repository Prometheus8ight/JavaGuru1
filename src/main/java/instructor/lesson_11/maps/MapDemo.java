package instructor.lesson_11.maps;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

    public static void main(String[] args) {

        Map<String, Integer> fruitQuantity = new HashMap<>();

        System.out.println(fruitQuantity);
        System.out.println("fruitQuantity.isEmpty() = " + fruitQuantity.isEmpty());

        fruitQuantity.put("apple", 3);
        fruitQuantity.put("banana", 2);
        fruitQuantity.put("orange", 4);
        fruitQuantity.put("kiwi", 1);
        fruitQuantity.put("pear", 1);
        fruitQuantity.put("apple", 40);

        fruitQuantity.replace("apple", 80);
        fruitQuantity.replace("pineapple", 123);

        fruitQuantity.remove("apple");

        System.out.println(fruitQuantity);
        System.out.println("fruitQuantity.isEmpty() = " + fruitQuantity.isEmpty());
        System.out.println("fruitQuantity.size() = " + fruitQuantity.size());

        System.out.println("fruitQuantity.get(\"banana\") = " + fruitQuantity.get("banana"));
        System.out.println("fruitQuantity.get(\"kiwi\") = " + fruitQuantity.get("kiwi"));

        System.out.println("fruitQuantity.keySet() = " + fruitQuantity.keySet());
        System.out.println("fruitQuantity.values() = " + fruitQuantity.values());

        System.out.println();

        fruitQuantity.clear();
        System.out.println("fruitQuantity.isEmpty() = " + fruitQuantity.isEmpty());
        System.out.println("fruitQuantity.size() = " + fruitQuantity.size());
    }
}
