package students.darja_scavrovica.lesson_3.level_5.task_19_20;

 class Dog {
    String name;
    int age;

    Dog (String dogName,int dogAge){this.name= dogName;this.age = dogAge;}

 public void voice(){
       System.out.println("Dog name " + name);
        System.out.println("Dog age " + age);}
    public void happyBirthday (){
        age = age + 1;
        System.out.println("Dog name " + name);
        System.out.println("Dog age " +age);

    }

    String getDogName(){return this.name;}
    int getDogAge(){return this.age;}

}
