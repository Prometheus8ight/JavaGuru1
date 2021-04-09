package students.vitaly_porsev.lesson_12.level_3.task_18;

public class NullPointer {
    public static void main(String[] args) {
        Object obj = null;
        obj.hashCode();

        //Мы пытаемся узнаь хэш-код обьекта, но так как обьект - null, у нас вылетает ошибка "NullPointerException".
    }
}
