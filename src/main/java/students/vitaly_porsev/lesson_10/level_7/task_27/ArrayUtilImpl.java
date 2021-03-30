package students.vitaly_porsev.lesson_10.level_7.task_27;

import java.util.LinkedList;

class ArrayUtilImpl implements ArrayUtil{

    LinkedList<Component> obj = new LinkedList<>();

    public boolean addComponent(Component component){
       return obj.add(component);
    }

    @Override
    public Component deleteComponentByIndex(int index) {
        return obj.remove(index);
    }

    @Override
    public boolean findObjectInArray(Component component) {
        return obj.contains(component);
    }

    @Override
    public void deleteAllComponents() {
        obj.clear();
    }

    @Override
    public int findArrayLength() {
        return obj.size();
    }

    public LinkedList<Component> getObj() {
        return obj;
    }
}
