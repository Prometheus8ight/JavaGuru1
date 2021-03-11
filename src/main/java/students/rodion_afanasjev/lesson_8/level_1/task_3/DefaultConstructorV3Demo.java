package students.rodion_afanasjev.lesson_8.level_1.task_3;

class DefaultConstructorV3Demo {

    public static void main(String[] args) {

        DefaultConstructorV3 defaultConstructorV3 = new DefaultConstructorV3();

        System.out.println("String default value: " + defaultConstructorV3.getFullName());
        System.out.println("Integer default value: " + defaultConstructorV3.getAge());
        System.out.println("boolean default value: " + defaultConstructorV3.getMale());
        System.out.println("Boolean default value: " + defaultConstructorV3.getFemale());

    }

}
