package students.arkadij.lesson_5.task_31;

class Arrays {

    public int[] create(int length){
        return new int[length];
    }

    public static void main(String[] args) {
        Arrays method = new Arrays();
        int[] num = method.create(5);
        System.out.println(java.util.Arrays.toString(num));
    }

}
