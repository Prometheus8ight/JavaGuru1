package students.rodion_afanasjev.lesson_8.level_2.task_7;

class Child extends Mother {

    String parentName;

    public Child(String name, int age, String parentName){
        super(name, age);
        this.parentName = parentName;
    }

    public static void main(String[] args) {

        Child child = new Child("Boris",10,"Marina");

    }

}

