package students.deniss_jankovskis.lesson_10.task_26;

import java.util.Arrays;

class Array implements MyList {

    private Object[] objects = new Object[0];

    @Override
    public boolean isEmpty(Object obj) {
        return elementInArray(obj);
    }

    @Override
    public void add(Object obj) {
        addElementInArray(obj);

    }

    @Override
    public void delete(Object obj) {
        deleteElementFromArray(obj);

    }

    @Override
    public void sort() {
        Arrays.sort(objects, new ObjectComparator());
    }

    public Object[] getObjects() {
        return objects;
    }

    private Object[] extendArray() {
        Object[] newArray = new Object[objects.length + 1];
        for (int i = 0; i < objects.length; ++i) {
            newArray[i] = objects[i];
        }
        objects = newArray;

        return newArray;
    }

    private void addElementInArray(Object obj) {
        this.objects = extendArray();
        addElementInfoInArray(obj);
    }

    private void addElementInfoInArray(Object object) {
        objects[objects.length - 1] = object;
    }

    private void deleteElementFromArray(Object object) {
        deleteObjectInfoFromArray(object);
        this.objects = deleteEmptyElement();

    }

    private void deleteObjectInfoFromArray(Object object) {
        for (int i = 0; i < objects.length; i++) {
            if (objects[i].equals(object)) {
                objects[i] = null;
            }
        }
    }

    private Object[] deleteEmptyElement() {
        Object[] out = new Object[objects.length - 1];
        for (int i = 0; i < objects.length - 1; i++) {
            if (i < emptyElement()) {
                out[i] = objects[i];
            } else {
                out[i] = objects[i + 1];
            }
        }
        return out;
    }

    private int emptyElement() {
        int emptyElement = 0;
        for (int i = 0; i < objects.length; i++) {
            if (objects[i] == null) {
                emptyElement = i;
            }
        }
        return emptyElement;
    }

    private boolean elementInArray(Object obj) {
        for (Object value : objects) {
            if (value.equals(obj)) {
                return true;
            }
        }
        return false;
    }
}
