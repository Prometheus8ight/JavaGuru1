package students.julija_katukova.lesson_10.level_7.task_27;

import java.util.LinkedList;

class MyListImplUsingLinkedList implements MyList {

    LinkedList<Object> objects = new LinkedList<>();

    public LinkedList<Object> getObjects() {
        return objects;
    }

    @Override
    public void addNewElement(Object object) {
        objects.add(object);
    }

    @Override
    public void deleteElement(Object object) {
        objects.remove(object);
    }

    @Override
    public void sortElements() {
        objects.sort(new ObjectComparator());
    }

    @Override
    public void clear() {
        objects.clear();
    }

    @Override
    public boolean contains(Object object) {
        return objects.contains(object);
    }
}
