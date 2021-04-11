package students.alex_kalashnikov.lesson_11.level_1.task_4;

import java.util.*;

class Lists {

    public static void main(String[] args) {

        List<String> arr = new ArrayList<>();
        arr.add("Java");
        arr.add("Java");
        System.out.println(Arrays.toString(arr.toArray()));

        List<Integer> linked = new LinkedList<>();
        linked.add(25);
        linked.add(25);
        System.out.println(Arrays.toString(linked.toArray()));

        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Java");
        hashMap.put(2, "Java");
        hashMap.put(1, "Java");
        System.out.println(hashMap.toString());

        Set<String> hashSet = new HashSet<>();
        hashSet.add("Java");
        hashSet.add("Python");
        hashSet.add("Java");
        System.out.println(hashSet.toString());

    }

}