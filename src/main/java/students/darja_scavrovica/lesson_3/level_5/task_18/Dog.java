package students.darja_scavrovica.lesson_3.level_5.task_18;

class Dog {
    String dogName;

    Dog(String name){this.dogName = name;}


    public void voice() {
        System.out.println(dogName+ " " + dogName+ " "  +  dogName);


    }

    String getDog() {
        return this.dogName;
    }


}
