package students.bogdans_pavlovs.lesson_3.level_5.task_20;

class Dog {

    String name;
    int age;


    void voice(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " Years");
    }

    void happyBirthday(){
        age++;
    }

}
