package students.darja_scavrovica.lesson_4.level_6.task_23;

import java.util.Objects;

class LeapYearTest {
    public static void main(String[] args) {
     LeapYearTest leapYearTest = new LeapYearTest();
     leapYearTest.LeapYear();
      }

  public void LeapYear() {
      int year = 2021;
      boolean expectedResult = false;
      LeapYear leapYear = new LeapYear();
      boolean realResult = leapYear.isLeapYear(year);
      check(realResult,expectedResult,"NoLeapYear");

      year = 2020;
      expectedResult = true;
      realResult = leapYear.isLeapYear(year);
      check(realResult,expectedResult,"LeapYear");

      year = 2021;
       expectedResult = true;
       realResult = leapYear.isLeapYear(year);
      check(realResult,expectedResult,"alsoALeapYear");
  }
  public void check(boolean realResult,boolean expectedResult, String testName ){
      if(Objects.equals(realResult, expectedResult)){
          System.out.println(testName + " = TRUE");
      }else System.out.println(testName + " = FALSE");
  }
}