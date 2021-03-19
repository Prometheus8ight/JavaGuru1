package main.java.students.julija_katukova.lesson_9.level_2.task_8;

//If we are allowed to make a class protected then we can access it inside the package very easily,
// but for accessing that class outside of the package we first need to extend that entity in which this class is defined which is its package.
//And since a package can not be extended (can be imported) defining a class protected will make it similar to defining it as default,
// which we can already do. So there is no benefit of defining a class protected.

class ProtectedClass {

    private String title;
    private String author;


}
