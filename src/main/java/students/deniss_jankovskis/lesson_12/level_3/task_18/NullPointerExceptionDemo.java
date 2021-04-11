package students.deniss_jankovskis.lesson_12.level_3.task_18;

class NullPointerExceptionDemo {

    public static void main(String[] args) {

        String foo = null;
        int length = foo.length();
    }

    //попытаемся запустить метод length() по ссылке null, это вызовет NullPointerException.
}

