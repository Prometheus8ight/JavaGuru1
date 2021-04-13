package students.alex_kalashnikov.lesson_12.level_3.task_18;

class NullPointerExceptionDemo {

    public static void main(String[] args) {

        String[] arr = new String[5];
        System.out.println(arr[3].toLowerCase());
        /*
        NullPointerException происходит, когда
        метод использует ссылку на объект, значение
        которого null.
         */

    }

}