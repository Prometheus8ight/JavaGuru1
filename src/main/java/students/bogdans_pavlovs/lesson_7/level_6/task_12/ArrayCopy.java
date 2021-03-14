package students.bogdans_pavlovs.lesson_7.level_6.task_12;

class ArrayCopy {

    int[] copyInRange(int[] in, int numberFrom, int numberTo){

        //Размер выходного массива должен быть равен количеству элементов в нём
        int[] newArray = new int[newArrayLength(in, numberFrom, numberTo)];

        //вернуть новый массив, который содержит только те числа, которые больше или равны numberFrom и меньше или равны numberTo.

        int j = 0;

        for (int i = 0; i < in.length; i++){

            if (in[i] >= numberFrom && in[i] <= numberTo){

                newArray[j] = in[i];
                j++;

            }

        }

        return newArray;

    }

    //Размер выходного массива должен быть равен количеству элементов в нём
    private int newArrayLength (int[] in, int numberFrom, int numberTo){

        int length = 0;

        for(int i = 0; i < in.length; i++){

            if (in[i] >= numberFrom && in[i] <= numberTo){

                length++;
            }
        }
        return length;
    }


}
