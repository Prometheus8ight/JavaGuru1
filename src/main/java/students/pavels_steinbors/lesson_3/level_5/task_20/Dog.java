package students.pavels_steinbors.lesson_3.level_5.task_20;

class Dog {

    String name;
    int age = 4;
    int b = age + 1;

    Dog(String dogsName) {
        this.name = dogsName;
    }

    String voice = "Roy, Roy, Roy";


    public void sayYourName() {
        System.out.println("Dog's name is: " + this.name);
    }
    public void voice() {
        System.out.println("Voice: " + voice);
    }
    public void howOldAreYou() {
        System.out.println("Dog's age is: " + age);
    }
    public void happyBirthday() {
        System.out.println("Happy Birthday, Roy! Now you are " + b);
    }


}
