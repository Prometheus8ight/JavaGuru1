package students.julija_katukova.lesson_10.level_7.task_26;

import java.util.Arrays;

class Array implements MyList {

    private Object[] objects = new Object[0];

    @Override
    public void addNewElement(Object object) {
        addNewElementToArray(object);
    }

    @Override
    public void deleteElement(Object object) {
        deleteElementFromArray(object);
    }

    @Override
    public void sortElements() {
        Arrays.sort(objects, new ObjectComparator());
    }

    @Override
    public void clear() {
        this.objects = new Object[0];
    }

    @Override
    public boolean contains(Object object) {
        return isElementInArray(object);
    }

    public Object[] getObjects() {
        return objects;
    }

    private void addNewElementToArray(Object object) {
        this.objects = extendArray();
        addNewElementInfoToArray(object);
    }

    private Object[] extendArray() {
        Object[] out = new Object[objects.length + 1];
        System.arraycopy(objects, 0, out, 0, objects.length);
        return out;
    }

    private void addNewElementInfoToArray(Object object) {
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
            if (i < emptyElementIndex()) {
                out[i] = objects[i];
            } else {
                out[i] = objects[i + 1];
            }
        }
        return out;
    }

    private int emptyElementIndex() {
        int emptyElementIndex = 0;
        for (int i = 0; i < objects.length; i++) {
            if (objects[i] == null) {
                emptyElementIndex = i;
            }
        }
        return emptyElementIndex;
    }

    private boolean isElementInArray(Object object) {
        for (Object value : objects) {
            if (value.equals(object)) {
                return true;
            }
        }
        return false;
    }
}
