package students.darja_scavrovica.lesson_3.level_5.task_21_22;

class Dog {
    String name;
    String color;
    int age;

    Dog(String dogName,String dogColor,int dogAge)
    {this.name = dogName;this.color = dogColor;this.age= dogAge;}
    public void voice(){
        System.out.println("Dog name = " + name);
        System.out.println("Dog color = "+ color);
        System.out.println("Dog age = " + age);}

    public void changeColor(String newColor) {
            // напишите тут команду сохранения нового цвета в свойство класса
        System.out.println("Dog name = " + name);
        System.out.println("Dog new color = " + newColor);


    }
    String getDogName(){return this.name;}
    String getDogColor(){return this.color;}
    int getAge(){return this.age;}
}
