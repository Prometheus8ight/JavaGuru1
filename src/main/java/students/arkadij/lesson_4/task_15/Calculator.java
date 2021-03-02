package students.arkadij.lesson_4.task_15;

class Calculator {

    public int maxOfThree(int a, int b, int c){
        if (a>b && a>c){
            return a;
        } else if (b>a && b>c){
            return b;
        } else if (c>a && c>b){
            return c;
        } else if (a==b && a>c){
            return a;
        } else if (a==b && a<c){
            return c;
        } else if (a==c && a>b){
            return a;
        } else if (a==c && a<b){
            return a;
        } else if (b==c && a>b){
            return a;
        } else if (b==c && a<b){
            return b;
        } else if (a==b && b==c){
            return a;
        } else {
            return a;
        }
    }

}
