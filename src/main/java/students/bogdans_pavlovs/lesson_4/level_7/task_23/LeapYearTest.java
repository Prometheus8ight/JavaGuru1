package students.bogdans_pavlovs.lesson_4.level_7.task_23;

//Создать класс для тестов LeapYearTest
//и покрыть тестами весь функционал класса LeapYear.

class LeapYearTest {

    public static void main(String[] args) {

        LeapYearTest leapYearTest = new LeapYearTest();

        leapYearTest.test1();
        leapYearTest.test2();
        leapYearTest.test3();
        leapYearTest.test4();

    }

    public void test1(){

        LeapYear leapYearTest = new LeapYear();

        boolean realResult = leapYearTest.isLeapYear(6);

        if (!realResult){
            System.out.println("Test 1 = OK");
        } else {
            System.out.println("Test 1 = FAIL");
        }

    }

    public void test2(){

        LeapYear leapYearTest = new LeapYear();

        boolean realResult = leapYearTest.isLeapYear(4);

        if (realResult){
            System.out.println("Test 2 = OK");
        } else {
            System.out.println("Test 2 = FAIL");
        }
    }

    public void test3(){

        LeapYear leapYearTest = new LeapYear();

        boolean realResult = leapYearTest.isLeapYear(100);

        if (!realResult){
            System.out.println("Test 3 = OK");
        } else {
            System.out.println("Test 3 = FAIL");
        }
    }

    public void test4(){

        LeapYear leapYearTest = new LeapYear();

        boolean realResult = leapYearTest.isLeapYear(400);

        if (realResult){
            System.out.println("Test 4 = OK");
        } else {
            System.out.println("Test 4 = FAIL");
        }
    }




}

