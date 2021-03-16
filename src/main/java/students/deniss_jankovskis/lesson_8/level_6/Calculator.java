package students.deniss_jankovskis.lesson_8.level_6;

class Calculator {

    public int add(int ... num) { //{3,7,10,25,64}
        int sum = 0;
        for (int i : num) {
            sum += i;
        }
        return sum;
    }

}
