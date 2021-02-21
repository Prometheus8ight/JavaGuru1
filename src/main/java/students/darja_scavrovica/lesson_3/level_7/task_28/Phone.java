package students.darja_scavrovica.lesson_3.level_7.task_28;

class Phone {
    String model;
    String color;
    int age;
    int battery;

    Phone (String model,int age,String color,int battery)
    {this.model= model;this.age = age;this.color = color;this.battery = battery; }

    public void voice(){
        System.out.println("Phone model " + model);
        System.out.println("Phone age " + age);
        System.out.println("Phone color " + color);

        System.out.println("Phone battery  " + battery+ "%");
    }
    public void phBattery (){
        System.out.println("Phone battery after 5 minutes " +(battery - 6 )+"%");

    }

    String getModel(){return this.model;}
    int getAge(){return this.age;}
    String getColor(){return this.color;}
    int getBattery(){return this.battery;}
}
