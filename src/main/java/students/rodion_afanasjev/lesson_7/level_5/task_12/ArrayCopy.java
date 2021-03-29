package students.rodion_afanasjev.lesson_7.level_5.task_12;

class ArrayCopy {

    int[] copyInRange(int[] in, int numberFrom, int numberTo){
        int count = 0;
        int[] newArray = new int[findInRange(in,numberFrom,numberTo)];
        for ( int i : in){
            if (i >= numberFrom && i <= numberTo){
                newArray[count] = i;
                count++;
            }
        }
        return newArray;
    }

    private int findInRange(int[] array,int numberFrom,int numberTo){
        int count = 0;
        for(int i : array){
            if (i >= numberFrom && i <= numberTo){
                count++;
            }
        }
        return count;
    }

}
