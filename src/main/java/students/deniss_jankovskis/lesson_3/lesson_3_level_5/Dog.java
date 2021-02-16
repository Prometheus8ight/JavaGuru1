package students.deniss_jankovskis.lesson_3.lesson_3_level_5;

class Dog {

    String name;
    String color;
    int age;

    Dog(String name, int age) {
        this.name = name;
        this.age = age;

        System.out.println(this.name);
        System.out.println(this.age);

    }

    void setVoice() {
        System.out.println("Гав-гав");

    }

    void happyBirthday() {
        this.age = this.age + 1;

        System.out.println(4 + 1);
    }


    void yourColor(String setColor) {
        this.color = setColor;
        System.out.println(this.color);
    }

    void voice() {
        System.out.println("Гав-гав-гав");
    }




    void changeColor(String newColor) {
        this.color = newColor;
        System.out.println(this.color);
    }
}
