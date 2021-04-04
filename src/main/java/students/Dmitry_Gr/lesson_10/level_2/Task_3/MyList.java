package students.Dmitry_Gr.lesson_10.level_2.Task_3;

public interface MyList {
    
    void addComponent(Object obj); // Adding component and making new length

    void deleteComponentByIndex(int index); //Deleting component by index in the array

    void sortComponents(); //Method sorts array

    void deleteAllComponents(); // Deletes all components from the array

    boolean checkIsArrayEmpty(); //Method checks is array empty or not.

}
