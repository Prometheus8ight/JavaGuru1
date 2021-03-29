package students.bogdans_pavlovs.lesson_8.level_6;

class Varargs {

    int calculateSum (int ... z){

        int sum = 0;
        for (int a : z){
            sum = sum + a;
        }
        return sum;
    }
}
