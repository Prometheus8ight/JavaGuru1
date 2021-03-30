package students.vitaly_porsev.lesson_10.level_7.task_26;

interface ArrayUtil {

    void addComponent(Component obj); // Adding component and making new length

    Component[] deleteComponentByIndex(int index); //Deleting component by index in the array

    Component[] sortComponentsByNumber(); //Method sorts array

    Component[] deleteAllComponents(); // Deletes all components from the array

    boolean checkIsArrayEmpty(); //Method checks is array empty or not.

}
