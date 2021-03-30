package students.vitaly_porsev.lesson_10.level_7.task_27;

interface ArrayUtil {

    boolean addComponent(Component component); // Adding object and making new length

    Component deleteComponentByIndex(int index); //Deleting object by index in the array

    public boolean findObjectInArray(Component component); //Find if there is specified object in the array

    void deleteAllComponents(); // Deletes all components from the array

    int findArrayLength(); //Method checks how much objects there is in the array.

}
