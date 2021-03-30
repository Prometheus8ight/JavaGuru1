package students.vitaly_porsev.lesson_10.level_7.task_26;

public class ArrayUtilImpl implements ArrayUtil {

    private Component[] obj = new Component[0];

    @Override
    public void addComponent(Component obj) {
        this.obj = copyArrayAndMakeNewLength();
        this.obj[this.obj.length - 1] = obj;
    }

    private Component[] copyArrayAndMakeNewLength() {
        Component[] newObj = new Component[obj.length + 1];
        if (obj.length == 0) {
            return newObj;
        } else {
            for (int i = 0; i < obj.length; i++) {
                newObj[i] = obj[i];
            }
        }
        return newObj;
    }

    @Override
    public Component[] deleteComponentByIndex(int index) {
        Component[] newObjArray = new Component[obj.length - 1];
        for (int i = 0; i < newObjArray.length; i++) {
            if (i == index) {
                for (int j = i; j < newObjArray.length; j++) {
                    newObjArray[j] = obj[j + 1];
                }
                return obj = newObjArray;
            }
            newObjArray[i] = obj[i];
        }
        return obj;
    }

    @Override
    public Component[] sortComponentsByNumber() {
        Component temp = null;
        Component[] newArray = new Component[obj.length];
        for (int i = 0; i < obj.length; i++) {
            for (int j = i + 1; j < obj.length; j++) {
                newArray[i] = obj[i];
                if (obj[i].getNumber() > obj[j].getNumber()) {
                    temp = obj[i];
                    obj[i] = obj[j];
                    obj[j] = temp;
                }
            }
        }
        return newArray;
    }

    @Override
    public Component[] deleteAllComponents() {
        return obj = new Component[0];
    }

    @Override
    public boolean checkIsArrayEmpty() {
        return obj.length == 0;
    }

    public Component[] getObj() {
        return obj;
    }
}
