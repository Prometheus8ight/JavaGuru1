package students.rodion_afanasjev.lesson_12.level_3.task_20;

class MultiCatchExample {

    public static void main(String[] args) {

        int numOne = 10;
        int numTwo = 0;

        try {
            int sum = numOne / numTwo;
            System.out.println(sum);
        } catch (ArithmeticException a) {
            System.out.println("Can't divide by zero!");
        } catch (Exception e) {
            System.out.println("Error!");
        }
    }
}

// Если оставить Exception e первым то он словит все ошибки
// Поэтому мы ArithmeticException a двигаем наверх, что бы словить арифметическую ошибку первой
